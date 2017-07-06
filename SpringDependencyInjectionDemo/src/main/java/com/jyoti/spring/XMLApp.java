package com.jyoti.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jyoti.spring.consumer.MyXMLApplication;

public class XMLApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hello Jyoti", "jyoti@com");

		context.close();
	}

}
