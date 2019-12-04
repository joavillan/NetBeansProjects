package momatools.gui.combovals;
/**
 * Clase de enumeracion para el combo de tipo de informe
 * @author l.lorenzoriesco
 *
 */
public enum TipoInforme {
	CARGA_KPI("Carga de KPIs"), 
	SEG_PILOTO("Seguimiento piloto"),
	CUADRO_MANDOS("Cuadro de mandos");
	
	
	private String nombreTipo;
	
	private TipoInforme (String nombreTipo){
		this.nombreTipo = nombreTipo;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}
	
	@Override
	public String toString(){
		return nombreTipo;
	}

}
