package com.intuit.pi.automation.compute.returns.message.queue.parser;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



public class PayloadHeader<T> {

	@JsonProperty("component")	
	String component;
	
	@JsonProperty("action_name")	
	String actionName;
	
	@JsonProperty("overall_status")	
	String overallStatus;
	
	@JsonProperty("requestor_userid")	
	String requestorUserid;
	
	@JsonProperty("processed_date")	
	String processedDate;
	
	@JsonProperty("request_date")	
	String requestDate;
	
	@JsonProperty("details")	
	List<T> details;

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getOverallStatus() {
		return overallStatus;
	}

	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

	public String getRequestorUserid() {
		return requestorUserid;
	}

	public void setRequestorUserid(String requestorUserid) {
		this.requestorUserid = requestorUserid;
	}

	public String getProcessedDate() {
		return processedDate;
	}

	public void setProcessedDate(String processedDate) {
		this.processedDate = processedDate;
	}

	
	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public List<T> getDetails() {
		return details;
	}

	public void setDetails(List<T> details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "PayloadHeader [component=" + component + ", actionName=" + actionName + ", overallStatus="
				+ overallStatus + ", requestorUserid=" + requestorUserid + ", processedDate=" + processedDate
				+ ", requestDate=" + requestDate + ", details=" + details + "]";
	}



	
}