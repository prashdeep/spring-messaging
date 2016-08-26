package com.jms.spring.integration;

import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.intuit.pi.automation.compute.returns.message.queue.parser.PayloadHeader;

@Component ("myCustomTransformer")
public class MyCustomTransformer {

	@Transformer
	public Message<PayloadHeader> converToPayloadHeader(Message<String> message){
		
		System.out.println("Came inside the convertToPayloadHeader method....");
		 return MessageBuilder.withPayload(new PayloadHeader()).copyHeaders(message.getHeaders()).build();		
	}
	
}
