package com.citibank.domain;

//public class Application {
//String To;
//String MessageText;
//int mobileNumber;
//public static String getTo() {
//	// TODO Auto-generated method stub
//	return null;
//}
//public static String MessageText() {
//	// TODO Auto-generated method stub
//	return null;
//}
//public Application(String to, String messageText, int mobileNumber) {
//	super();
//	To = to;
//	MessageText = messageText;
//	this.mobileNumber = mobileNumber;
//}
//public Application(String to2, String messageText2) {
//	// TODO Auto-generated constructor stub
//}
//public String getMessageText() {
//	return MessageText;
//}
//public void setMessageText(String messageText) {
//	MessageText = messageText;
//}
//public int getMobileNumber() {
//	return mobileNumber;
//}
//public void setMobileNumber(int mobileNumber) {
//	this.mobileNumber = mobileNumber;
//}
//public void setTo(String to) {
//	To = to;
//}
//
//}

public class Application {
	
	private Message message;
	
	public Application(Message message) {
		this.message = message;
		
	}
	public void processMessage(String To, String messageText) {
		message.sendMessage(To, messageText);
}
}
