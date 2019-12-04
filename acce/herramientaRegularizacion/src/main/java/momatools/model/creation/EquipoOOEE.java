package momatools.model.creation;

public class EquipoOOEE {

	private DatosGeneralesEquipo datosGeneralesEquipo;
	private DatosTecnicosEquipo datosTecnicosEquipo;
	private ConfiguracionContratos configuracionContratos;
	private Numeradores numeradores;
	private Precintos precintos;
	private String codigoCapacidadEquipo;
	private String descripcionCapacidadEquipo;
	
	public DatosGeneralesEquipo getDatosGeneralesEquipo() {
		return datosGeneralesEquipo;
	}
	public void setDatosGeneralesEquipo(DatosGeneralesEquipo datosGeneralesEquipo) {
		this.datosGeneralesEquipo = datosGeneralesEquipo;
	}
	public DatosTecnicosEquipo getDatosTecnicosEquipo() {
		return datosTecnicosEquipo;
	}
	public void setDatosTecnicosEquipo(DatosTecnicosEquipo datosTecnicosEquipo) {
		this.datosTecnicosEquipo = datosTecnicosEquipo;
	}
	public ConfiguracionContratos getConfiguracionContratos() {
		return configuracionContratos;
	}
	public void setConfiguracionContratos(ConfiguracionContratos configuracionContratos) {
		this.configuracionContratos = configuracionContratos;
	}
	public Numeradores getNumeradores() {
		return numeradores;
	}
	public void setNumeradores(Numeradores numeradores) {
		this.numeradores = numeradores;
	}
	public Precintos getPrecintos() {
		return precintos;
	}
	public void setPrecintos(Precintos precintos) {
		this.precintos = precintos;
	}
	public String getCodigoCapacidadEquipo() {
		return codigoCapacidadEquipo;
	}
	public void setCodigoCapacidadEquipo(String codigoCapacidadEquipo) {
		this.codigoCapacidadEquipo = codigoCapacidadEquipo;
	}
	public String getDescripcionCapacidadEquipo() {
		return descripcionCapacidadEquipo;
	}
	public void setDescripcionCapacidadEquipo(String descripcionCapacidadEquipo) {
		this.descripcionCapacidadEquipo = descripcionCapacidadEquipo;
	}	
	
}
