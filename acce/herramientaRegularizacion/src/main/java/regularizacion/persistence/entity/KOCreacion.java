package regularizacion.persistence.entity;

/**
 * Clase que da envoltura a un error de creación.
 * 
 * @author f.guillen.caro
 *
 */
public class KOCreacion {

	public KOCreacion(String codigo_operacion, String fecha_error, String error, String responsable, String accionMoma,
			String accionNegocio, String accionZeus, String estadoOperacionZeus) {
		super();
		this.codigo_operacion = codigo_operacion;
		this.fecha_error = fecha_error;
		this.error = error;
		this.responsable = responsable;
		this.accionMoma = accionMoma;
		this.accionNegocio = accionNegocio;
		this.accionZeus = accionZeus;
		this.estadoOperacionZeus = estadoOperacionZeus;
	}

	private String codigo_operacion;
	private String fecha_error;
	private String error;
	private String responsable;
	private String accionMoma;
	private String accionNegocio;
	private String accionZeus;
	private String estadoOperacionZeus;

	public KOCreacion() {
		super();
	}

	public String getCodigo_operacion() {
		return codigo_operacion;
	}

	public void setCodigo_operacion(String codigo_operacion) {
		this.codigo_operacion = codigo_operacion;
	}

	public String getFecha_error() {
		return fecha_error;
	}

	public void setFecha_error(String fecha_error) {
		this.fecha_error = fecha_error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getAccionMoma() {
		return accionMoma;
	}

	public void setAccionMoma(String accionMoma) {
		this.accionMoma = accionMoma;
	}

	public String getAccionZeus() {
		return accionZeus;
	}

	public void setAccionZeus(String accionZeus) {
		this.accionZeus = accionZeus;
	}

	public String getEstadoOperacionZeus() {
		return estadoOperacionZeus;
	}

	public void setEstadoOperacionZeus(String estadoOperacionZeus) {
		this.estadoOperacionZeus = estadoOperacionZeus;
	}

	public String getAccionNegocio() {
		return accionNegocio;
	}

	public void setAccionNegocio(String accionNegocio) {
		this.accionNegocio = accionNegocio;
	}
}
