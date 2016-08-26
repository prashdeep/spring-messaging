package com.intuit.pi.automation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Message")
public class PersistDLQMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer messageId;

	@Override
	public String toString() {
		return "PersistDLQMessage [messageId=" + messageId + ", message=" + message + "]";
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;

}
