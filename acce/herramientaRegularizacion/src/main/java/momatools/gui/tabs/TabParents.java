package momatools.gui.tabs;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Clase comun para todos los tabs de la interfaz
 * @author l.lorenzoriesco
 *
 */
public class TabParents extends JPanel{

	private static final long serialVersionUID = 1L;
	//el area donde todos los tabs escribiran
	protected JTextArea resultados;

	public TabParents(LayoutManager layout,JTextArea resultados) {
		super(layout);		
		this.resultados=resultados;	
	}

	public TabParents(JTextArea resultados) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Creo cada uno de los campos
	 */
	protected void initComponents() {
		
	}

	/**
	 * Cargo aquellos componentes que deban tener un valor por defecto
	 */
	protected void prePopulateFields() {
		
	}
}
