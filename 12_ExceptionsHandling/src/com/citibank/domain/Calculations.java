package com.citibank.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int num1;
	private int num2;
	private int result;

	
	Scanner scanner = new Scanner(System.in);
	
	public void accept() {
		try {
	System.out.println("accept() start");
	System.out.println("Enter num1");
	num1 = scanner.nextInt();
	System.out.println("Enter num2");
	num2 = scanner.nextInt();
	System.out.println("accept() end");
	}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input from user");
			System.out.println(e.getMessage());
	//		e.printStackTrace();
		
		}
		catch (Exception e) {
			System.out.println("Something is wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Accept() end");
			scanner.close();
		}
		}
	public int acceptAndcalculate() {
		try {
		System.out.println("accept() start");
		scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		System.out.println("accept() end");
		
		System.out.println("calculate() start");
		result = num1 + num2;
		System.out.println("calculate() end");
		
		return result;
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input from user");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("acceptAndCalculate() end");
			scanner.close();
			
		}
		return 0;
		
	}
	public void display () {
		System.out.println("display() start");
		System.out.println("Result is :: " + result);
		System.out.println("display() end");
	 
	}
}
