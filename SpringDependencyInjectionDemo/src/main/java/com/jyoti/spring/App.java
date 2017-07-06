package com.jyoti.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jyoti.spring.configuration.DIConfiguration;
import com.jyoti.spring.consumer.MyApplication;

/**
 * Program to test annotation based Spring Dependency Injection
 *
 */
public class App 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		/*getBean(Class) method returns the Component object and 
		 *uses the configuration for autowiring the objects
		 */
		app.processMessage("Hello Jyoti", "jyoti@com");
	
		context.close();
	}
}
