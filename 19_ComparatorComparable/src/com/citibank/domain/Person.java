package com.citibank.domain;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastname, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastname;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastname=" + lastName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p1) {
		// TODO Auto-generated method stub
		int diff = p1.getLastname().compareTo(lastName);
		return diff;
	}
}





