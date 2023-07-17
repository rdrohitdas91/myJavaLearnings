package com.citibank.domain;

public class WhatsappMessage implements Message{


	@Override
	public void sendMessage(String To,String messageText) {
		// TODO Auto-generated method stub
		System.out.println("Whatsapp Message is Sent");
		System.out.println("To = " + To);
		System.out.println("Message = " + messageText);
		
	}

}
