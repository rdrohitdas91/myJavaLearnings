package com.citibank.main;

import com.citibank.domain.Receiver;
import com.citibank.threads.Caller;

public class ThreadSynchronizationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		
//		receiver.getCall("hi");
//		receiver.getCall("hello");
//		receiver.getCall("how are you");
		Caller Rohit = new Caller(receiver, "Hi");
		Caller Rupesh = new Caller(receiver, "Hello");
		Caller Abhinav = new Caller(receiver, "How are you");
		
	}

}
