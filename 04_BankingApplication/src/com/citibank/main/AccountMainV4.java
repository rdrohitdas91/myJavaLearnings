package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("main start");
		
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		int accountNumber;
		String name;
		int choice;
		double amount;
		String ContinueChoice;
		
		  System.out.println("Enter accountNumber ");
		  accountNumber = scanner.nextInt();
		  name = scanner.nextLine();
		  System.out.println("Enter name");
		  name = scanner.nextLine();
		  
		  account = new Account(accountNumber, name);
	  
		  System.out.println("Account number = " + account.getAccountNumber());
		  System.out.println("Name = " + account.getName());
		  System.out.println("Balance = " + account.getBalance());
		  
		  
	
			do {
				System.out.println("Menu");
				  System.out.println("1. Withdraw");
				  System.out.println("2. Deposit");
				  System.out.println("3. Display balance");
				  System.out.println("Enter your choice");
				  choice=scanner.nextInt();
				    
				  switch (choice) {
				case 1:
					System.out.println("You have selected Withdraw");
					System.out.println("Enter Amount");
					amount=scanner.nextDouble();
					if(account.withdraw(amount))
						System.out.println("Withdraw Successful");
					else
						System.out.println("Withdraw failed");
					break;
					
				case 2:
					System.out.println("You have selected Deposit");
					System.out.println("Enter Amount");
					amount=scanner.nextDouble();
					if(account.deposit(amount))
						System.out.println("Deposit Successful");
					else
						System.out.println("Deposit failed");
					break;
					
				case 3:
					System.out.println("You have selected Display Balance");
					System.out.println("Balance = " + account.getBalance());;
					
					
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				  }
		  System.out.println("Do you Want to Continue");
		  ContinueChoice=scanner.next();
	} while (ContinueChoice.equalsIgnoreCase("Yes"));
		System.out.println("Thank You");
		  
	//	System.out.println("main end");
		   
	 }	  
	}	


