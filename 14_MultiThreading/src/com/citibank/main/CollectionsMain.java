package com.citibank.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. ArrayList");
		List<Integer> numberList = new ArrayList<>();
		numberList.add(23);
		numberList.add(43);
		numberList.add(13);
		numberList.add(43);
		numberList.add(23);
		System.out.println(numberList);
		System.out.println(numberList.size());
		System.out.println(numberList.indexOf(43));
		
		for (Integer integer : numberList) {
			System.out.println(integer);
	//		if(integer == 43) {
	//			numberList.remove(integer);
			
	//		}
			
		}
		numberList.remove(Integer.valueOf(43));
		System.out.println(numberList);
		System.out.println(numberList.size());
		
		System.out.println("2. Hashset");
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("Rohit");
		nameSet.add("Patra Bhaina");
		nameSet.add("Abhinav");
		nameSet.add("Patra Bhaina");
		nameSet.add("Patra");
		
		System.out.println(nameSet);
		
		System.out.println("3. TreeSet");
		TreeSet<String> sortedNameSet = new TreeSet<>();
//		Set<String> nameSet = new HashSet<String>();
		sortedNameSet.add("Rohit");
		sortedNameSet.add("Patra Bhaina");
		sortedNameSet.add("Abhinav");
		sortedNameSet.add("Patra Bhaina");
		sortedNameSet.add("Patra");
		
		System.out.println(sortedNameSet);
		
		System.out.println("4. HashMap");
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "Rohit");
		hashMap.put(102, "Rupesh");
		hashMap.put(103, "Patra Bhaina");
		hashMap.put(104, "Rohit");
		
		System.out.println(hashMap.get(104));
		
		

	}
}
