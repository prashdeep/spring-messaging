package com.intuit.pi.automation.compute.returns.message.queue.parser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DecomIP {

	@JsonProperty("ip_address")	
	String ipAddress;
	
	@JsonProperty("entity_id")	
	String entityId;
	
	@JsonProperty("status_message")	
	String statusMessage;

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
}