package com.citibank.domain;

public class Current extends Account{

//	private double currentBalance = 10000;
	private double overdraftBalance;
	private double initialoverdraftBalance;

	
	public Current() {
		System.out.println("Current Class Constructor Called");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		this.initialoverdraftBalance = initialoverdraftBalance;
	}

	public double getoverdraftBalance() {
	//	super();
		return overdraftBalance;
	}

	public void  setoverdraftBalance(double overdraftBalance) {
		 this.overdraftBalance = overdraftBalance;
	}
	
    @Override
    public boolean withdraw(double amount) {
    	        if(amount > 0) {
    	        	if (amount <= getBalance()) {
    	        	setBalance(getBalance() - amount);
    	        	return true;
    			}
    			if (amount > getBalance() && amount <= getBalance() + overdraftBalance) {
    			   amount = amount - getBalance();
    			   setBalance(0);
    			   overdraftBalance = overdraftBalance - amount;
    			   return true;
    }
    			}
 			return false;
    }
    @Override
    public boolean deposit(double amount) {
    	if (amount > 0) {
    if(initialoverdraftBalance > overdraftBalance) {
    	if (amount < (initialoverdraftBalance - overdraftBalance)) {
    		overdraftBalance = overdraftBalance + amount;
    		return true;
    	}
    	else {
    		amount = amount - (initialoverdraftBalance - overdraftBalance);
    		overdraftBalance = initialoverdraftBalance;
    		setBalance(getBalance() + amount);
    		return true;
    	}
    }else {
    	setBalance(getBalance() + amount);
    	return true;
	}
} else
    return false;
    }
}


