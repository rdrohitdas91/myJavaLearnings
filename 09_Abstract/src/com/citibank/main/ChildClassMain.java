package com.citibank.main;

import com.citibank.domain.ChildClass;
import com.citibank.domain.MyClass;

public class ChildClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	MyClass myClass = new MyClass();
		// Error - Cannot create object of abstract class
		
		ChildClass childClass = new ChildClass();
		childClass.show();

	}

}
