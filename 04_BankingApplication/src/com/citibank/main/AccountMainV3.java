package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
//		Account account = new Account();
//		Account account2 = new Account();
//		Account account3 = new Account();
		
//		Account account;
		
	//	new Account().setAccountNumber(101);
	//	new Account()
		Account account = new Account(101, "Rohit", 500);
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		System.out.println(account.getAccountNumber());
	
		Account account2 = new Account(202, "RD");
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
	
		System.out.println("Deposit = 2000");
		boolean result = account2.deposit(2000);
		if(result)
			System.out.println("Transaction Success");
		else
			System.out.println("Transaction Failed");
		
		System.out.println("balance = " + account2.getBalance());
		
		System.out.println("Withdraw = 1000");
		result = account2.withdraw(1000);
		if(result)
			System.out.println("Transaction Success");
		else
			System.out.println("Transaction Failed");
		System.out.println("balance = " + account2.getBalance());
		
		System.out.println("main end");
}
}
