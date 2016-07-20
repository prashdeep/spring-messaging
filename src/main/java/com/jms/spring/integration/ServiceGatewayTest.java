package com.jms.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceGatewayTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("gateway-config.xml");
	}
}
