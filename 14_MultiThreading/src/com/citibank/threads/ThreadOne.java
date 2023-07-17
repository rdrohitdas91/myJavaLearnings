package com.citibank.threads;

import java.util.Iterator;

public class ThreadOne extends Thread{
	@Override
	public void run() {
		System.out.println("ThreadOne Start");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ThreadOne " + i);
			
		}
		System.out.println("ThreadOne End");
	}
}

