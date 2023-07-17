package com.citibank.main;

 

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Current;
import com.citibank.factory.AccountFactory;

 

public class AccountMainV7 {

 

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        AccountFactory factory = null;

        Account account = null;

        int accountchoice, choice, number;

        String name, salAccChoice, proceed;

        double balance, amount, overdraftLim;

        boolean isSalary = false;        

        System.out.println("Menu");

        System.out.println("1. Savings");

        System.out.println("2. Current");

        System.out.println(" Enter your choice");

        accountchoice = scanner.nextInt();

        System.out.println(" Enter Account Number");

        number = scanner.nextInt();

        System.out.println(" Enter Account Name");

        name = scanner.next();

        System.out.println(" Enter Account balance");

        balance = scanner.nextDouble();

        factory = new AccountFactory();    

        switch (accountchoice) {

        case 1:

            System.out.println("Do you want to open Salary Account");

            salAccChoice = scanner.next();

            if(salAccChoice.equalsIgnoreCase("yes"))

                isSalary = true;

            account = factory.CreateAccount(accountchoice,number,name,balance,isSalary,0);

            break;

        case 2:

            System.out.println("Enter overdraft limit");

            overdraftLim = scanner.nextDouble();

            account = factory.CreateAccount(accountchoice,number,name,balance,false,overdraftLim);

            break;

        default:

            System.out.println("Invalid Choice");

            break;

        }

        System.out.println("Account Opened Succeffully !!");

        // Give Menu

        do {

            System.out.println("Menu");

            System.out.println("1. Withdraw");

            System.out.println("2. Deposit");

            System.out.println("3. Display Balance");

        System.out.println("Enter your choice");

        choice = scanner.nextInt();

        switch(choice){

        case 1:

            System.out.println("You have selected withdraw");

            System.out.println("Enter amount");

            amount = scanner.nextDouble();

            if(account.withdraw(amount)) 

                System.out.println("Succ tran");

            else

                System.out.println("Fail tran");

            break;

        case 2:

            System.out.println("You have selected deposit");

            System.out.println("Enter amount");

            amount = scanner.nextDouble();

            if(account.deposit(amount)) 

                System.out.println("Succ tran");

            else

                System.out.println("Fail tran");

            break;

        case 3:

            System.out.println("balance - " + account.getBalance());

            if (account instanceof Current) {

                System.out.println("Overdraft - " + ((Current) account).getoverdraftBalance() );

            }

            break;

        default:

            System.out.println("Select correct choice");

        }

        System.out.println("Do you want continue : Select Yes or No");

        proceed = scanner.next();

        }while(proceed.equalsIgnoreCase("yes"));

        if (proceed.equalsIgnoreCase("no"))

            System.out.println("You have selected " + proceed);

        System.out.println("Thanks for visiting");

    }

 

}
