package agent.toatech;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;


public class AgentSender {
	
	String url;
	long messageId;
	String subject;
	String body;
	
	public AgentSender(){
		url = "";
		messageId = 0;
		subject = "";
		body = "";
	}
	
	public AgentSender(String url, long messageId, String subject, String body){
		this.url = url;
		this.messageId = messageId;
		this.subject = subject;
		this.body = body;
	}
	
	public void send_message(){
		try{
			@SuppressWarnings("restriction")
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();
			
			SOAPMessage soapResponse = soapConnection.call(createSoapRequest(), url);
			System.out.println("RESPONSE SOAP MESSAGE");
			soapResponse.writeTo(System.out);
			soapConnection.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	private SOAPMessage createSoapRequest() throws Exception
	{
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();
		SOAPEnvelope envelope = soapPart.getEnvelope();
		
		envelope.addNamespaceDeclaration("urn", "urn:toatech:agent");
		
		//HEADER
		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", "agent_service/send_message");
		
		//BODY
		getAgentBody(envelope);
		soapMessage.saveChanges();
		System.out.println("Request SOAP Message");
		soapMessage.writeTo(System.out);
		
		return soapMessage;
	}
	
	private void getAgentBody(SOAPEnvelope envelope) throws Exception{
		SOAPBody soapBody = envelope.getBody();
		SOAPElement send_message = soapBody.addChildElement("send_message","urn");
		//USER
		SOAPElement user = send_message.addChildElement("user","urn");
		SOAPElement now = user.addChildElement("now","urn");
		SOAPElement company = user.addChildElement("company","urn");
		SOAPElement login = user.addChildElement("login","urn");
		SOAPElement auth_string = user.addChildElement("auth_string","urn");
		//MESSAGES
		SOAPElement messages = send_message.addChildElement("messages","urn");
		//MESSAGE
		SOAPElement message = messages.addChildElement("message","urn");
		SOAPElement app_host = message.addChildElement("app_host","urn");
		SOAPElement app_port = message.addChildElement("app_port","urn");
		SOAPElement app_url = message.addChildElement("app_url","urn");
		SOAPElement message_id = message.addChildElement("message_id","urn");
		SOAPElement address = message.addChildElement("address","urn");
		SOAPElement send_to = message.addChildElement("send_to","urn");
		SOAPElement subject = message.addChildElement("subject","urn");
		SOAPElement body = message.addChildElement("body","urn");
		
		user.addTextNode("");
		now.addTextNode("");
		company.addTextNode("");
		login.addTextNode("");
		auth_string.addTextNode("");
		app_host.addTextNode("");
		app_port.addTextNode("0");
		message_id.addTextNode("" + messageId);
		address.addTextNode("");
		send_to.addTextNode("");
		subject.addTextNode(this.subject);
		body.addTextNode(this.body);
	}
}
