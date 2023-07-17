package com.citibank.domain;

public class EmailMesage implements Message {

	@Override
	public void sendMessage(String To, String messageText)  {
		// TODO Auto-generated method stub
		System.out.println("Email Message is sent");
		System.out.println("To = " + To);
		System.out.println("Message = " + messageText);
		
	}

}
