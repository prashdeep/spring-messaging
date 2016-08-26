package com.intuit.jms.spring.appconfig;

import javax.jms.ConnectionFactory;

import org.apache.activemq.RedeliveryPolicy;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
//@PropertySource("classpath:jndi.properties")
public class AppConfig {
	
	@Value("${brokerurl}")
	private String brokerUrl;
	
	@Value("${brokerusername}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Value("${maximumRedeliveries}")
	private String maximumRedeliveries;
	
	 @Bean 
	   public ConnectionFactory connectionFactory(){
		 System.out.println("**************************");
		 System.out.println(userName.trim());
		 System.out.println("**************************");
		 ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		 
	      connectionFactory.setBrokerURL(brokerUrl);
	      connectionFactory.setUserName(userName);
	      connectionFactory.setPassword(password);
	      RedeliveryPolicy redeliveryPolicy = new RedeliveryPolicy();
	      redeliveryPolicy.setMaximumRedeliveries(Integer.parseInt(maximumRedeliveries));	  
	      connectionFactory.setRedeliveryPolicy(redeliveryPolicy);
	      return connectionFactory;
	   }
}
