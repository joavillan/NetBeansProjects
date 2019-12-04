package momatools.model.creation;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * XML completo de una traza 0
 * 
 * <Envelope id="MOMAES0000010000">

    <Body>
        <etapa00>
            <peticion timestamp="2016-12-01T09:50:01.984+01:00">
                <INT-MOV-002>
 * 
 * @author l.lorenzoriesco
 *
 */
@XStreamAlias("Envelope")
public class Traza0 {

   	@XStreamAsAttribute
   	private String id;

	@XStreamAlias("Body")
	private BodyTraza0 body;

	public BodyTraza0 getBody() {
		return body;
	}

	public void setBody(BodyTraza0 body) {
		this.body = body;
	}


}
