package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;


public class AccountMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("main started");
		  Scanner scanner = new Scanner(System.in);
		  Account account = new Account();
		  
		  System.out.println("Enter accountNumber ");
		  int accountNumber = scanner.nextInt();
		  //System.out.println("account number entered :" + accNumber);
		  
		  System.out.println("Enter balance");
		  Double balance = scanner.nextDouble();
		  //System.out.println("balance entered :" + balc);
		  
		  System.out.println("Enter name");
		  String name = scanner.next();
		  //System.out.println("name entered :" + nm);
		  
		  account.setAccountNumber(accountNumber);
		  account.setName(name);
		  account.setBalance(balance);
		  
		  System.out.println("Account number = " + account.getAccountNumber());
		  System.out.println("Name = " + account.getName());
		  System.out.println("Balance = " + account.getBalance());
		  
		  
		  
		  System.out.println("main end");

	}

}
