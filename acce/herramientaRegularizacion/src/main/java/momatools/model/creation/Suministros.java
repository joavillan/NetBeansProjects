package momatools.model.creation;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Suministros {


//	private List<Suministro> suministros;
	@XStreamImplicit
	private List<Suministro> suministro;
//	
//
//	public List<Suministro> getSuministros() {
//		return suministros;
//	}
//
//	public void setSuministros(List<Suministro> suministros) {
//		this.suministros = suministros;
//	}

	public List<Suministro> getSuministro() {
		return suministro;
	}

	public void setSuministro(List<Suministro> suministro) {
		this.suministro = suministro;
	}
	

}
