package com.pluralsight.com;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;


public class Application {
	public ConnectionFactory getConnectionFactory() {
		return new ActiveMQConnectionFactory("tcp:test:8161");
	}
	
	public Connection getConnection() throws JMSException {
		return getConnectionFactory().createConnection();
	}
	
	public Session getSession() throws JMSException{
		return getConnection().createSession(false, Session.SESSION_TRANSACTED);
	}
}
