package momatools.model.creation;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Etapa0 {
	@XStreamAlias("peticion")
	private Peticion peticion;

	public Peticion getPeticion() {
		return peticion;
	}

	public void setPeticion(Peticion peticion) {
		this.peticion = peticion;
	}
}
