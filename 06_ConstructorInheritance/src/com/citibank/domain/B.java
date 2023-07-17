package com.citibank.domain;

public class B extends A{
  public B() {
	// TODO Auto-generated constructor stub
	//  super();
	  System.out.println("Default Constructor of B");
}
  
  public B(int x) {
	  super(x);
	  System.out.println("Paramterized Constructor of B");
	  System.out.println("x = " + x);
  }
}
