package regularizacion.persistence.entity;

/**
 * Clase para guardar los datos del Excel importado y poder extraer la información
 * 
 * @author j.villegas.antunez
 *
 */
public class Extraccion {

//	public Extraccion(String Ticket_Id, String Tipo_Ticket, String Fecha_Creacion, String Estado, String Desc_Estado, String Enlace_Ppm, 
//			String Grupo_Entrada, String Grupo_Actual, String Organizacion_Soporte, String Categ_Prod1, String Categ_prod2, String Categ_prod3,
//			String Nombre_Prod, String Feacha_Resolucion, String Fecha_Cierre, String Fecha_Objetivo, String Excluir_Ans, String Fecha_Ultima_modificacion, 
//			String Canal_Entrada, String solicitud_Servicio, String Indisp_Serv, String Afecta_usuario, String Impacto, String Prioridad, 
//			String Inc_Difundida, String Localidad_cliente, String Ubicacion_cliente, String Cliente_Id, String Nombre_cliente, String Apellidos_cliente, 
//			String Ambito_Ss, String Pais_Cliente, String Resumen, String Notas, String Numero_Reasignados, String Numero_Reaperturas, String Memo, 
//			String Remitente, String Usuario_Asignado, String Resolucion, String Tipo_Incidencia, String Vip, String Fecha_Inicio_Real, 
//			String Fecha_Programada_Inicio, String Fecha_programada_Finalizacion, String Patron, String Causa_Raiz, String Grupo_Apertura, 
//			String Usuario_Resultor, String Motivo_Resolucion, String Categ_Detalle1, String Categ_Detalle2, String Categ_Detalle3, String Categ_Resolucion1, 
//			String Categ_Resolucion2, String Categ_Resolucion3, String Servicio_Afectado, String Categ_Operacional2, String Categ_Operacional3, String Pais_Enrutado, 
//			String Ci_afectado, String Empresa, String Departamento, String  Organizacion, String Priorizado, String Fecha_Priorizacion, String  Usuario_Priorizacion, 
//			String Proyecto_Origen, String Vinculacion_Cambio_Perimetro){
//		this.Ticket_Id=Ticket_Id;
//		this.Tipo_Ticket=Tipo_Ticket;
//		this.Fecha_Creacion=Fecha_Creacion;
//		this.Estado=Estado;
//		this.Desc_Estado=Desc_Estado;
//		this.Enlace_Ppm=Enlace_Ppm;
//		this.Grupo_Entrada=Grupo_Entrada;
//		this.Grupo_Actual=Grupo_Actual;
//		this.Organizacion_Soporte=Organizacion_Soporte;
//		this.Categ_Prod1=Categ_Prod1;
//		this.Categ_prod2=Categ_prod2;
//		this.Categ_prod3=Categ_prod3;
//		this.Nombre_Prod=Nombre_Prod;
//		this.Feacha_Resolucion=Feacha_Resolucion;
//		this.Fecha_Cierre=Fecha_Cierre;
//		this.Fecha_Objetivo=Fecha_Objetivo;
//		this.Excluir_Ans=Excluir_Ans;
//		this.Fecha_Ultima_modificacion=Fecha_Ultima_modificacion;
//		this.Canal_Entrada=Canal_Entrada;
//		this.solicitud_Servicio=solicitud_Servicio;
//		this.Indisp_Serv=Indisp_Serv;
//		this.Afecta_usuario=Afecta_usuario;
//		this.Impacto=Impacto;
//		this.Prioridad=Prioridad;
//		this.Inc_Difundida=Inc_Difundida;
//		this.Localidad_cliente=Localidad_cliente;
//		this.Ubicacion_cliente=Ubicacion_cliente;
//		this.Cliente_Id=Cliente_Id;
//		this.Nombre_cliente=Nombre_cliente;
//		this.Apellidos_cliente=Apellidos_cliente;
//		this.Ambito_Ss=Ambito_Ss;
//		this.Pais_Cliente=Pais_Cliente;
//		this.Resumen=Resumen;
//		this.Notas=Notas;
//		this.Numero_Reasignados=Numero_Reasignados;
//		this.Numero_Reaperturas=Numero_Reaperturas;
//		this.Memo=Memo;
//		this.Remitente=Remitente;
//		this.Usuario_Asignado=Usuario_Asignado;
//		this.Resolucion=Resolucion;
//		this.Tipo_Incidencia=Tipo_Incidencia;
//		this.Vip=Vip;
//		this.Fecha_Inicio_Real=Fecha_Inicio_Real;
//		this.Fecha_Programada_Inicio=Fecha_Programada_Inicio;
//		this.Fecha_programada_Finalizacion=Fecha_programada_Finalizacion;
//		this.Patron=Patron;
//		this.Causa_Raiz=Causa_Raiz;
//		this.Grupo_Apertura=Grupo_Apertura;
//		this.Usuario_Resultor=Usuario_Resultor;
//		this.Motivo_Resolucion=Motivo_Resolucion;
//		this.Categ_Detalle1=Categ_Detalle1;
//		this.Categ_Detalle2=Categ_Detalle2;
//		this.Categ_Detalle3=Categ_Detalle3;
//		this.Categ_Resolucion1=Categ_Resolucion1;
//		this.Categ_Resolucion2=Categ_Resolucion2;
//		this.Categ_Resolucion3=Categ_Resolucion3;
//		this.Servicio_Afectado=Servicio_Afectado;
//		this.Categ_Operacional2=Categ_Operacional2;
//		this.Categ_Operacional3=Categ_Operacional3;
//		this.Pais_Enrutado=Pais_Enrutado;
//		this.Ci_afectado=Ci_afectado;
//		this.Empresa=Empresa;
//		this.Departamento=Departamento;
//		this.Organizacion=Organizacion;
//		this.Priorizado=Priorizado;
//		this.Fecha_Priorizacion=Fecha_Priorizacion;
//		this.Usuario_Priorizacion=Usuario_Priorizacion;
//		this.Proyecto_Origen=Proyecto_Origen;
//		this.Vinculacion_Cambio_Perimetro=Vinculacion_Cambio_Perimetro;
//		
//	}
	
	private String Ticket_Id;
	private String Tipo_Ticket;
	private String Fecha_Creacion;
	private String Estado;
	private String Desc_Estado;
	private String Enlace_Ppm;
	private String Grupo_Entrada;
	private String Grupo_Actual;
	private String Organizacion_Soporte;
	private String Categ_Prod1;
	private String Categ_prod2;
	private String Categ_prod3;
	private String Nombre_Prod;
	private String Feacha_Resolucion;
	private String Fecha_Cierre;
	private String Fecha_Objetivo;
	private String Excluir_Ans;
	private String Fecha_Ultima_modificacion;
	private String Canal_Entrada;
	private String Solicitud_Servicio;
	private String Indisp_Serv;
	private String Afecta_usuario;
	private String Impacto;
	private String Prioridad;
	private String Inc_Difundida;
	private String Localidad_cliente;
	private String Ubicacion_cliente;
	private String Cliente_Id;
	private String Nombre_cliente;
	private String Apellidos_cliente;
	private String Ambito_Ss;
	private String Pais_Cliente;
	private String Resumen;
	private String Notas;
	private String Numero_Reasignados;
	private String Numero_Reaperturas;
	private String Memo;
	private String Remitente;
	private String Usuario_Asignado;
	private String Resolucion;
	private String Tipo_Incidencia;
	private String Vip;
	private String Fecha_Inicio_Real;
	private String Fecha_Programada_Inicio;
	private String Fecha_programada_Finalizacion;
	private String Patron;
	private String Causa_Raiz;
	private String Grupo_Apertura;
	private String Usuario_Resultor;
	private String Motivo_Resolucion;
	private String Categ_Detalle1;
	private String Categ_Detalle2;
	private String Categ_Detalle3;
	private String Categ_Resolucion1;
	private String Categ_Resolucion2;
	private String Categ_Resolucion3;
	private String Servicio_Afectado;
	private String Categ_Operacional2;
	private String Categ_Operacional3;
	private String Pais_Enrutado;
	private String Fecha_Cierre_Calculo;
	private String Fecha_Creacion_Calculo;
	private String Entre0y4;
	private String Entre5y14;
	private String Entre15y20;
	private String Mayor20;
	private String Fecha_Extraccion;
	private String Entrada;
	private String Cerrados;
	private String Grupo_Ans;
	private String Devueltas_Nosotros;
	private String Reasignadas_Otros;
	private String Mes;
	private String Mes_Cierre_Automático;
	
//	private String Ci_afectado;
//	private String Empresa;
//	private String Departamento;
//	private String Organizacion;
//	private String Priorizado;
//	private String Fecha_Priorizacion;
//	private String Usuario_Priorizacion;
//	private String Proyecto_Origen;
//	private String Vinculacion_Cambio_Perimetro;
	
	public Extraccion(){
		super();
	}
	
	public String getTicket_Id() {
		return Ticket_Id;
	}
	public void setTicket_Id(String ticket_Id) {
		Ticket_Id = ticket_Id;
	}
	public String getTipo_Ticket() {
		return Tipo_Ticket;
	}
	public void setTipo_Ticket(String tipo_Ticket) {
		Tipo_Ticket = tipo_Ticket;
	}
	public String getFecha_Creacion() {
		return Fecha_Creacion;
	}
	public void setFecha_Creacion(String fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getDesc_Estado() {
		return Desc_Estado;
	}
	public void setDesc_Estado(String desc_Estado) {
		Desc_Estado = desc_Estado;
	}
	public String getEnlace_Ppm() {
		return Enlace_Ppm;
	}
	public void setEnlace_Ppm(String enlace_Ppm) {
		Enlace_Ppm = enlace_Ppm;
	}
	public String getGrupo_Entrada() {
		return Grupo_Entrada;
	}
	public void setGrupo_Entrada(String grupo_Entrada) {
		Grupo_Entrada = grupo_Entrada;
	}
	public String getGrupo_Actual() {
		return Grupo_Actual;
	}
	public void setGrupo_Actual(String grupo_Actual) {
		Grupo_Actual = grupo_Actual;
	}
	public String getOrganizacion_Soporte() {
		return Organizacion_Soporte;
	}
	public void setOrganizacion_Soporte(String organizacion_Soporte) {
		Organizacion_Soporte = organizacion_Soporte;
	}
	public String getCateg_Prod1() {
		return Categ_Prod1;
	}
	public void setCateg_Prod1(String categ_Prod1) {
		Categ_Prod1 = categ_Prod1;
	}
	public String getCateg_prod2() {
		return Categ_prod2;
	}
	public void setCateg_prod2(String categ_prod2) {
		Categ_prod2 = categ_prod2;
	}
	public String getCateg_prod3() {
		return Categ_prod3;
	}
	public void setCateg_prod3(String categ_prod3) {
		Categ_prod3 = categ_prod3;
	}
	public String getNombre_Prod() {
		return Nombre_Prod;
	}
	public void setNombre_Prod(String nombre_Prod) {
		Nombre_Prod = nombre_Prod;
	}
	public String getFeacha_Resolucion() {
		return Feacha_Resolucion;
	}
	public void setFeacha_Resolucion(String feacha_Resolucion) {
		Feacha_Resolucion = feacha_Resolucion;
	}
	public String getFecha_Cierre() {
		return Fecha_Cierre;
	}
	public void setFecha_Cierre(String fecha_Cierre) {
		Fecha_Cierre = fecha_Cierre;
	}
	public String getFecha_Objetivo() {
		return Fecha_Objetivo;
	}
	public void setFecha_Objetivo(String fecha_Objetivo) {
		Fecha_Objetivo = fecha_Objetivo;
	}
	public String getExcluir_Ans() {
		return Excluir_Ans;
	}
	public void setExcluir_Ans(String excluir_Ans) {
		Excluir_Ans = excluir_Ans;
	}
	public String getFecha_Ultima_modificacion() {
		return Fecha_Ultima_modificacion;
	}
	public void setFecha_Ultima_modificacion(String fecha_Ultima_modificacion) {
		Fecha_Ultima_modificacion = fecha_Ultima_modificacion;
	}
	public String getCanal_Entrada() {
		return Canal_Entrada;
	}
	public void setCanal_Entrada(String canal_Entrada) {
		Canal_Entrada = canal_Entrada;
	}
	public String getSolicitud_Servicio() {
		return Solicitud_Servicio;
	}
	public void setSolicitud_Servicio(String Solicitud_Servicio) {
		this.Solicitud_Servicio = Solicitud_Servicio;
	}
	public String getIndisp_Serv() {
		return Indisp_Serv;
	}
	public void setIndisp_Serv(String indisp_Serv) {
		Indisp_Serv = indisp_Serv;
	}
	public String getAfecta_usuario() {
		return Afecta_usuario;
	}
	public void setAfecta_usuario(String afecta_usuario) {
		Afecta_usuario = afecta_usuario;
	}
	public String getImpacto() {
		return Impacto;
	}
	public void setImpacto(String impacto) {
		Impacto = impacto;
	}
	public String getPrioridad() {
		return Prioridad;
	}
	public void setPrioridad(String prioridad) {
		Prioridad = prioridad;
	}
	public String getInc_Difundida() {
		return Inc_Difundida;
	}
	public void setInc_Difundida(String inc_Difundida) {
		Inc_Difundida = inc_Difundida;
	}
	public String getLocalidad_cliente() {
		return Localidad_cliente;
	}
	public void setLocalidad_cliente(String localidad_cliente) {
		Localidad_cliente = localidad_cliente;
	}
	public String getUbicacion_cliente() {
		return Ubicacion_cliente;
	}
	public void setUbicacion_cliente(String ubicacion_cliente) {
		Ubicacion_cliente = ubicacion_cliente;
	}
	public String getCliente_Id() {
		return Cliente_Id;
	}
	public void setCliente_Id(String cliente_Id) {
		Cliente_Id = cliente_Id;
	}
	public String getNombre_cliente() {
		return Nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		Nombre_cliente = nombre_cliente;
	}
	public String getApellidos_cliente() {
		return Apellidos_cliente;
	}
	public void setApellidos_cliente(String apellidos_cliente) {
		Apellidos_cliente = apellidos_cliente;
	}
	public String getAmbito_Ss() {
		return Ambito_Ss;
	}
	public void setAmbito_Ss(String ambito_Ss) {
		Ambito_Ss = ambito_Ss;
	}
	public String getPais_Cliente() {
		return Pais_Cliente;
	}
	public void setPais_Cliente(String pais_Cliente) {
		Pais_Cliente = pais_Cliente;
	}
	public String getResumen() {
		return Resumen;
	}
	public void setResumen(String resumen) {
		Resumen = resumen;
	}
	public String getNotas() {
		return Notas;
	}
	public void setNotas(String notas) {
		Notas = notas;
	}
	public String getNumero_Reasignados() {
		return Numero_Reasignados;
	}
	public void setNumero_Reasignados(String numero_Reasignados) {
		Numero_Reasignados = numero_Reasignados;
	}
	public String getNumero_Reaperturas() {
		return Numero_Reaperturas;
	}
	public void setNumero_Reaperturas(String numero_Reaperturas) {
		Numero_Reaperturas = numero_Reaperturas;
	}
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String memo) {
		Memo = memo;
	}
	public String getRemitente() {
		return Remitente;
	}
	public void setRemitente(String remitente) {
		Remitente = remitente;
	}
	public String getUsuario_Asignado() {
		return Usuario_Asignado;
	}
	public void setUsuario_Asignado(String usuario_Asignado) {
		Usuario_Asignado = usuario_Asignado;
	}
	public String getResolucion() {
		return Resolucion;
	}
	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}
	public String getTipo_Incidencia() {
		return Tipo_Incidencia;
	}
	public void setTipo_Incidencia(String tipo_Incidencia) {
		Tipo_Incidencia = tipo_Incidencia;
	}
	public String getVip() {
		return Vip;
	}
	public void setVip(String vip) {
		Vip = vip;
	}
	public String getFecha_Inicio_Real() {
		return Fecha_Inicio_Real;
	}
	public void setFecha_Inicio_Real(String fecha_Inicio_Real) {
		Fecha_Inicio_Real = fecha_Inicio_Real;
	}
	public String getFecha_Programada_Inicio() {
		return Fecha_Programada_Inicio;
	}
	public void setFecha_Programada_Inicio(String fecha_Programada_Inicio) {
		Fecha_Programada_Inicio = fecha_Programada_Inicio;
	}
	public String getFecha_programada_Finalizacion() {
		return Fecha_programada_Finalizacion;
	}
	public void setFecha_programada_Finalizacion(String fecha_programada_Finalizacion) {
		Fecha_programada_Finalizacion = fecha_programada_Finalizacion;
	}
	public String getPatron() {
		return Patron;
	}
	public void setPatron(String patron) {
		Patron = patron;
	}
	public String getCausa_Raiz() {
		return Causa_Raiz;
	}
	public void setCausa_Raiz(String causa_Raiz) {
		Causa_Raiz = causa_Raiz;
	}
	public String getGrupo_Apertura() {
		return Grupo_Apertura;
	}
	public void setGrupo_Apertura(String grupo_Apertura) {
		Grupo_Apertura = grupo_Apertura;
	}
	public String getUsuario_Resultor() {
		return Usuario_Resultor;
	}
	public void setUsuario_Resultor(String usuario_Resultor) {
		Usuario_Resultor = usuario_Resultor;
	}
	public String getMotivo_Resolucion() {
		return Motivo_Resolucion;
	}
	public void setMotivo_Resolucion(String motivo_Resolucion) {
		Motivo_Resolucion = motivo_Resolucion;
	}
	public String getCateg_Detalle1() {
		return Categ_Detalle1;
	}
	public void setCateg_Detalle1(String categ_Detalle1) {
		Categ_Detalle1 = categ_Detalle1;
	}
	public String getCateg_Detalle2() {
		return Categ_Detalle2;
	}
	public void setCateg_Detalle2(String categ_Detalle2) {
		Categ_Detalle2 = categ_Detalle2;
	}
	public String getCateg_Detalle3() {
		return Categ_Detalle3;
	}
	public void setCateg_Detalle3(String categ_Detalle3) {
		Categ_Detalle3 = categ_Detalle3;
	}
	public String getCateg_Resolucion1() {
		return Categ_Resolucion1;
	}
	public void setCateg_Resolucion1(String categ_Resolucion1) {
		Categ_Resolucion1 = categ_Resolucion1;
	}
	public String getCateg_Resolucion2() {
		return Categ_Resolucion2;
	}
	public void setCateg_Resolucion2(String categ_Resolucion2) {
		Categ_Resolucion2 = categ_Resolucion2;
	}
	public String getCateg_Resolucion3() {
		return Categ_Resolucion3;
	}
	public void setCateg_Resolucion3(String categ_Resolucion3) {
		Categ_Resolucion3 = categ_Resolucion3;
	}
	public String getServicio_Afectado() {
		return Servicio_Afectado;
	}
	public void setServicio_Afectado(String servicio_Afectado) {
		Servicio_Afectado = servicio_Afectado;
	}
	public String getCateg_Operacional2() {
		return Categ_Operacional2;
	}
	public void setCateg_Operacional2(String categ_Operacional2) {
		Categ_Operacional2 = categ_Operacional2;
	}
	public String getCateg_Operacional3() {
		return Categ_Operacional3;
	}
	public void setCateg_Operacional3(String categ_Operacional3) {
		Categ_Operacional3 = categ_Operacional3;
	}
	public String getPais_Enrutado() {
		return Pais_Enrutado;
	}
	public void setPais_Enrutado(String pais_Enrutado) {
		Pais_Enrutado = pais_Enrutado;
	}

	public String getFecha_Cierre_Calculo() {
		return Fecha_Cierre_Calculo;
	}

	public void setFecha_Cierre_Calculo(String fecha_Cierre_Calculo) {
		Fecha_Cierre_Calculo = fecha_Cierre_Calculo;
	}

	public String getFecha_Creacion_Calculo() {
		return Fecha_Creacion_Calculo;
	}

	public void setFecha_Creacion_Calculo(String fecha_Creacion_Calculo) {
		Fecha_Creacion_Calculo = fecha_Creacion_Calculo;
	}

	public String getEntre0y4() {
		return Entre0y4;
	}

	public void setEntre0y4(String entre0y4) {
		Entre0y4 = entre0y4;
	}

	public String getEntre5y14() {
		return Entre5y14;
	}

	public void setEntre5y14(String entre5y14) {
		Entre5y14 = entre5y14;
	}

	public String getEntre15y20() {
		return Entre15y20;
	}

	public void setEntre15y20(String entre15y20) {
		Entre15y20 = entre15y20;
	}

	public String getMayor20() {
		return Mayor20;
	}

	public void setMayor20(String mayor20) {
		Mayor20 = mayor20;
	}

	public String getFecha_Extraccion() {
		return Fecha_Extraccion;
	}

	public void setFecha_Extraccion(String fecha_Extraccion) {
		Fecha_Extraccion = fecha_Extraccion;
	}

	public String getEntrada() {
		return Entrada;
	}

	public void setEntrada(String entrada) {
		Entrada = entrada;
	}

	public String getCerrados() {
		return Cerrados;
	}

	public void setCerrados(String cerrados) {
		Cerrados = cerrados;
	}

	public String getGrupo_Ans() {
		return Grupo_Ans;
	}

	public void setGrupo_Ans(String grupo_Ans) {
		Grupo_Ans = grupo_Ans;
	}

	public String getDevueltas_Nosotros() {
		return Devueltas_Nosotros;
	}

	public void setDevueltas_Nosotros(String devueltas_Nosotros) {
		Devueltas_Nosotros = devueltas_Nosotros;
	}

	public String getReasignadas_Otros() {
		return Reasignadas_Otros;
	}

	public void setReasignadas_Otros(String reasignadas_Otros) {
		Reasignadas_Otros = reasignadas_Otros;
	}

	public String getMes() {
		return Mes;
	}

	public void setMes(String mes) {
		Mes = mes;
	}

	public String getMes_Cierre_Automático() {
		return Mes_Cierre_Automático;
	}

	public void setMes_Cierre_Automático(String mes_Cierre_Automático) {
		Mes_Cierre_Automático = mes_Cierre_Automático;
	}
	
//	public String getCi_afectado() {
//		return Ci_afectado;
//	}
//	public void setCi_afectado(String ci_afectado) {
//		Ci_afectado = ci_afectado;
//	}
//	public String getEmpresa() {
//		return Empresa;
//	}
//	public void setEmpresa(String empresa) {
//		Empresa = empresa;
//	}
//	public String getDepartamento() {
//		return Departamento;
//	}
//	public void setDepartamento(String departamento) {
//		Departamento = departamento;
//	}
//	public String getOrganizacion() {
//		return Organizacion;
//	}
//	public void setOrganizacion(String organizacion) {
//		Organizacion = organizacion;
//	}
//	public String getPriorizado() {
//		return Priorizado;
//	}
//	public void setPriorizado(String priorizado) {
//		Priorizado = priorizado;
//	}
//	public String getFecha_Priorizacion() {
//		return Fecha_Priorizacion;
//	}
//	public void setFecha_Priorizacion(String fecha_Priorizacion) {
//		Fecha_Priorizacion = fecha_Priorizacion;
//	}
//	public String getUsuario_Priorizacion() {
//		return Usuario_Priorizacion;
//	}
//	public void setUsuario_Priorizacion(String usuario_Priorizacion) {
//		Usuario_Priorizacion = usuario_Priorizacion;
//	}
//	public String getProyecto_Origen() {
//		return Proyecto_Origen;
//	}
//	public void setProyecto_Origen(String proyecto_Origen) {
//		Proyecto_Origen = proyecto_Origen;
//	}
//	public String getVinculacion_Cambio_Perimetro() {
//		return Vinculacion_Cambio_Perimetro;
//	}
//	public void setVinculacion_Cambio_Perimetro(String vinculacion_Cambio_Perimetro) {
//		Vinculacion_Cambio_Perimetro = vinculacion_Cambio_Perimetro;
//	}
	
	
}
