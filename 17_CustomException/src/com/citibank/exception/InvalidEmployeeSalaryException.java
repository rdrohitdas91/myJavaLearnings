package com.citibank.exception;

//public class InvalidEmployeeSalaryException extends Exception{
public class InvalidEmployeeSalaryException extends RuntimeException{	
public String getMessage() {
	return  ("Salary must be > 0");
}
}