package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.exception.InvalidEmployeeSalaryException;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Employee employee = new Employee(101, "Rohit", 5000);
//			System.out.println(employee);
//		} catch (InvalidEmployeeSalaryException e) {
//			// TODO Auto-generated catch block
//		//	e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//		}
//
//		System.out.println("----------------------");
//		Employee employee2 = new Employee();
//		try {
//			employee2.setSalary(1000);
//		} catch (InvalidEmployeeSalaryException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
		
		Employee employee = new Employee(101, "Rohit", -5000);
	}
}
