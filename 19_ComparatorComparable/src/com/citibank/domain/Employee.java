package com.citibank.domain;

import java.util.Comparator;

//public class Employee implements Comparable<Employee>{
	public class Employee{
	private int employeeId;
	private  String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//public Employee(int employeeId, String name, double salary) throws InvalidEmployeeSalaryException {
		public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
			this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee e) {
//	//	int diff = employeeId - e.getEmployeeId();
//	//	int diff = name.compareTo(e.getName());
//		int diff = e.getName().compareTo(name);
//		return diff;
//
//	}

}
