package com.citibank.domain;

import java.util.Objects;

public class EmployeeClass {

	private int employeeId;
	private String name;
	private double salary;
	private static int employeeIdGenerator = 101;
	public EmployeeClass() {
			
	}
	public EmployeeClass(String name, double salary) {
		super();
		this.employeeId = employeeIdGenerator;
		this.name = name;
		this.salary = salary;
		employeeIdGenerator = employeeIdGenerator + 1;
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
	public int hashCode() {
		return Objects.hash(employeeId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return employeeId == other.employeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "EmployeeClass [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
