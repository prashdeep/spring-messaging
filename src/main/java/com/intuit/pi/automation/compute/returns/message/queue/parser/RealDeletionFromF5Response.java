package com.intuit.pi.automation.compute.returns.message.queue.parser;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RealDeletionFromF5Response {


	@JsonProperty("request_uuid")	
	String requestUuid;
	
	@JsonProperty("entity_id")	
	String entityId;
	
	@JsonProperty("pool_members")	
	List<PoolMember> poolMembersList;
	
}