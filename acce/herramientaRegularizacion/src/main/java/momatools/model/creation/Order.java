package momatools.model.creation;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Clase que envuelve la creacion de ordenes y posiblemente el resto de flujos
 * 
 * @author l.lorenzoriesco
 *
 */
@XStreamAlias("Envelope")
public class Order {

   	@XStreamAsAttribute
   	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XStreamAlias("Body")
	private Body body;

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}


}
