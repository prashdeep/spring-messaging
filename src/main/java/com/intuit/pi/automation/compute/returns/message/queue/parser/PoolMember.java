package com.intuit.pi.automation.compute.returns.message.queue.parser;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoolMember {

	@JsonProperty("pool_member")	
	String poolMember;
	
	@JsonProperty("status")	
	String status;
	
	@JsonProperty("status_message")	
	String statusMessage;
	
}