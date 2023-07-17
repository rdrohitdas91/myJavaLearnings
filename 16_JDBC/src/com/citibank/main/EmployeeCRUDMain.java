package com.citibank.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.citibank.domain.Employee;
import com.citibank.repository.EmployeeRepository;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		EmployeeRepository employeeRepository = new EmployeeRepository();
		List <Employee> employeeList = new ArrayList<>();
		Employee employee;
		
		int choice;
		String continueChoice;
		int employeeId;
		String firstName;
		String lastName;
		String email;
		double salary;
		boolean result;
		
		do {
		
		System.out.println("Menu");
		System.out.println("1. Add New Employee");
		System.out.println("2. Update Salary of Listing Employee");
		System.out.println("3. Display Single Employee  Details");
		System.out.println("4. Display All Employees");
		System.out.println("5. Delete Single Employee");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
	
	
		switch (choice) {
		case 1: System.out.println("Add details of new employee");
				System.out.println("Enter employee ID");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter First Name of employee");
				firstName = scanner.next();
				System.out.println("Enter last Name of employee");
				lastName = scanner.next();
				System.out.println("Enter email of employee");
				email = scanner.next();
				System.out.println("Enter Salary of employee");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, firstName, lastName, email, salary);
				result = employeeRepository.addNewEmployee(employee);
				if (result)
					System.out.println("Employee Added Success");
				else
					System.out.println("Employee Added Failed");
		
			break;
			
	case 2 : 	System.out.println("Enter employee ID");
					employeeId = scanner.nextInt();
					System.out.println("Enter New Salary");
					salary = scanner.nextDouble();
					result = employeeRepository.updateEmployeeSalary(employeeId, salary);
						if (result)
						System.out.println("Salary is updated Successfully");
						else
							System.out.println("No Employee Found");
					
					break;
		
		case 3:{
		System.out.println("Enter employee ID");
			employeeId = scanner.nextInt();
			scanner.nextLine();
			employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
			
		if (employee != null) {
				System.out.println("Employee Found");
			System.out.println(employee);
			}
				else {
					System.out.println("Employee not found");
			}
			
		break;
	}
		
		case 4:
			System.out.println(employeeRepository.getAllEmployees());
		for (Employee e : employeeRepository.getAllEmployees()) {
				System.out.println(e);							}
			break;
			
		case 5:
			
			System.out.println("Enter employee ID");
			employeeId = scanner.nextInt();
			result = employeeRepository.deleteEmployeeByEmployeeId(employeeId);
			if (result) {
				System.out.println("Employee Delete Success");
			}
				else {
					System.out.println("Employee Delete Failed");
			}
			break;
			
		default:
			break;
		}
		
		System.out.println("Do you want to continue");
		continueChoice = scanner.next();
	}while (continueChoice.equalsIgnoreCase("Yes"));
	}

}
