package regularizacion.persistence.entity;

/**
 * Clase que da envoltura a un error backend.
 * 
 * @author f.guillen.caro
 *
 */
public class BackendErrorOrder {

	private String identificador;
	private String operacion_code;
	private String update_date;
	private String process_status;
	private String cod_team;
	private String mensaje_error_integracion;

	public BackendErrorOrder() {
		super();
	}

	public BackendErrorOrder(String id, String operacion_code, String process_status, String cod_team,
			String update_date, String mensaje_error) {
		identificador = id;
		this.operacion_code = operacion_code;
		this.process_status = process_status;
		this.cod_team = cod_team;
		this.update_date = update_date;
		this.mensaje_error_integracion = mensaje_error;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getOperacion_code() {
		return operacion_code;
	}

	public void setOperacion_code(String operacion_code) {
		this.operacion_code = operacion_code;
	}

	public String getProcess_status() {
		return process_status;
	}

	public void setProcess_status(String process_status) {
		this.process_status = process_status;
	}

	public String getCod_team() {
		return cod_team;
	}

	public void setCod_team(String cod_team) {
		this.cod_team = cod_team;
	}

	public String getMensaje_error_integracion() {
		return mensaje_error_integracion;
	}

	public void setMensaje_error_integracion(String mensaje_error_integracion) {
		this.mensaje_error_integracion = mensaje_error_integracion;
	}
}
