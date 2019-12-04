package gnf.sender.init;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thoughtworks.xstream.XStream;

import gnf.sender.SenderService;
import gnf.sender.SenderServiceEl;
import momatools.gui.tabs.TabSimulacionOrdenes;
import momatools.model.creation.Aviso;
import momatools.model.creation.Avisos;
import momatools.model.creation.EquipoOOEE;
import momatools.model.creation.Order;
import momatools.model.creation.OrderDetails;
import momatools.model.creation.OrderDetailsOOEE;
import momatools.model.creation.OrderOOEE;
import momatools.model.creation.Suministro;

/**
 * Clase que carga una configuracion con el destino y envia un cierto xml a ese destino
 * dicho xml puede o no ser modificado antes del envio 
 * @author l.lorenzoriesco
 *
 */



public class SenderHelper {

	private static final Logger LOGGER = Logger.getLogger(SenderHelper.class);
	private SenderService sender;
	private SenderServiceEl senderEl;
	private ClassPathXmlApplicationContext context;
	private Order orderToSend=null;
	private OrderOOEE orderToSendOOEE=null;
	private XStream xStream;
	private Entornos entornoSel;

	public SenderHelper(Entornos entornoSel) {
		//cargo el sender en funcion del entorno
//		System.setProperty("ADA_GLOBAL_PROPERTIES", "C:/workspace/ADAconfig");
		System.setProperty("ADA_GLOBAL_PROPERTIES", "C:\\apps\\MomaWeb\\config");
		this.entornoSel = entornoSel;
		context = new ClassPathXmlApplicationContext(entornoSel.getRutaSender());	
		if(entornoSel.equals(Entornos.DESARROLLOOOEE) || entornoSel.equals(Entornos.TESTOOEE) || entornoSel.equals(Entornos.INTEGRACIONOOEE) || entornoSel.equals(Entornos.PRODUCCIONOOEE)){
			senderEl = (SenderServiceEl) context.getBean("resSenderServiceEl");			
		}else{
			sender = (SenderService) context.getBean("resSenderService");
		}
		
		
	}
	

	public boolean send(String rutaCreacion, Map<String, String> mapaCambios,String tipoLLamada) {
		String toSend=null;
		
		if(mapaCambios==null|| mapaCambios.isEmpty()){
			//cojo el archivo tal cual y lo envio
			BufferedReader reader=null;
			try {
				reader = new BufferedReader(new FileReader (rutaCreacion));
				 String         line = null;
				    StringBuilder  stringBuilder = new StringBuilder();
				
				while((line = reader.readLine()) != null) {
		        	if(!line.startsWith("<!--")){//si no es un comentario xml
		        		stringBuilder.append(line);
		        	}
		        }

		        toSend = stringBuilder.toString();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			} finally {
				if(reader!=null){
					try {
						reader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
				}
		        
		    }
		}
		else{
			if(orderToSend == null){
				try {
					//cargamos la orden con los datos del XML de entrada
					xStream = new XStream();
					// Digerimos el xml en un cierto elemento
					InputStream inputStream = null;
					xStream.ignoreUnknownElements();
					xStream.autodetectAnnotations(true);
					
					
					
					File file = new File(rutaCreacion);
					if (file.exists()) {
						
							inputStream = new FileInputStream(file);
						
					}
					
					if(entornoSel.equals(Entornos.DESARROLLOOOEE) || entornoSel.equals(Entornos.TESTOOEE) || entornoSel.equals(Entornos.INTEGRACIONOOEE) || entornoSel.equals(Entornos.PRODUCCIONOOEE)){
						xStream.alias("Envelope", OrderOOEE.class);
						xStream.alias("suministro", Suministro.class);
						xStream.alias("equipo", EquipoOOEE.class);
						xStream.alias("avisos", Avisos.class);
						xStream.alias("aviso", Aviso.class);												
						orderToSendOOEE = (OrderOOEE) xStream.fromXML(inputStream);
					}else{
						xStream.alias("Envelope", Order.class);
						orderToSend = (Order) xStream.fromXML(inputStream);
					}					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
			}
			if(entornoSel.equals(Entornos.DESARROLLOOOEE) || entornoSel.equals(Entornos.TESTOOEE) || entornoSel.equals(Entornos.INTEGRACIONOOEE) || entornoSel.equals(Entornos.PRODUCCIONOOEE)){
				OrderDetailsOOEE detalle;
				
				if(tipoLLamada.equals(TabSimulacionOrdenes.CREACION)){
					detalle=orderToSendOOEE.getBody().getCreation();
				}
				else if(tipoLLamada.equals(TabSimulacionOrdenes.ACTUALIZACION)){
					detalle=orderToSendOOEE.getBody().getModificacion();
				}else if(tipoLLamada.equals(TabSimulacionOrdenes.ACK)){
					detalle=orderToSendOOEE.getBody().getAck();
				}else{//anulacion y nack
					detalle=orderToSendOOEE.getBody().getAnulacion();
				}
				
				//Hacemos cambios a ciertos valores de la orden
				if(mapaCambios.containsKey("NUM_ORDER")){
					System.out.println("El detalle es:"+detalle);
					detalle.setNumeroOrden(mapaCambios.get("NUM_ORDER"));				
				}
//				if(mapaCambios.containsKey("PDS_NUM")){
//					detalle.getDireccionPdS().setNumero(mapaCambios.get("PDS_NUM"));				
//				}
//				if(mapaCambios.containsKey("PDS_PORTAL")){
//					detalle.getDireccionPdS().setPortal(mapaCambios.get("PDS_PORTAL"));				
//				}
//				if(mapaCambios.containsKey("APARATOS_TRANSF")){
//					detalle.setNroAparatosTransformar(mapaCambios.get("APARATOS_TRANSF"));				
//				}
				
				toSend=xStream.toXML(orderToSendOOEE);	
			}else{
				OrderDetails detalle;
				
				if(tipoLLamada.equals(TabSimulacionOrdenes.CREACION)){
					detalle=orderToSend.getBody().getCreation();
				}
				else if(tipoLLamada.equals(TabSimulacionOrdenes.ACTUALIZACION)){
					detalle=orderToSend.getBody().getModificacion();
				}else if(tipoLLamada.equals(TabSimulacionOrdenes.ACK)){
					detalle=orderToSend.getBody().getAck();
				}else{//anulacion y nack
					detalle=orderToSend.getBody().getAnulacion();
				}
				
				//Hacemos cambios a ciertos valores de la orden
				if(mapaCambios.containsKey("NUM_ORDER")){
					detalle.setNumeroOrden(mapaCambios.get("NUM_ORDER"));				
				}
				if(mapaCambios.containsKey("PDS_NUM")){
					detalle.getDireccionPdS().setNumero(mapaCambios.get("PDS_NUM"));				
				}
				if(mapaCambios.containsKey("PDS_PORTAL")){
					detalle.getDireccionPdS().setPortal(mapaCambios.get("PDS_PORTAL"));				
				}
				if(mapaCambios.containsKey("APARATOS_TRANSF")){
					detalle.setNroAparatosTransformar(mapaCambios.get("APARATOS_TRANSF"));				
				}
				
				toSend=xStream.toXML(orderToSend);	
			}
			
			
		
		}
		
		try {
			if(entornoSel.equals(Entornos.DESARROLLOOOEE) || entornoSel.equals(Entornos.TESTOOEE) || entornoSel.equals(Entornos.INTEGRACIONOOEE) || entornoSel.equals(Entornos.PRODUCCIONOOEE)){
				senderEl.send(toSend);
				System.out.println("OOEE");
			}else{
				sender.send(toSend);
			}
			
			if(mapaCambios==null|| mapaCambios.isEmpty()){
				LOGGER.info("Enviado xml sin cambios:\n");
			}else{
				LOGGER.info("Enviado xml con cambios:\n" + toSend);
			}
			
		} catch (IllegalStateException e) {
			// Conecta la VPN
			LOGGER.error("IllegalStateException " + e.getStackTrace());
			return false;
		} 
		System.out.println("Devolvamos true");
		return true;
	}
	
	public void close(){
			context.close();
	}
	
	

}
