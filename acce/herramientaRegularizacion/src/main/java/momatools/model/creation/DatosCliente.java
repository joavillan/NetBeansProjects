package momatools.model.creation;

public class DatosCliente {
	private String nombre;
	private String numeroDocumento;
	private String telefonoFijo;
	private String telefonoMovil;
	private String telefonoMovilFacilitado;
	private String telefonoFijoFacilitado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getTelefonoMovilFacilitado() {
		return telefonoMovilFacilitado;
	}

	public void setTelefonoMovilFacilitado(String telefonoMovilFacilitado) {
		this.telefonoMovilFacilitado = telefonoMovilFacilitado;
	}

	public String getTelefonoFijoFacilitado() {
		return telefonoFijoFacilitado;
	}

	public void setTelefonoFijoFacilitado(String telefonoFijoFacilitado) {
		this.telefonoFijoFacilitado = telefonoFijoFacilitado;
	}

	public DireccionPdS getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionPdS direccion) {
		this.direccion = direccion;
	}

	private DireccionPdS direccion;
}
