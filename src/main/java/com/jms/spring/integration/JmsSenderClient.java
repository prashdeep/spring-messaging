package com.jms.spring.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class JmsSenderClient {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	public static void main(String[] args) {
		
	}

}
