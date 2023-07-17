package com.citibank.main;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		int size = new Scanner(System.in).nextInt();
		int [] numbers = new int[size];
		numbers[0] = 10;
		numbers[1] = 10;
		numbers[2] = 10;
		numbers[3] = 10;
		numbers[4] = 10;
		
		for(int i : numbers) {
			System.out.println(i);
		}
	}

}
