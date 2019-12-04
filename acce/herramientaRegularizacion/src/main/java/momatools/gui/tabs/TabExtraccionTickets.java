package momatools.gui.tabs;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gnf.sender.init.Entornos;
import momatools.gui.main.FileUtils;
import momatools.gui.main.GuiUtils;

/**
 * Tab para automatizar la extracción de tickets
 * 
 * @author j.villegas.antunez
 *
 */
public class TabExtraccionTickets extends TabParents{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constante con los entornos disponibles.
	 */
//	private static final Entornos[] ENVIRONMENTS = { Entornos.PRODUCCION, Entornos.DESARROLLO };
	private static final JLabel jlBuscar = new JLabel("Ruta del fichero:");
	/**
	 * Campo de texto donde se almacenara la ruta de destino del excel.
	 */
	private static final JTextField jtfDestino = new JTextField("");
//	private static final JTextField jtfDestino = new JTextField("-- Seleccionar el fichero excel exportado de F1");
	/**
	 * Boton cuya accion sera elegir el directorio donde guardaremos los
	 * ficheros.
	 */
	private static final JButton botonBuscarFich = new JButton("Buscar...");
	/**
	 * Desplegable para seleccionar el entorno sobre el que se lanzaran las
	 * queries.
	 */
//	private static final JComboBox<Entornos> envCombo = new JComboBox<Entornos>(ENVIRONMENTS);

	public TabExtraccionTickets(JTextArea resultados) {
		super(resultados);
		init();
		posicionamiento();
		// TODO Auto-generated constructor stub
	}
	
	public void init(){
		botonBuscarFich.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileUtils.selectFolder(jtfDestino, "");
//				envCombo.setToolTipText("Entorno contra el que se lanzará el cuadre");
			}
		});
	}
	
	public void posicionamiento() {
		add(jlBuscar, GuiUtils.posicionarElemento(10, 1, 0, 2, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST));
		add(jtfDestino, GuiUtils.posicionarElemento(300, 1, 1, 2, 1,  1, GridBagConstraints.NONE,
				GridBagConstraints.WEST));
		add(botonBuscarFich,
				GuiUtils.posicionarElemento(10, 1, 2, 2, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
//		add(envCombo,
//				GuiUtils.posicionarElemento(10, 0, 1, 4, 1, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.EAST));
		
//		GridBagConstraints constraints = new GridBagConstraints();
//		constraints.ipadx = 20;
//
//		constraints.gridx = 0;
//		constraints.gridy = 4;
//		constraints.gridwidth = 4;
//		constraints.gridheight = 1;
//		constraints.fill = GridBagConstraints.NONE;
//		constraints.anchor = GridBagConstraints.CENTER;
//		constraints.insets = new Insets(0, 10, 0, 10);
	}
}
