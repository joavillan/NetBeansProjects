package momatools.model.creation;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Etapa0OOEE {
	@XStreamAlias("peticion")
	private PeticionOOEE peticion;

	public PeticionOOEE getPeticion() {
		return peticion;
	}

	public void setPeticion(PeticionOOEE peticion) {
		this.peticion = peticion;
	}
}
