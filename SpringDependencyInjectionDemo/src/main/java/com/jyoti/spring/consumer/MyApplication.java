package com.jyoti.spring.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jyoti.spring.services.MessageService;
/*@Autowired(can be applied to field, constructor and methods)*/

@Component
public class MyApplication {

	//field-based dependency injection
	//@Autowired
	private MessageService service;

	// constructor-based dependency injection
	/*@Autowired
	public MyApplication(MessageService srvc) {
		this.service = srvc;
	}*/

	@Autowired
	public void setService(MessageService service) {
		this.service = service;
	}

	public boolean processMessage(String message, String to) {
		// some logic e.g. validation, logging etc
		return this.service.sendMessage(message, to);
	}

}
