package momatools.gui.tabs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.thoughtworks.xstream.XStream;

import momatools.gui.main.FileUtils;
import momatools.model.workorder.WorkOrderFromXML;

/**
 * Clase de la GUI que genera las notificaciones de zeus
 * 
 * @author l.lorenzoriesco
 *
 */
public class TabNotificacionZeus extends TabParents {

	private static final String RUTA_DEFECTO = "C:\\workspace\\prueba\\InformesMerged\\herramientaRegularizacion\\src\\main\\resources\\examples";
	private static final long serialVersionUID = 1L;
	private JTextField rutaExcel;
	private JTextField rutaFolder;
	private JButton bGeneraNotif;

	public TabNotificacionZeus(JTextArea resultados) {
		super(new GridBagLayout(), resultados);
		initComponents();
		prePopulateFields();
	}

	/**
	 * Creo cada uno de los campos
	 */
	
	@Override
	protected void initComponents() {
		super.initComponents();

		GridBagConstraints c = new GridBagConstraints();
		if (true) {
			// natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(new JLabel("Excel de ordenes:"), c);

		rutaExcel = new JTextField("C:\\GNF\\PruebaCDM.xlsx");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.8;
		c.gridx = 1;
		c.gridy = 0;
		add(rutaExcel, c);

		JButton btnFileBrowseResources = new JButton("Browse...");
		btnFileBrowseResources.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnFileBrowseResourcesActionPerformed(e);
			}
		});

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		add(btnFileBrowseResources, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		add(new JLabel("Directorio de entrada:"), c);

		rutaFolder = new JTextField("C:\\GNF\\SoyUnaCarpeta");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.8;
		c.gridx = 1;
		c.gridy = 1;
		add(rutaFolder, c);

		JButton btnFolderBrowseResources = new JButton("Browse...");
		btnFolderBrowseResources.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnFolderBrowseResourcesActionPerformed(e);
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		add(btnFolderBrowseResources, c);

		bGeneraNotif = new JButton("Generar xml notificaciones");
		bGeneraNotif.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnGeneraNotificacionesActionPerformed(e);
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20; // make this component tall
		c.weightx = 0.0;
		c.anchor = GridBagConstraints.PAGE_END; // bottom of space
		c.insets = new Insets(10, 0, 0, 0); // top padding
		c.gridwidth = 3;// 3 columnas de ancho
		c.gridx = 0;
		c.gridy = 2;
		add(bGeneraNotif, c);

		// button = new JButton("5");
		// c.fill = GridBagConstraints.HORIZONTAL;
		// c.ipady = 0; //reset to default
		// c.weighty = 1.0; //request any extra vertical space
		// c.anchor = GridBagConstraints.PAGE_END; //bottom of space
		// c.insets = new Insets(10,0,0,0); //top padding
		// c.gridx = 1; //aligned with button 2
		// c.gridwidth = 2; //2 columns wide
		// c.gridy = 3; //third row
		// add(button, c);

	}

	private void btnFileBrowseResourcesActionPerformed(ActionEvent evt) {
		FileUtils.selectExcelFile(rutaExcel, RUTA_DEFECTO);
	}

	private void btnFolderBrowseResourcesActionPerformed(ActionEvent evt) {
		FileUtils.selectFolder(rutaFolder, RUTA_DEFECTO);
	}
	
	private void btnGeneraNotificacionesActionPerformed(ActionEvent evt) {
		lanzaProceso();
	}

	/**
	 * Cargo aquellos componentes que deban tener un valor por defecto
	 */
	
	@Override
	protected void prePopulateFields() {
		super.prePopulateFields();

	}
	
	private class Comment {
	    long id;
	    String desc;
	}

	private class Comments {
	    List<Comment> comments = new ArrayList<Comment>();
	}

	private void lanzaProceso() {

		XStream xStream = new XStream();
		
//		xStream.alias("comments", Comments.class);
//		xStream.alias("comment", Comment.class);
//		xStream.addImplicitCollection(Comments.class, "comments");
//		Comments comments = (Comments)xStream.fromXML(""
//				+ "<comments>   <comment>      <id>1</id>      <desc>A comment</desc>   </comment>   <comment>      <id>2</id>      <desc>Another comment</desc>   </comment>   <comment>      <id>3</id>      <desc>Another one comment</desc>   </comment></comments>");
//		System.out.println("Predigerido con contenido" + xStream.toXML(comments));
		
		
		
		
		
//Estas por aqui, digerir el xml en un cierto elemento
		InputStream inputStream = null;
		WorkOrderFromXML order = null;
		xStream.ignoreUnknownElements();
		xStream.autodetectAnnotations(true);
		xStream.alias("WorkOrder", WorkOrderFromXML.class);
		try {

			inputStream = streamFromFile(RUTA_DEFECTO + File.separator + "work_order.xml");
			order = (WorkOrderFromXML) xStream.fromXML(inputStream);
			System.out.println("Predigerido con contenido" + xStream.toXML(order));
		} catch (Exception e){
			System.out.println("Error " + e.getMessage());
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private static InputStream streamFromFile(String filePath) {
		InputStream retorno = null;
		File file = new File(filePath);
		if (file.exists()) {
			try {
				retorno = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				retorno = null;
			}
		}
		if (retorno == null) {
			System.out.println("Error, el archivo no existe");
			filePath = null;
		}
		System.out.println("El archivo que se usara de plantilla para la orden es: " + filePath);

		return retorno;
	}

}
