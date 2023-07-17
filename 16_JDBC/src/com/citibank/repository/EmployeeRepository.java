package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	private String userName = "root";
	private String passsword = "Root123$";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String query;
	private int resultCount;
	private boolean result;
	
	//connect database
	private Connection connection;
	//write-store and execute query
	private PreparedStatement preparedStatement;
	// store data from table
	private ResultSet resultSet;
	
	public List<Employee>  getAllEmployees(){
		List<Employee> employeeList = new ArrayList<>();
		query = "select * from employee_details";
		try {
			connection = DriverManager.getConnection(url, userName, passsword);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int employeeId = resultSet.getInt("employee_id");
					String firstName = resultSet.getString("first_name");
					String lastName = resultSet.getString("last_name");
					String email = resultSet.getString("email");
					double salary = resultSet.getDouble("salary");
					
					Employee employee = new Employee(employeeId, firstName, lastName, email, salary);
					
					employeeList.add(employee);
				}
				return employeeList;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return null;
	}
	
	public Employee getEmployeeByEmployeeId(int employeeId) {
		query = "select * from employee_details  where employee_id = ?";
		
		try {
			connection = DriverManager.getConnection(url, userName, passsword);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, employeeId);
				resultSet = preparedStatement.executeQuery();
					
				if(resultSet.next()) {
					int empId = resultSet.getInt("employee_id");
					String firstName = resultSet.getString("first_name");
					String lastName = resultSet.getString("last_name");
					String email = resultSet.getString("email");
					double salary = resultSet.getDouble("salary");
					Employee employee = new Employee(employeeId, firstName, lastName, email, salary);
					return employee;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return null;
	}


	public boolean addNewEmployee(Employee employee) {
		query= "Insert into employee_details values(?, ?, ? ,? ,? ) ";
		try {
			connection = DriverManager.getConnection(url, userName, passsword);
			if(connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, employee.getEmployeeId());
				preparedStatement.setString(2, employee.getFirstName());
				preparedStatement.setString(3, employee.getLastName());
				preparedStatement.setString(4, employee.getEmail());
				preparedStatement.setDouble(5, employee.getSalary());
				
				resultCount = preparedStatement.executeUpdate();
				if(resultCount > 0)
					return true;
				else
				return false;		
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;
	}
	
		
		public boolean updateEmployeeSalary(int employeeId, double salary) {
			query= "Update employee_details set salary = ? where employee_Id = ? ";
			try {
				connection = DriverManager.getConnection(url, userName, passsword);
				if(connection != null) {
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setInt(2, employeeId);
					preparedStatement.setDouble(1, salary);
					
					resultCount = preparedStatement.executeUpdate();
					if(resultCount > 0)
						return true;
					else
					return false;		
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					preparedStatement.close();
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			return false;
		}
		
		public boolean deleteEmployeeByEmployeeId(int employeeId) {
			query= "Delete from employee_details where employee_Id = ? ";
			try {
				connection = DriverManager.getConnection(url, userName, passsword);
				if(connection != null) {
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setInt(1, employeeId);
					
					resultCount = preparedStatement.executeUpdate();
					if(resultCount > 0)
						return true;
					else
					return false;		
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					preparedStatement.close();
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			return false;
		}
	
}

