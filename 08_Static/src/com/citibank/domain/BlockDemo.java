package com.citibank.domain;

public class BlockDemo {
	private int x = 10;
	{
		System.out.println("Non Static Block Called");
		
	}
	public BlockDemo() {
		System.out.println("Default constructor Called");
	}
	static {
		System.out.println("Static Block Called");
	//	System.out.println("x = " + x); only static variable will work
	}
	public static void show() {
		System.out.println("Static method Called");
	}
	public void display() {
		System.out.println("non static method called");
	}
}
