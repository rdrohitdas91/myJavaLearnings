package com.citibank.main;

import com.citibank.domain.Calculations;

public class CalculationsMain {

	public static void main(String[] args) {
	Calculations calculation  = new Calculations();
	//calculation.accept();
	int result = calculation.acceptAndcalculate();
	System.out.println("Result is = " + result);
//	calculation.display();
}
}
