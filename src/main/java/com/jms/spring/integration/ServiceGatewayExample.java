package com.jms.spring.integration;

public class ServiceGatewayExample {

	public void handleInputMessage(String str) throws InterruptedException {
		System.out.println("Came inside the handleInputMessage function >>>>");
		Thread.sleep(5000);
		System.out.println("Came inside the handleInputMessage function");
	}

}
