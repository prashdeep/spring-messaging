package com.jms.spring.integration;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intuit.pi.automation.HibernateUtil;
import com.intuit.pi.automation.PersistDLQMessage;
import com.intuit.pi.automation.compute.returns.message.queue.parser.DecomIP;
import com.intuit.pi.automation.compute.returns.message.queue.parser.IPParkDetail;
import com.intuit.pi.automation.compute.returns.message.queue.parser.PayloadHeader;
import com.intuit.pi.automation.compute.returns.message.queue.parser.RealDeletionFromF5Response;
import com.test.producer.MessageProducer;

public class SpringIntegrationJmsExample {

	private static Logger logger = Logger.getLogger(SpringIntegrationJmsExample.class);

	//@Autowired
	//private JmsTemplate jmsTemplate;

	private static int counter = 0;

//	public void setJmsTemplate(JmsTemplate jmsTempate) {
//		this.jmsTemplate = jmsTempate;
//	}
//
//	public JmsTemplate getJmsTemplate() {
//		return jmsTemplate;
//	}

	public void handleIPPark(PayloadHeader<IPParkDetail> obj) {

		System.out.println(obj instanceof PayloadHeader<?>);

		//System.out.println(obj);
		System.out.println("Handle Ip Park");
	}

	public void handleDeleteF5FromDevice(PayloadHeader<RealDeletionFromF5Response> obj) throws InterruptedException {
		System.out.println(obj instanceof PayloadHeader<?>);

		System.out.println(obj);
	}

	public void deleteACLMessageChannel(PayloadHeader<DecomIP> obj) {
		System.out.println(obj instanceof PayloadHeader<?>);

		System.out.println(obj);
		System.out.println("DecomIP");
	}
	
	public void persistDLQMessage(String message){
		System.out.println("came inside this method.... "+ message);
		Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 PersistDLQMessage persistMessage = new PersistDLQMessage();
		 persistMessage.setMessageId(1234);
		 persistMessage.setMessage(message);
		 session.save(persistMessage);
		 session.getTransaction().commit();

		 session.beginTransaction();
		 System.out.println("*****************************************");
		 System.out.println(session.get(PersistDLQMessage.class, 1234));
		 System.out.println("*****************************************");
		 
		 HibernateUtil.shutdown();

	}

	public int generateRandomNumber() {
		logger.log(Priority.INFO, "Generating the random number");
		return (int) Math.random();
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		MessageProducer messageProducer = (MessageProducer) context.getBean("messageProducer");
		messageProducer
        .sendMessageToDefaultDestination("Send this message to default destination.");
		
	}
}
