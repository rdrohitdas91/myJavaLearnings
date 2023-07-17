package com.citibank.main;

import com.citibank.domian.Calculation;
import com.citibank.domian.divideCal;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation divideCal = ( n1,  n2) -> n1/n2;
	
		double result = divideCal.docalculation(10,2);
		System.out.println("Result is = " +  result);
		
		Calculation addCal = (n1, n2) -> n1+n2;
		 result = addCal.docalculation(20,40);
		System.out.println("Result is = " +  result);

	}

}
