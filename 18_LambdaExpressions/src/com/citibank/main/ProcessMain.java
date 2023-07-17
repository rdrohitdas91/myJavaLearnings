package com.citibank.main;

import com.citibank.domian.ProcessString;

public class ProcessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
		ProcessString processString =  (x) -> x.toUpperCase();
		String stringText = processString.doProcess("hi");
		System.out.println("StringText is = " +  stringText);
		
		processString = (x) -> {
			return x;
			
		};
		
	 String A = processString.doProcess("LambdaExpression");
	 int B = A.length();
	 System.out.println("length is " + B);
	


	
	processString = (x) -> x.repeat(4);
	stringText = processString.doProcess("hi");
	System.out.println("StringText is = " +  stringText);
	}
	}


