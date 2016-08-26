package com.intuit.pi.automation;

import org.hibernate.Session;


public class TestHibernate {
	public static void main(String[] args) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
    	  //Add new Employee object
		 PersistDLQMessage message = new PersistDLQMessage();
		 message.setMessageId(1234);
		 message.setMessage("test message ....");
		 session.save(message);
		 session.getTransaction().commit();

		 session.beginTransaction();
		 System.out.println(session.get(PersistDLQMessage.class, 1234));;
		 
		 HibernateUtil.shutdown();
	}
}