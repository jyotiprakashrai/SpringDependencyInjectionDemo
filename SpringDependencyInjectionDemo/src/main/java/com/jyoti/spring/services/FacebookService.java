package com.jyoti.spring.services;

public class FacebookService implements MessageService {

	public boolean sendMessage(String message, String to) {

		System.out.println("Facebook message Sent to " + to + " with Message=" + message);
		return true;

	}

}
