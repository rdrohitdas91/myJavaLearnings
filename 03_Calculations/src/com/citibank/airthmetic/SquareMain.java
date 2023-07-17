package com.citibank.airthmetic;
import java.util.Scanner;

public class SquareMain {
  public static void main(String[] args) {
	  System.out.println("main start"); 
	  //User Input
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter Number");
	  int number = scanner.nextInt();
	  System.out.println("Number entered :" + number);
	  Square square = new Square();
	  int result = square.calculateSquare(number);
	  System.out.println("Square of " + number + " is : " + result);
  }
}

