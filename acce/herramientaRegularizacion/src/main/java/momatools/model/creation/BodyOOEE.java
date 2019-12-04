package momatools.model.creation;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class BodyOOEE {

	@XStreamAlias("INT-MOV-002")
	private OrderDetailsOOEE creation;
	public OrderDetailsOOEE getCreation() {
		return creation;
	}

	public void setCreation(OrderDetailsOOEE creation) {
		this.creation = creation;
	}
//	@XStreamAlias("INT-MOV-002")
//	private OrderDetails creation;
//
//	
//	public OrderDetails getCreation() {
//		return creation;
//	}
//
//	public void setCreation(OrderDetails creation01) {
//		this.creation = creation01;
//	}


	@XStreamAlias("INT-MOV-007")
	private OrderDetailsOOEE anulacion;//anulacion y nack
	
	public OrderDetailsOOEE getAnulacion() {
		return anulacion;
	}

	public void setAnulacion(OrderDetailsOOEE anulacion) {
		this.anulacion = anulacion;
	}

//	@XStreamAlias("INT-MOV-007")
//	private OrderDetails anulacion;//anulacion y nack
//	
//	public OrderDetails getAnulacion() {
//		return anulacion;
//	}
//
//	public void setAnulacion(OrderDetails anulacion) {
//		this.anulacion = anulacion;
//	}

	
	@XStreamAlias("INT-MOV-004")
	private OrderDetailsOOEE modificacion;//modificacion
	
	public OrderDetailsOOEE getModificacion() {
		return modificacion;
	}

	public void setModificacion(OrderDetailsOOEE modificacion) {
		this.modificacion = modificacion;
	}
	
//	@XStreamAlias("INT-MOV-004")
//	private OrderDetails modificacion;//modificacion
//	
//	public OrderDetails getModificacion() {
//		return modificacion;
//	}
//
//	public void setModificacion(OrderDetails modificacion) {
//		this.modificacion = modificacion;
//	}
	
	
	@XStreamAlias("INT-MOV-009")
	private OrderDetailsOOEE ack;//
	
	public OrderDetailsOOEE getAck() {
		return ack;
	}

	public void setAck(OrderDetailsOOEE ack) {
		this.ack = ack;
	}
	
//	@XStreamAlias("INT-MOV-009")
//	private OrderDetails ack;//
//	
//	public OrderDetails getAck() {
//		return ack;
//	}
//
//	public void setAck(OrderDetails ack) {
//		this.ack = ack;
//	}
	
	
}
