package com.jms.spring.integration;

import javax.jms.JMSException;
import javax.jms.QueueConnectionFactory;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestMessageSenderWithoutSpring {

	public static void main(String[] args) throws JMSException, NamingException {

		//Crude way of sending the messages to the queue
//		QueueConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
//		QueueConnection connection = connectionFactory.createQueueConnection();
//		QueueSession session = connection.createQueueSession(false, Session.CLIENT_ACKNOWLEDGE);
//		TextMessage txtMessage = session.createTextMessage("Simple text message");
//
//		QueueSender queueSender = session.createSender(new ActiveMQQueue("TestQueue"));
//
//		queueSender.send(txtMessage);
//		session.close();
//		connection.close();
		
		//setting up the JNDI context
		
		InitialContext context = new InitialContext();
		
		QueueConnectionFactory connectionFactory = (QueueConnectionFactory)context.lookup("connectionFactory");
	}
}
