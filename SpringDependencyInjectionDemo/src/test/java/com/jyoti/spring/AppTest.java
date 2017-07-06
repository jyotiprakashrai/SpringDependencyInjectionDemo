package com.jyoti.spring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jyoti.spring.consumer.MyApplication;
import com.jyoti.spring.services.MessageService;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

@Configuration
@ComponentScan(value="com.jyoti.spring.consumer")
public class AppTest 
    extends TestCase
{
	private AnnotationConfigApplicationContext context = null;

	@Bean
	public MessageService getMessageService() {
		return new MessageService(){

			public boolean sendMessage(String msg, String rec) {
				System.out.println("Mock Service");
				return true;
			}
			
		};
	}

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(AppTest.class);
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void test() {
		MyApplication app = context.getBean(MyApplication.class);
		Assert.assertTrue(app.processMessage("Hello Jyoti", "jyoti@com"));
	}
}
