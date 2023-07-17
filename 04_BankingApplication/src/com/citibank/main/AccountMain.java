package com.citibank.main;

import java.util.jar.Attributes.Name;

import javax.swing.ActionMap;

import com.citibank.domain.Account;

public class AccountMain {
  public static void main(String[] args) {
	  System.out.println("main start");
	  
	  Account account = new Account();
	  account.setAccountNumber(101);
	  account.setName("Rohit Das");
	  account.setBalance(1000);
	  
	  System.out.println("Account Number = " + account.getAccountNumber());
	  System.out.println("Name = " + account.getName());
	  System.out.println("Balance = " + account.getBalance());
	  //account.accountNumber = 101;
	  
	  Account account2 = new Account();
	  account2.setAccountNumber(102);
	  account2.setName("Rupesh Patra");
	  account2.setBalance(2000);
	  
	  System.out.println("Account Number = " + account2.getAccountNumber());
	  System.out.println("Name = " + account2.getName());
	  System.out.println("Balance = " + account2.getBalance());
	  //account.accountNumber = 102;
	  
	  
	  System.out.println("main end");
  }
}
