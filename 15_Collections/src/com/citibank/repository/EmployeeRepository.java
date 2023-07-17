package com.citibank.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	private Set<Employee> employeeSet = new HashSet<>();
	 
	
	public Employee getEmployeeByemployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}
	
	public boolean updateEmployeeSalary(int employeeid, double newSalary) {
		Employee employee = getEmployeeByemployeeId(employeeid);
		if (employee != null) {
			employee.setSalary(newSalary);
			return true;
		}
		
		return false;
	}
	
	public boolean addNewEmployee(Employee employee) {
		return employeeSet.add(employee);
		
	}
	
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Employee employee = getEmployeeByemployeeId(employeeId) ;
		if (employee != null) {
			employeeSet.remove(employee);
			return true;
		}
		return false;
	}
	
	public Set<Employee> getAllEmployees(){
		return employeeSet;
	}

}
