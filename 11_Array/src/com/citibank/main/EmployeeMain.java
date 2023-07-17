package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		
	//	int size = new Scanner(System.in).nextInt();
		Employee [] employees = new Employee[5];
		employees[0] = new Employee(101, "Rohit", 5000);
		employees[1] = new Employee(102, "PD", 5000);
		employees[2] = new Employee(103, "RA", 5000);
		employees[3] = new Employee(104, "AA", 5000);
		employees[4] = new Employee(105, "SG", 5000);
		
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
