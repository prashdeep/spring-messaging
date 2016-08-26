package com.intuit.pi.automation.compute.returns.message.queue.parser;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IPParkDetail {

	@JsonProperty("request_uuid")	
	String requestUuid;
	
	@JsonProperty("entity_id")	
	String entityId;
	
	@JsonProperty("decomm_ips")	
	List<DecomIP> decommIpsList;

	public String getRequestUuid() {
		return requestUuid;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public List<DecomIP> getDecommIps() {
		return decommIpsList;
	}

	public void setDecommIps(List<DecomIP> decommIps) {
		this.decommIpsList = decommIps;
	}
	
	
}