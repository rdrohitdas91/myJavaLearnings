package com.citibank.main;

import com.citibank.threads.ThreadOne;
import com.citibank.threads.ThreadTwo;

public class ThreadsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadOne threadOne = new ThreadOne();
		System.out.println("main start");
		threadOne.start();
		//threadOne.run();
		
		ThreadTwo threadTwo = new ThreadTwo();
		Thread t2 = new Thread(threadTwo);
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadMain " + i);
			
		}
		System.out.println("ThreadMain End");
		
		System.out.println("main end");

	}

}
