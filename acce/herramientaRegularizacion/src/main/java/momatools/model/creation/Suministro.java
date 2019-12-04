package momatools.model.creation;

public class Suministro {

	private String codigoSuministro;
	private Direccion direccion;
	private String situacionServicio;
	private String nombrecontrato;
	private String direccionPuntoMedida;
	private String codigoCentralizacion;
	private String CNAE;
	private String tipoLocal;
	private String tension;
	private String fases;
	private String potenciaMaxInstalacion;
	private String potenciaContratada;
	private String potenciaPagadaPromotor;
	private EquiposOOEE equipos;
	
	public String getCodigoSuministro() {
		return codigoSuministro;
	}
	public void setCodigoSuministro(String codigoSuministro) {
		this.codigoSuministro = codigoSuministro;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getSituacionServicio() {
		return situacionServicio;
	}
	public void setSituacionServicio(String situacionServicio) {
		this.situacionServicio = situacionServicio;
	}
	public String getNombrecontrato() {
		return nombrecontrato;
	}
	public void setNombrecontrato(String nombrecontrato) {
		this.nombrecontrato = nombrecontrato;
	}
	public String getDireccionPuntoMedida() {
		return direccionPuntoMedida;
	}
	public void setDireccionPuntoMedida(String direccionPuntoMedida) {
		this.direccionPuntoMedida = direccionPuntoMedida;
	}
	public String getCodigoCentralizacion() {
		return codigoCentralizacion;
	}
	public void setCodigoCentralizacion(String codigoCentralizacion) {
		this.codigoCentralizacion = codigoCentralizacion;
	}
	public String getCNAE() {
		return CNAE;
	}
	public void setCNAE(String cNAE) {
		CNAE = cNAE;
	}
	public String getTipoLocal() {
		return tipoLocal;
	}
	public void setTipoLocal(String tipoLocal) {
		this.tipoLocal = tipoLocal;
	}
	public String getTension() {
		return tension;
	}
	public void setTension(String tension) {
		this.tension = tension;
	}
	public String getFases() {
		return fases;
	}
	public void setFases(String fases) {
		this.fases = fases;
	}
	public String getPotenciaMaxInstalacion() {
		return potenciaMaxInstalacion;
	}
	public void setPotenciaMaxInstalacion(String potenciaMaxInstalacion) {
		this.potenciaMaxInstalacion = potenciaMaxInstalacion;
	}
	public String getPotenciaContratada() {
		return potenciaContratada;
	}
	public void setPotenciaContratada(String potenciaContratada) {
		this.potenciaContratada = potenciaContratada;
	}
	public String getPotenciaPagadaPromotor() {
		return potenciaPagadaPromotor;
	}
	public void setPotenciaPagadaPromotor(String potenciaPagadaPromotor) {
		this.potenciaPagadaPromotor = potenciaPagadaPromotor;
	}
	public EquiposOOEE getEquipos() {
		return equipos;
	}
	public void setEquipos(EquiposOOEE equipos) {
		this.equipos = equipos;
	}
	
	
}
