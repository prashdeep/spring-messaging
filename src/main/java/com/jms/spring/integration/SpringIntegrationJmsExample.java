package com.jms.spring.integration;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.lf5.LogLevel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class SpringIntegrationJmsExample {
	
	private static Logger logger = Logger.getLogger(SpringIntegrationJmsExample.class);

	private JmsTemplate jmsTemplate;

	private static int counter = 0;

	public void setJmsTemplate(JmsTemplate jmsTempate) {
		this.jmsTemplate = jmsTempate;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void handleIPPark(String str) {
		System.out.println("Handling the response message from the jms");

		// counter++;
		// System.out.println("Counter >> "+counter);
		// throw new RuntimeException("Throwing some runtime exception....");
	}

	public void handleDeleteF5FromDevice(String str) throws InterruptedException {
		System.out.println("handleDeleteF5FromDevice");

		Thread.sleep(1000 * 60 * 60);

		System.out.println("Woke up after one hour....");
		System.out.println(str);
		throw new RuntimeException("Throwing some runtime exception....");
	}

	public String deleteACLMessageChannel(String str) {
		System.out.println("deleteACLMessageChannel");
		return "23445";
	}
	
	public int generateRandomNumber(){
		logger.log(Priority.INFO, "Generating the random number");
		return (int) Math.random();
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Message<String> message = MessageBuilder.withPayload("Pradeep").build();
		
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
			
		channel.send(message);
	}
}
