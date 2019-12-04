package momatools.gui.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.ProducerCallback;

import com.thoughtworks.xstream.XStream;

import gnf.sender.SenderService;
import gnf.sender.init.Entornos;
import momatools.model.creation.Body;
import momatools.model.creation.BodyOOEE;
import momatools.model.creation.Order;
import momatools.model.creation.OrderOOEE;
import momatools.model.creation.Traza0;
import momatools.model.creation.Traza0OOEE;
import regularizacion.persistence.service.TraceService;

/**
 * TODO hacer una interfaz para esta funcionalidad, por el momento en
 * ordenesAsString va un listado separado con coma que es el que se va a buscar
 * en el entorno de origen e intentar enviar cada una de las creaciones al
 * entorno destino. Ahora mismo esta configurado de forma que por defecto el listado de
 * ordenes se recoge de pro y se envia a pro, 
 * pero se sobreescribe con los argumentos con los que se llame
 * tambien tiene un boolean si se desea que se elimine el codigo de la orden vinculada, si por ejemplo ya no existe(sucede mucho en pro que ya esta finalizada)
 * @author l.lorenzoriesco
 *
 */
public class CreacionFromTrace extends JFrame {
	private static final Logger LOGGER = Logger.getLogger(CreacionFromTrace.class);
	private static final long serialVersionUID = 1L;
	private static ClassPathXmlApplicationContext context;
	private static SenderService sender;
	// valores por defecto de donde se buscan las ordenes y donde se intentan
	// crear
	private static final Entornos DEFAULT_ENVIRONMENT_ORIGEN = Entornos.PRODUCCION;
	private static final Entornos DEFAULT_ENVIRONMENT_DESTINO = Entornos.INTEGRACION;
	// si da un error de vinculada al crear, hay que poner a true para que borre
	// el dato de vinculada del XML antes de enviarlo
	private static final boolean BORRAR_VINCULADA_DEFAULT = false;

	public static void main(String[] args) {
		// cada argumento que se recibe sobreescribe por orden uno de los
		// siguentes

		// listado de ids de ordenes separados por comas, vaciar tras cada uso
		String ordenesAsString = "5674150";
		Entornos envSelOrigen = DEFAULT_ENVIRONMENT_ORIGEN;
		Entornos envSelDestino = DEFAULT_ENVIRONMENT_DESTINO;
		boolean borrarVinculada = BORRAR_VINCULADA_DEFAULT;

		String contextoAplicacion = null;

		if (args.length > 0 && args[0] != null) {
			ordenesAsString = args[0];
		}
		// si hay un segundo argumento es el entorno origen
		if (args.length > 1 && args[1] != null) {
			envSelOrigen = Entornos.fromString(args[1]);
		}
		// si hay un tercer argumento es el entorno destino
		if (args.length > 2 && args[2] != null) {
			envSelDestino = Entornos.fromString(args[2]);
		}
		// si hay un cuarto argumento es para borrar o no la vinculada
		if (args.length > 3 && args[3] != null) {
			borrarVinculada = Boolean.getBoolean(args[3]);
		}

		switch (envSelOrigen) {
		case PRODUCCION:
			contextoAplicacion = "applicationContextProd.xml";
			break;
		case DESARROLLO:
			contextoAplicacion = "applicationContextDesa.xml";
			break;

		default:
			System.out.println("Error opcion no soportada");
			System.exit(1);
		}
		// cargo el sender en funcion del entorno
		System.setProperty("ADA_GLOBAL_PROPERTIES", "C:/workspace/ADAconfig");
		context = new ClassPathXmlApplicationContext(envSelDestino.getRutaSender());
		sender = (SenderService) context.getBean("resSenderService");

		List<String> listaOrdenes = new ArrayList<String>();
		listaOrdenes.addAll(Arrays.asList(ordenesAsString.split(",")));
		LOGGER.info("Ordenes a procesar: " + listaOrdenes.size());

		ConfigurableApplicationContext contextBBDD = null;
		try {

			contextBBDD = new ClassPathXmlApplicationContext(contextoAplicacion);

			TraceService traceService = (TraceService) contextBBDD.getBean("traceService");
			Map<String, String> mapaOrdenes = traceService.getTrazaCreacionByOrders(listaOrdenes);

			// cargamos la orden con los datos del XML de entrada
			XStream xStream = new XStream();
			// Estas por aqui, digerir el xml en un cierto elemento
			xStream.ignoreUnknownElements();
			xStream.autodetectAnnotations(true);
			xStream.alias("Envelope", Traza0.class);
			Set<String> ordenesEncontradas = mapaOrdenes.keySet();
			LOGGER.info("Ordenes encontradas en traza: " + ordenesEncontradas.size());
			for (String idOrden : ordenesEncontradas) {
				Traza0 traza0 = null;
				Traza0OOEE traza0OOEE = null;
				if(envSelOrigen.equals(Entornos.PRODUCCION) || envSelOrigen.equals(Entornos.INTEGRACION) || envSelOrigen.equals(Entornos.DESARROLLO)){
					traza0 = (Traza0) xStream.fromXML(mapaOrdenes.get(idOrden));
				}else{
					traza0OOEE = (Traza0OOEE) xStream.fromXML(mapaOrdenes.get(idOrden));
				}
								
				LOGGER.trace("El xml de entrada es:\n" + xStream.toXML(traza0));
				Order ordenCreacion = null;
				OrderOOEE ordenCreacionOOEE = null;
				if(envSelOrigen.equals(Entornos.PRODUCCION) || envSelOrigen.equals(Entornos.INTEGRACION) || envSelOrigen.equals(Entornos.DESARROLLO)){
					ordenCreacion = new Order();
				}else{
					ordenCreacionOOEE = new OrderOOEE();
				}
				
				Body bodyOrden = new Body();
				BodyOOEE bodyOrdenOOEE = new BodyOOEE();
				if(envSelOrigen.equals(Entornos.DESARROLLOOOEE) || envSelOrigen.equals(Entornos.TESTOOEE) || envSelOrigen.equals(Entornos.INTEGRACIONOOEE) || envSelOrigen.equals(Entornos.PRODUCCIONOOEE)){

					bodyOrdenOOEE.setCreation(traza0OOEE.getBody().getEtapa00().getPeticion().getCreation());
					// es una creacion
					ordenCreacionOOEE.setId("MOBILE0000200102");
					ordenCreacionOOEE.setBody(bodyOrdenOOEE);
					LOGGER.trace("El xml a enviar es:\n" + xStream.toXML(ordenCreacionOOEE));
					sender.send(xStream.toXML(ordenCreacionOOEE));
					LOGGER.info("Enviada orden: " + idOrden + " desde " + envSelOrigen + " hacia " + envSelDestino);
				}else{
					bodyOrden.setCreation(traza0.getBody().getEtapa00().getPeticion().getCreation());
					if (borrarVinculada) {
						bodyOrden.getCreation().setNroOrdenVinculada("");
					}
					// es una creacion
					ordenCreacion.setId("MOBILE0000200102");
					ordenCreacion.setBody(bodyOrden);
					LOGGER.trace("El xml a enviar es:\n" + xStream.toXML(ordenCreacion));
					sender.send(xStream.toXML(ordenCreacion));
					LOGGER.info("Enviada orden: " + idOrden + " desde " + envSelOrigen + " hacia " + envSelDestino);
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (contextBBDD != null) {
				contextBBDD.close();
			}
		}

	}
}
