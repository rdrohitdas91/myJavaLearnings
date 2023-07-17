package com.citibank.main;

import java.util.Arrays;

import com.citibank.domain.Person;

interface Condition{
	boolean test(Person person);
}


public class PersonMain {
	public static void printAll(Person [] people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person))
			System.out.println(person);
			
		}
	}
	
//	public static void printAllBeginWithG(Person [] people) {
//		for (Person person : people) {
//			if(person.getLastname().startsWith("G"))
//			System.out.println(person);
//			
//		}
//	}
//
//	public static void printAllEndWithL(Person [] people) {
//		for (Person person : people) {
//			if(person.getLastname().endsWith("l"))
//			System.out.println(person);
//			
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person person1 = new Person("Vivek", "Gohil", 33);
//		Person person2 = new Person("Gurubux", "Gill", 26);
//		Person person3 = new Person("Samarth", "patil", 12);
//		Person person4 = new Person("Trupti", "Acharekar", 38);	
//		
//		Person [] persons = {person1 , person2, person3, person4};
		
//		//1. sort the array by last name
//		Person person = new Person();
//		Arrays.sort(persons, person);
//		//2. Create a  method that prints all the person of array
//		printAll(persons);
//		//3. Create a method that prints all people that have last name begining with G
//		System.out.println("person with last name starting with G");
//		printAllBeginWithG(persons);
//		//4. Create a method that prints all people that have last name ending with l.
//		System.out.println("person with last name ending with l");
//		printAllEndWithL(persons);
		
	public static void main(String[] args) {
//	// TODO Auto-generated method stub
	Person person1 = new Person("Vivek", "Gohil", 33);
	Person person2 = new Person("Gurubux", "Gill", 26);
	Person person3 = new Person("Samarth", "patil", 12);
	Person person4 = new Person("Trupti", "Acharekar", 38);	
	
	Person [] persons = {person1 , person2, person3, person4};
		
		//1. sort the array by last name
	Arrays.sort(persons);
		
		//2. Create a  method that prints all the person of array
	Condition noCondition = (p) -> true;
	printAll(persons , noCondition);
		
		//3. Create a method that prints all people that have last name begining with G
	System.out.println("begin With G");
	Condition startWithG = (p) -> {
		if (p.getLastname().startsWith("G")){
			return true;
		}
			return false;
	};
	printAll(persons, startWithG);
		
		//4. Create a method that prints all people that have last name ending with l.
	System.out.println("ends With l");
	Condition endWithG = (p) -> {
		if (p.getLastname().endsWith("l")){
			return true;
		}
			return false;
	};
	printAll(persons, endWithG);
		
	}		

	}

