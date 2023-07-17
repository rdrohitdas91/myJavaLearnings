package com.citibank.factory;
import com.citibank.domain.*;
import com.citibank.main.*;
import java.util.Scanner;

 

 

public class AccountFactory {
    public Account CreateAccount(int choice, int number, String name, double balance, boolean isSalary, double overdraftLim ) {
        switch (choice) {
        case 1:
            return new Savings(number, name, balance, isSalary);
        case 2:            
            return new Current(number, name, balance, overdraftLim);
        default :
            return null;
        }
       }
}