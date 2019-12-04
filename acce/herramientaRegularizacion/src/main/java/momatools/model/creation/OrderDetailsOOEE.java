package momatools.model.creation;


/**
 * Clase java que recoge el xml de entrada de workorder para tener todos los
 * datos Tendra una serie de datos simples, y unos tags complejos
 * 
 * @author l.lorenzoriesco
 *
 */

public class OrderDetailsOOEE {
	/*
	 * ATRIBUTOS QUE SON FINALES, CASI TODOS STRING
	 */
	private String messageId;
	private String origen;
	private String codigoPais;
	private String nombrePais;
	private String fechaEnvio;
	private String numeroOrden;
	private String tipoOrden;
	private String tipoPuntoMedida;
	private String codigoUPMT;
	private String codigoUnidadSolicitante;
	private String descripcionUnidadSolicitante;
	private String codigoProceso;
	private String descripcionProceso;
	private String codigoMotivo;
	private String descripcionMotivo;
	private String nroOrdenVinculada;
	private String codigoUPMTVinculada;
	private String codigoTeam;
	private String observaciones;
	private String codigoAgente;
	private String indicadorObligatorioObservaciones;
	private String fechaCreacion;
	private String fechaVencimiento;
	private String fechaInicioConcertacion;
	private String fechaFinConcertacion;
	private String duracion;
	private String acreditaciones;
	private String asignacionMultiple;
	private String servicios;
	private String codigoSector;
    private String descripcionSector;
    private String codigoSociedad;
    private String nombreSociedad;
    private String codigoZona;
    private String nombreZona;
    private String codigoUtilizacionGas;
    private String descripcionUtilizacionGas;
    private String codigoUsosGas;
    private String descripcionUsosGas;
    private String datosRegistralesSociedad;
    private String codigoComercializadora;
    private String nombreComercializadora;
    private String direccionComercializadora;
    private String codigoOperacion;
    private String descripcionCortaOperacion;
    private String descripcionOperacion;
    private String situacionOperacion;
    private String codigoAcometida;
    private String ubicacionEventual;    
    private String tipoInstalacion;
    private String descripcionTipoInstalacion;
    private String descripcionTipoGas;
    private String unifamiliar;
    private String cierreFinca;
    private String nroAparatosTransformar;
    private String descripcionEmpresaConcesionaria;
    private String fechaPrevistaEjecucion;
    private String horaDesdePrevista;
    private String horaHastaPrevista;
    private String fechaMinimaEjecucion;
    private String fechaMaximaEjecucion;
    private String fechaSolicitadaPrevistaEjecucion;
    private String horaDesdeSolicitadaEjecucion;
    private String horaHastaSolicitadaEjecucion;
    private String fechaInspeccion;
    private String numeroDiasRetornoIP;
    private String fechaPuestaServicioIRI;
    private String fechaPuestaServicioIRC;
    private String fechaSituacionServicio;
    private String situacionServicio;
    private String defectosUltimaSituacionServicio;
    private String presionContaje;
    private String direccionVerticalPSM1;
    private String direccionVerticalPSM2;
    private String direccionVerticalPSM3;
    private String direccionVerticalPSM4;
    private String direccionVerticalPSM5;
    private String coordenadaX;
    private String coordenadaY;
    private String numeroContrato;
    private String cups;
    private String indicadorICMPCM;
    private String tarifa;
    private String tarifaObjetivo;
    private String codigoConexion;
    private String maxFallidas;
    private String numFallidas;
    private String maxAnomalias;
    private String numAnomalias;
    private String anomaliasIP;
    private String anomaliasOP;
    private String tipoConcertacion;
    private String intentosConcertacion;
    private String numIntentosConcertacion;
    private String importeOperacion;
    private String codigoLote;
    private String tipoVisita;
    private String origenVisitaComplementaria;
    private String origenCierreVinculada;
    private String codigoMotivoCese;
    private String descripcionMotivoCese;
    private String motivoCambioContador;
    private String idiomaCliente;
    private String codigoMercado;
    private String codigoUnidadGestora;
    private String descripcionUnidad;
    private String indicadorUltimoCliente;
    private String indicadorClienteVIP;
    private String codigoDelegacion;
    private String nombreDelegacion;    
    private String codigoCampanya;
    private String descripcionCampanya;
    private String puntoActuacion;
    private String descripcionPuntoactuacion;
    private String codigoSr;
    private String prioridad;
    private String codComunidadAutonoma;
    private String descComunidadAutonoma;
    private String centroTransformacion;
    private String indicadorSolicitadaComercializadora;
    private String indicadorAplicaCorteAcometida;
    private String indicadorAplicaRetiradaAcometida;
    private String indicadorSuministroImportante;
    private String indicadorSuministroNoCortable;
    private String indicadorAplicaConexionAcometida;
    private String indicadorAplicaReconexionAcometida;
    private String indicadorCorteDrastico;
    private String indicadorTrabajoEnAltura;
    private String numeroCortesImpagos;
	
	
	/*
	 * ATRIBUTOS COMPLEJOS
	 */
	private DireccionPdS direccionPdS;	
	private DatosCliente datosCliente;
	private DatosContacto datosContacto;
	private DatosInstalador datosInstalador;
	private DatosVisita datosVisita1;
	private DatosVisita datosVisita2;
	private ContratoUsoIRC contratoUsoIRC;
	private Avisos avisos;
	private MatrizATR matrizATR;
	private Suministros suministros;


	/*
	 * GETTERS Y SETTERS
	 */

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public String getTipoOrden() {
		return tipoOrden;
	}

	public void setTipoOrden(String tipoOrden) {
		this.tipoOrden = tipoOrden;
	}

	public String getNroOrdenVinculada() {
		return nroOrdenVinculada;
	}

	public void setNroOrdenVinculada(String nroOrdenVinculada) {
		this.nroOrdenVinculada = nroOrdenVinculada;
	}

	public String getCodigoTeam() {
		return codigoTeam;
	}

	public void setCodigoTeam(String codigoTeam) {
		this.codigoTeam = codigoTeam;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCodigoAgente() {
		return codigoAgente;
	}

	public void setCodigoAgente(String codigoAgente) {
		this.codigoAgente = codigoAgente;
	}

	public String getIndicadorObligatorioObservaciones() {
		return indicadorObligatorioObservaciones;
	}

	public void setIndicadorObligatorioObservaciones(String indicadorObligatorioObservaciones) {
		this.indicadorObligatorioObservaciones = indicadorObligatorioObservaciones;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaInicioConcertacion() {
		return fechaInicioConcertacion;
	}

	public void setFechaInicioConcertacion(String fechaInicioConcertacion) {
		this.fechaInicioConcertacion = fechaInicioConcertacion;
	}

	public String getFechaFinConcertacion() {
		return fechaFinConcertacion;
	}

	public void setFechaFinConcertacion(String fechaFinConcertacion) {
		this.fechaFinConcertacion = fechaFinConcertacion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getAcreditaciones() {
		return acreditaciones;
	}

	public void setAcreditaciones(String acreditaciones) {
		this.acreditaciones = acreditaciones;
	}

	public String getAsignacionMultiple() {
		return asignacionMultiple;
	}

	public void setAsignacionMultiple(String asignacionMultiple) {
		this.asignacionMultiple = asignacionMultiple;
	}

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	public String getCodigoSector() {
		return codigoSector;
	}

	public void setCodigoSector(String codigoSector) {
		this.codigoSector = codigoSector;
	}

	public String getDescripcionSector() {
		return descripcionSector;
	}

	public void setDescripcionSector(String descripcionSector) {
		this.descripcionSector = descripcionSector;
	}

	public String getCodigoSociedad() {
		return codigoSociedad;
	}

	public void setCodigoSociedad(String codigoSociedad) {
		this.codigoSociedad = codigoSociedad;
	}

	public String getNombreSociedad() {
		return nombreSociedad;
	}

	public void setNombreSociedad(String nombreSociedad) {
		this.nombreSociedad = nombreSociedad;
	}

	public String getCodigoZona() {
		return codigoZona;
	}

	public void setCodigoZona(String codigoZona) {
		this.codigoZona = codigoZona;
	}

	public String getNombreZona() {
		return nombreZona;
	}

	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}

	public String getCodigoUtilizacionGas() {
		return codigoUtilizacionGas;
	}

	public void setCodigoUtilizacionGas(String codigoUtilizacionGas) {
		this.codigoUtilizacionGas = codigoUtilizacionGas;
	}

	public String getDescripcionUtilizacionGas() {
		return descripcionUtilizacionGas;
	}

	public void setDescripcionUtilizacionGas(String descripcionUtilizacionGas) {
		this.descripcionUtilizacionGas = descripcionUtilizacionGas;
	}

	public String getCodigoUsosGas() {
		return codigoUsosGas;
	}

	public void setCodigoUsosGas(String codigoUsosGas) {
		this.codigoUsosGas = codigoUsosGas;
	}

	public String getDescripcionUsosGas() {
		return descripcionUsosGas;
	}

	public void setDescripcionUsosGas(String descripcionUsosGas) {
		this.descripcionUsosGas = descripcionUsosGas;
	}

	public String getDatosRegistralesSociedad() {
		return datosRegistralesSociedad;
	}

	public void setDatosRegistralesSociedad(String datosRegistralesSociedad) {
		this.datosRegistralesSociedad = datosRegistralesSociedad;
	}

	public String getCodigoComercializadora() {
		return codigoComercializadora;
	}

	public void setCodigoComercializadora(String codigoComercializadora) {
		this.codigoComercializadora = codigoComercializadora;
	}

	public String getNombreComercializadora() {
		return nombreComercializadora;
	}

	public void setNombreComercializadora(String nombreComercializadora) {
		this.nombreComercializadora = nombreComercializadora;
	}

	public String getDireccionComercializadora() {
		return direccionComercializadora;
	}

	public void setDireccionComercializadora(String direccionComercializadora) {
		this.direccionComercializadora = direccionComercializadora;
	}

	public String getCodigoOperacion() {
		return codigoOperacion;
	}

	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}

	public String getDescripcionCortaOperacion() {
		return descripcionCortaOperacion;
	}

	public void setDescripcionCortaOperacion(String descripcionCortaOperacion) {
		this.descripcionCortaOperacion = descripcionCortaOperacion;
	}

	public String getDescripcionOperacion() {
		return descripcionOperacion;
	}

	public void setDescripcionOperacion(String descripcionOperacion) {
		this.descripcionOperacion = descripcionOperacion;
	}

	public String getSituacionOperacion() {
		return situacionOperacion;
	}

	public void setSituacionOperacion(String situacionOperacion) {
		this.situacionOperacion = situacionOperacion;
	}

	public String getCodigoAcometida() {
		return codigoAcometida;
	}

	public void setCodigoAcometida(String codigoAcometida) {
		this.codigoAcometida = codigoAcometida;
	}

	public String getTipoInstalacion() {
		return tipoInstalacion;
	}

	public void setTipoInstalacion(String tipoInstalacion) {
		this.tipoInstalacion = tipoInstalacion;
	}

	public String getDescripcionTipoInstalacion() {
		return descripcionTipoInstalacion;
	}

	public void setDescripcionTipoInstalacion(String descripcionTipoInstalacion) {
		this.descripcionTipoInstalacion = descripcionTipoInstalacion;
	}

	public String getDescripcionTipoGas() {
		return descripcionTipoGas;
	}

	public void setDescripcionTipoGas(String descripcionTipoGas) {
		this.descripcionTipoGas = descripcionTipoGas;
	}

	public String getUnifamiliar() {
		return unifamiliar;
	}

	public void setUnifamiliar(String unifamiliar) {
		this.unifamiliar = unifamiliar;
	}

	public String getCierreFinca() {
		return cierreFinca;
	}

	public void setCierreFinca(String cierreFinca) {
		this.cierreFinca = cierreFinca;
	}

	public String getNroAparatosTransformar() {
		return nroAparatosTransformar;
	}

	public void setNroAparatosTransformar(String nroAparatosTransformar) {
		this.nroAparatosTransformar = nroAparatosTransformar;
	}

	public String getDescripcionEmpresaConcesionaria() {
		return descripcionEmpresaConcesionaria;
	}

	public void setDescripcionEmpresaConcesionaria(String descripcionEmpresaConcesionaria) {
		this.descripcionEmpresaConcesionaria = descripcionEmpresaConcesionaria;
	}

	public String getFechaPrevistaEjecucion() {
		return fechaPrevistaEjecucion;
	}

	public void setFechaPrevistaEjecucion(String fechaPrevistaEjecucion) {
		this.fechaPrevistaEjecucion = fechaPrevistaEjecucion;
	}

	public String getHoraDesdePrevista() {
		return horaDesdePrevista;
	}

	public void setHoraDesdePrevista(String horaDesdePrevista) {
		this.horaDesdePrevista = horaDesdePrevista;
	}

	public String getHoraHastaPrevista() {
		return horaHastaPrevista;
	}

	public void setHoraHastaPrevista(String horaHastaPrevista) {
		this.horaHastaPrevista = horaHastaPrevista;
	}

	public String getFechaMinimaEjecucion() {
		return fechaMinimaEjecucion;
	}

	public void setFechaMinimaEjecucion(String fechaMinimaEjecucion) {
		this.fechaMinimaEjecucion = fechaMinimaEjecucion;
	}

	public String getFechaMaximaEjecucion() {
		return fechaMaximaEjecucion;
	}

	public void setFechaMaximaEjecucion(String fechaMaximaEjecucion) {
		this.fechaMaximaEjecucion = fechaMaximaEjecucion;
	}

	public String getFechaSolicitadaPrevistaEjecucion() {
		return fechaSolicitadaPrevistaEjecucion;
	}

	public void setFechaSolicitadaPrevistaEjecucion(String fechaSolicitadaPrevistaEjecucion) {
		this.fechaSolicitadaPrevistaEjecucion = fechaSolicitadaPrevistaEjecucion;
	}

	public String getHoraDesdeSolicitadaEjecucion() {
		return horaDesdeSolicitadaEjecucion;
	}

	public void setHoraDesdeSolicitadaEjecucion(String horaDesdeSolicitadaEjecucion) {
		this.horaDesdeSolicitadaEjecucion = horaDesdeSolicitadaEjecucion;
	}

	public String getHoraHastaSolicitadaEjecucion() {
		return horaHastaSolicitadaEjecucion;
	}

	public void setHoraHastaSolicitadaEjecucion(String horaHastaSolicitadaEjecucion) {
		this.horaHastaSolicitadaEjecucion = horaHastaSolicitadaEjecucion;
	}

	public String getFechaInspeccion() {
		return fechaInspeccion;
	}

	public void setFechaInspeccion(String fechaInspeccion) {
		this.fechaInspeccion = fechaInspeccion;
	}

	public String getNumeroDiasRetornoIP() {
		return numeroDiasRetornoIP;
	}

	public void setNumeroDiasRetornoIP(String numeroDiasRetornoIP) {
		this.numeroDiasRetornoIP = numeroDiasRetornoIP;
	}

	public String getFechaPuestaServicioIRI() {
		return fechaPuestaServicioIRI;
	}

	public void setFechaPuestaServicioIRI(String fechaPuestaServicioIRI) {
		this.fechaPuestaServicioIRI = fechaPuestaServicioIRI;
	}

	public String getFechaPuestaServicioIRC() {
		return fechaPuestaServicioIRC;
	}

	public void setFechaPuestaServicioIRC(String fechaPuestaServicioIRC) {
		this.fechaPuestaServicioIRC = fechaPuestaServicioIRC;
	}

	public String getFechaSituacionServicio() {
		return fechaSituacionServicio;
	}

	public void setFechaSituacionServicio(String fechaSituacionServicio) {
		this.fechaSituacionServicio = fechaSituacionServicio;
	}

	public String getSituacionServicio() {
		return situacionServicio;
	}

	public void setSituacionServicio(String situacionServicio) {
		this.situacionServicio = situacionServicio;
	}

	public String getDefectosUltimaSituacionServicio() {
		return defectosUltimaSituacionServicio;
	}

	public void setDefectosUltimaSituacionServicio(String defectosUltimaSituacionServicio) {
		this.defectosUltimaSituacionServicio = defectosUltimaSituacionServicio;
	}

	public String getPresionContaje() {
		return presionContaje;
	}

	public void setPresionContaje(String presionContaje) {
		this.presionContaje = presionContaje;
	}

	public String getDireccionVerticalPSM1() {
		return direccionVerticalPSM1;
	}

	public void setDireccionVerticalPSM1(String direccionVerticalPSM1) {
		this.direccionVerticalPSM1 = direccionVerticalPSM1;
	}

	public String getDireccionVerticalPSM2() {
		return direccionVerticalPSM2;
	}

	public void setDireccionVerticalPSM2(String direccionVerticalPSM2) {
		this.direccionVerticalPSM2 = direccionVerticalPSM2;
	}

	public String getDireccionVerticalPSM3() {
		return direccionVerticalPSM3;
	}

	public void setDireccionVerticalPSM3(String direccionVerticalPSM3) {
		this.direccionVerticalPSM3 = direccionVerticalPSM3;
	}

	public String getDireccionVerticalPSM4() {
		return direccionVerticalPSM4;
	}

	public void setDireccionVerticalPSM4(String direccionVerticalPSM4) {
		this.direccionVerticalPSM4 = direccionVerticalPSM4;
	}

	public String getDireccionVerticalPSM5() {
		return direccionVerticalPSM5;
	}

	public void setDireccionVerticalPSM5(String direccionVerticalPSM5) {
		this.direccionVerticalPSM5 = direccionVerticalPSM5;
	}

	public String getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public String getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getCups() {
		return cups;
	}

	public void setCups(String cups) {
		this.cups = cups;
	}

	public String getCodigoConexion() {
		return codigoConexion;
	}

	public void setCodigoConexion(String codigoConexion) {
		this.codigoConexion = codigoConexion;
	}

	public String getMaxFallidas() {
		return maxFallidas;
	}

	public void setMaxFallidas(String maxFallidas) {
		this.maxFallidas = maxFallidas;
	}

	public String getNumFallidas() {
		return numFallidas;
	}

	public void setNumFallidas(String numFallidas) {
		this.numFallidas = numFallidas;
	}

	public String getMaxAnomalias() {
		return maxAnomalias;
	}

	public void setMaxAnomalias(String maxAnomalias) {
		this.maxAnomalias = maxAnomalias;
	}

	public String getNumAnomalias() {
		return numAnomalias;
	}

	public void setNumAnomalias(String numAnomalias) {
		this.numAnomalias = numAnomalias;
	}

	public String getAnomaliasIP() {
		return anomaliasIP;
	}

	public void setAnomaliasIP(String anomaliasIP) {
		this.anomaliasIP = anomaliasIP;
	}

	public String getAnomaliasOP() {
		return anomaliasOP;
	}

	public void setAnomaliasOP(String anomaliasOP) {
		this.anomaliasOP = anomaliasOP;
	}

	public String getTipoConcertacion() {
		return tipoConcertacion;
	}

	public void setTipoConcertacion(String tipoConcertacion) {
		this.tipoConcertacion = tipoConcertacion;
	}

	public String getIntentosConcertacion() {
		return intentosConcertacion;
	}

	public void setIntentosConcertacion(String intentosConcertacion) {
		this.intentosConcertacion = intentosConcertacion;
	}

	public String getNumIntentosConcertacion() {
		return numIntentosConcertacion;
	}

	public void setNumIntentosConcertacion(String numIntentosConcertacion) {
		this.numIntentosConcertacion = numIntentosConcertacion;
	}

	public String getImporteOperacion() {
		return importeOperacion;
	}

	public void setImporteOperacion(String importeOperacion) {
		this.importeOperacion = importeOperacion;
	}

	public String getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}

	public String getTipoVisita() {
		return tipoVisita;
	}

	public void setTipoVisita(String tipoVisita) {
		this.tipoVisita = tipoVisita;
	}

	public String getOrigenVisitaComplementaria() {
		return origenVisitaComplementaria;
	}

	public void setOrigenVisitaComplementaria(String origenVisitaComplementaria) {
		this.origenVisitaComplementaria = origenVisitaComplementaria;
	}

	public String getOrigenCierreVinculada() {
		return origenCierreVinculada;
	}

	public void setOrigenCierreVinculada(String origenCierreVinculada) {
		this.origenCierreVinculada = origenCierreVinculada;
	}

	public String getCodigoMotivoCese() {
		return codigoMotivoCese;
	}

	public void setCodigoMotivoCese(String codigoMotivoCese) {
		this.codigoMotivoCese = codigoMotivoCese;
	}

	public String getDescripcionMotivoCese() {
		return descripcionMotivoCese;
	}

	public void setDescripcionMotivoCese(String descripcionMotivoCese) {
		this.descripcionMotivoCese = descripcionMotivoCese;
	}

	public String getMotivoCambioContador() {
		return motivoCambioContador;
	}

	public void setMotivoCambioContador(String motivoCambioContador) {
		this.motivoCambioContador = motivoCambioContador;
	}

	public String getIdiomaCliente() {
		return idiomaCliente;
	}

	public void setIdiomaCliente(String idiomaCliente) {
		this.idiomaCliente = idiomaCliente;
	}

	public String getCodigoMercado() {
		return codigoMercado;
	}

	public void setCodigoMercado(String codigoMercado) {
		this.codigoMercado = codigoMercado;
	}

	public String getCodigoUnidadGestora() {
		return codigoUnidadGestora;
	}

	public void setCodigoUnidadGestora(String codigoUnidadGestora) {
		this.codigoUnidadGestora = codigoUnidadGestora;
	}

	public String getDescripcionUnidad() {
		return descripcionUnidad;
	}

	public void setDescripcionUnidad(String descripcionUnidad) {
		this.descripcionUnidad = descripcionUnidad;
	}

	public String getIndicadorUltimoCliente() {
		return indicadorUltimoCliente;
	}

	public void setIndicadorUltimoCliente(String indicadorUltimoCliente) {
		this.indicadorUltimoCliente = indicadorUltimoCliente;
	}

	public String getIndicadorClienteVIP() {
		return indicadorClienteVIP;
	}

	public void setIndicadorClienteVIP(String indicadorClienteVIP) {
		this.indicadorClienteVIP = indicadorClienteVIP;
	}

	public String getCodigoDelegacion() {
		return codigoDelegacion;
	}

	public void setCodigoDelegacion(String codigoDelegacion) {
		this.codigoDelegacion = codigoDelegacion;
	}

	public String getNombreDelegacion() {
		return nombreDelegacion;
	}

	public void setNombreDelegacion(String nombreDelegacion) {
		this.nombreDelegacion = nombreDelegacion;
	}	

	public String getCodigoCampanya() {
		return codigoCampanya;
	}

	public void setCodigoCampanya(String codigoCampanya) {
		this.codigoCampanya = codigoCampanya;
	}

	public DireccionPdS getDireccionPdS() {
		return direccionPdS;
	}

	public void setDireccionPdS(DireccionPdS direccionPdS) {
		this.direccionPdS = direccionPdS;
	}

	

	public DatosCliente getDatosCliente() {
		return datosCliente;
	}

	public void setDatosCliente(DatosCliente datosCliente) {
		this.datosCliente = datosCliente;
	}

	/**
	 * @return the datosContacto
	 */
	public DatosContacto getDatosContacto() {
		return datosContacto;
	}

	/**
	 * @param datosContacto the datosContacto to set
	 */
	public void setDatosContacto(DatosContacto datosContacto) {
		this.datosContacto = datosContacto;
	}

	/**
	 * @return the datosInstalador
	 */
	public DatosInstalador getDatosInstalador() {
		return datosInstalador;
	}

	/**
	 * @param datosInstalador the datosInstalador to set
	 */
	public void setDatosInstalador(DatosInstalador datosInstalador) {
		this.datosInstalador = datosInstalador;
	}

	/**
	 * @return the datosVisita1
	 */
	public DatosVisita getDatosVisita1() {
		return datosVisita1;
	}

	/**
	 * @param datosVisita1 the datosVisita1 to set
	 */
	public void setDatosVisita1(DatosVisita datosVisita1) {
		this.datosVisita1 = datosVisita1;
	}

	/**
	 * @return the datosVisita2
	 */
	public DatosVisita getDatosVisita2() {
		return datosVisita2;
	}

	/**
	 * @param datosVisita2 the datosVisita2 to set
	 */
	public void setDatosVisita2(DatosVisita datosVisita2) {
		this.datosVisita2 = datosVisita2;
	}

	/**
	 * @return the contratoUsoIRC
	 */
	public ContratoUsoIRC getContratoUsoIRC() {
		return contratoUsoIRC;
	}

	/**
	 * @param contratoUsoIRC the contratoUsoIRC to set
	 */
	public void setContratoUsoIRC(ContratoUsoIRC contratoUsoIRC) {
		this.contratoUsoIRC = contratoUsoIRC;
	}

	public String getTipoPuntoMedida() {
		return tipoPuntoMedida;
	}

	public void setTipoPuntoMedida(String tipoPuntoMedida) {
		this.tipoPuntoMedida = tipoPuntoMedida;
	}

	public String getCodigoUPMT() {
		return codigoUPMT;
	}

	public void setCodigoUPMT(String codigoUPMT) {
		this.codigoUPMT = codigoUPMT;
	}

	public String getCodigoUnidadSolicitante() {
		return codigoUnidadSolicitante;
	}

	public void setCodigoUnidadSolicitante(String codigoUnidadSolicitante) {
		this.codigoUnidadSolicitante = codigoUnidadSolicitante;
	}

	public String getDescripcionUnidadSolicitante() {
		return descripcionUnidadSolicitante;
	}

	public void setDescripcionUnidadSolicitante(String descripcionUnidadSolicitante) {
		this.descripcionUnidadSolicitante = descripcionUnidadSolicitante;
	}

	public String getCodigoProceso() {
		return codigoProceso;
	}

	public void setCodigoProceso(String codigoProceso) {
		this.codigoProceso = codigoProceso;
	}

	public String getDescripcionProceso() {
		return descripcionProceso;
	}

	public void setDescripcionProceso(String descripcionProceso) {
		this.descripcionProceso = descripcionProceso;
	}

	public String getCodigoMotivo() {
		return codigoMotivo;
	}

	public void setCodigoMotivo(String codigoMotivo) {
		this.codigoMotivo = codigoMotivo;
	}

	public String getDescripcionMotivo() {
		return descripcionMotivo;
	}

	public void setDescripcionMotivo(String descripcionMotivo) {
		this.descripcionMotivo = descripcionMotivo;
	}

	public String getCodigoUPMTVinculada() {
		return codigoUPMTVinculada;
	}

	public void setCodigoUPMTVinculada(String codigoUPMTVinculada) {
		this.codigoUPMTVinculada = codigoUPMTVinculada;
	}

	public String getUbicacionEventual() {
		return ubicacionEventual;
	}

	public void setUbicacionEventual(String ubicacionEventual) {
		this.ubicacionEventual = ubicacionEventual;
	}

	public String getIndicadorICMPCM() {
		return indicadorICMPCM;
	}

	public void setIndicadorICMPCM(String indicadorICMPCM) {
		this.indicadorICMPCM = indicadorICMPCM;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getTarifaObjetivo() {
		return tarifaObjetivo;
	}

	public void setTarifaObjetivo(String tarifaObjetivo) {
		this.tarifaObjetivo = tarifaObjetivo;
	}

	public String getDescripcionCampanya() {
		return descripcionCampanya;
	}

	public void setDescripcionCampanya(String descripcionCampanya) {
		this.descripcionCampanya = descripcionCampanya;
	}

	public String getPuntoActuacion() {
		return puntoActuacion;
	}

	public void setPuntoActuacion(String puntoActuacion) {
		this.puntoActuacion = puntoActuacion;
	}

	public String getDescripcionPuntoactuacion() {
		return descripcionPuntoactuacion;
	}

	public void setDescripcionPuntoactuacion(String descripcionPuntoactuacion) {
		this.descripcionPuntoactuacion = descripcionPuntoactuacion;
	}

	public String getCodigoSr() {
		return codigoSr;
	}

	public void setCodigoSr(String codigoSr) {
		this.codigoSr = codigoSr;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getCodComunidadAutonoma() {
		return codComunidadAutonoma;
	}

	public void setCodComunidadAutonoma(String codComunidadAutonoma) {
		this.codComunidadAutonoma = codComunidadAutonoma;
	}

	public String getDescComunidadAutonoma() {
		return descComunidadAutonoma;
	}

	public void setDescComunidadAutonoma(String descComunidadAutonoma) {
		this.descComunidadAutonoma = descComunidadAutonoma;
	}

	public String getCentroTransformacion() {
		return centroTransformacion;
	}

	public void setCentroTransformacion(String centroTransformacion) {
		this.centroTransformacion = centroTransformacion;
	}

	public String getIndicadorSolicitadaComercializadora() {
		return indicadorSolicitadaComercializadora;
	}

	public void setIndicadorSolicitadaComercializadora(String indicadorSolicitadaComercializadora) {
		this.indicadorSolicitadaComercializadora = indicadorSolicitadaComercializadora;
	}

	public String getIndicadorAplicaCorteAcometida() {
		return indicadorAplicaCorteAcometida;
	}

	public void setIndicadorAplicaCorteAcometida(String indicadorAplicaCorteAcometida) {
		this.indicadorAplicaCorteAcometida = indicadorAplicaCorteAcometida;
	}

	public String getIndicadorAplicaRetiradaAcometida() {
		return indicadorAplicaRetiradaAcometida;
	}

	public void setIndicadorAplicaRetiradaAcometida(String indicadorAplicaRetiradaAcometida) {
		this.indicadorAplicaRetiradaAcometida = indicadorAplicaRetiradaAcometida;
	}

	public String getIndicadorSuministroImportante() {
		return indicadorSuministroImportante;
	}

	public void setIndicadorSuministroImportante(String indicadorSuministroImportante) {
		this.indicadorSuministroImportante = indicadorSuministroImportante;
	}

	public String getIndicadorSuministroNoCortable() {
		return indicadorSuministroNoCortable;
	}

	public void setIndicadorSuministroNoCortable(String indicadorSuministroNoCortable) {
		this.indicadorSuministroNoCortable = indicadorSuministroNoCortable;
	}

	public String getIndicadorAplicaConexionAcometida() {
		return indicadorAplicaConexionAcometida;
	}

	public void setIndicadorAplicaConexionAcometida(String indicadorAplicaConexionAcometida) {
		this.indicadorAplicaConexionAcometida = indicadorAplicaConexionAcometida;
	}

	public String getIndicadorAplicaReconexionAcometida() {
		return indicadorAplicaReconexionAcometida;
	}

	public void setIndicadorAplicaReconexionAcometida(String indicadorAplicaReconexionAcometida) {
		this.indicadorAplicaReconexionAcometida = indicadorAplicaReconexionAcometida;
	}

	public String getIndicadorCorteDrastico() {
		return indicadorCorteDrastico;
	}

	public void setIndicadorCorteDrastico(String indicadorCorteDrastico) {
		this.indicadorCorteDrastico = indicadorCorteDrastico;
	}

	public String getIndicadorTrabajoEnAltura() {
		return indicadorTrabajoEnAltura;
	}

	public void setIndicadorTrabajoEnAltura(String indicadorTrabajoEnAltura) {
		this.indicadorTrabajoEnAltura = indicadorTrabajoEnAltura;
	}

	public String getNumeroCortesImpagos() {
		return numeroCortesImpagos;
	}

	public void setNumeroCortesImpagos(String numeroCortesImpagos) {
		this.numeroCortesImpagos = numeroCortesImpagos;
	}

	public Avisos getAvisos() {
		return avisos;
	}

	public void setAvisos(Avisos avisos) {
		this.avisos = avisos;
	}

	public MatrizATR getMatrizATR() {
		return matrizATR;
	}

	public void setMatrizATR(MatrizATR matrizATR) {
		this.matrizATR = matrizATR;
	}

	public Suministros getSuministros() {
		return suministros;
	}

	public void setSuministros(Suministros suministros) {
		this.suministros = suministros;
	}		
	
	
}