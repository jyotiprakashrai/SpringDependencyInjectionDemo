package com.jyoti.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jyoti.spring.services.EmailService;
import com.jyoti.spring.services.MessageService;

@Configuration
@ComponentScan(value={"com.jyoti.spring.consumer"})
public class DIConfiguration {
	
	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}

}
