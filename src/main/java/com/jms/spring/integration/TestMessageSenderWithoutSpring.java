package com.jms.spring.integration;

import java.util.UUID;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQMessageProducer;

public class TestMessageSenderWithoutSpring {

	public static void main(String[] args) throws JMSException, NamingException {

		QueueConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://10.6.2.118:61616");

		QueueConnection connection = connectionFactory.createQueueConnection(
				"intuit.pi.computereturns.netgenie.producer", "preprddGdoRWyiZpYtah9PjnmCwtfV76gQSLO78F");

		QueueSession session = connection.createQueueSession(false, Session.CLIENT_ACKNOWLEDGE);
		Destination destination = session
				.createQueue("Intuit.global.dev.pi.computereturns.NetgenieV1.Queue");

		ActiveMQMessageProducer producer = (ActiveMQMessageProducer) session.createProducer(destination);
		TextMessage message = (TextMessage) session.createTextMessage("My Test Message");
		message.setStringProperty("intuit_appid", "intuit.pi.computereturns.netgenie.producer");
		message.setStringProperty("intuit_offeringid", "intuit.pi.computereturns.netgenie.producer");
		message.setStringProperty("intuit_tid", UUID.randomUUID().toString());
		message.setStringProperty("intuit_locale", "en_US");
		message.setStringProperty("intuit_country", "US");
		
		TextMessage message2 = (TextMessage) session.createTextMessage("My Test Message");
		message2.setStringProperty("intuit_appid", "intuit.pi.computereturns.netgenie.producer");
		message2.setStringProperty("intuit_offeringid", "intuit.pi.computereturns.netgenie.producer");
		message2.setStringProperty("intuit_tid", UUID.randomUUID().toString());
		message2.setStringProperty("intuit_locale", "en_US");
		message2.setStringProperty("intuit_country", "US");

		producer.send(message2);
		
		
		session.close();
		connection.close();

	}
}
