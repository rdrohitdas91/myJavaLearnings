package com.citibank.threads;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadTwo Start");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ThreadTwo " + i);
			
		}
		System.out.println("ThreadTwo End");
	}	
}
