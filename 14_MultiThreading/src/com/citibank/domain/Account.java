package com.citibank.domain;

import com.citibank.threads.DepositThread;
import com.citibank.threads.WithdrawThread;

public class Account {
	private double balance = 10000;

	
	public synchronized void withdraw(double amount) {
		System.out.println("Before withdraw =  " + balance);
		if(amount > balance)
			try {
				System.out.println("Less balance, waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		balance = balance - amount;
		System.out.println("After withdraw =  " + balance);
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Before deposit =  " + balance);
		balance = balance + amount;
		System.out.println("After deposit =  " + balance);
		notify();
	}	
	
}
