package regularizacion.persistence.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MOMA_TRACE_LOG")
public class MomaTraceLog implements Serializable{
	private long identificador;

	private String workOrder;
	
	private Date createDate;
	
	private Blob messageStatus;
	
	private String envelopeId;
	
	

	public MomaTraceLog() {
		super();
	}

	@javax.persistence.Id
	@Column(name = "ID_TRACE_LOG")
	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}
	

	@Column(name = "WORK_ORDER")
	public String getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(String workOrder) {
		this.workOrder = workOrder;
	}

	@Column(name = "CREATE_DATE")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "MESSAGE_STATUS")
	public Blob getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(Blob messageStatus) {
		this.messageStatus = messageStatus;
	}

	@Column(name = "ENVELOPE_ID")
	public String getEnvelopeId() {
		return envelopeId;
	}

	public void setEnvelopeId(String envelopeId) {
		this.envelopeId = envelopeId;
	}
}
