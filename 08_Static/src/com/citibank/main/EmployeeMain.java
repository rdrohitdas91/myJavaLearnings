package com.citibank.main;
import com.citibank.domain.EmployeeClass;
import com.citibank.domain.MyClass;
	
public class EmployeeMain {
	
	static int x = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
        EmployeeClass e1 = new EmployeeClass("Rohit", 1000);
	    EmployeeClass e2 = new EmployeeClass("Rupesh", 5000);
	    EmployeeClass e3 = new EmployeeClass("Payal", 5000);
	    EmployeeClass e4 = new EmployeeClass( "Abhinav", 5000);
	    EmployeeClass e5 = new EmployeeClass( "Varsha", 5000);
	    
	    System.out.println(e1);
	    System.out.println(e2);
	    System.out.println(e3);
	    System.out.println(e4);
	    System.out.println(e5);
	    
	    MyClass.display();
	}
	}
	
	  
	    
	    
	    
	    
	    
	    
