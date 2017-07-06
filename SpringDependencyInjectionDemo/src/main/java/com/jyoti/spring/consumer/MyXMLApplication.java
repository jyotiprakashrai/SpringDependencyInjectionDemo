package com.jyoti.spring.consumer;

import com.jyoti.spring.services.MessageService;

public class MyXMLApplication {

	private MessageService service;

	// constructor-based dependency injection
	 /* public MyXMLApplication(MessageService srvc) {
	  this.service = srvc;
	   }*/

	// setter-based dependency injection
	public void setService(MessageService srvc) {
		this.service = srvc;
	}

	public boolean processMessage(String message, String to) {
		// some magic like validation, logging etc
		return this.service.sendMessage(message, to);
	}

}
