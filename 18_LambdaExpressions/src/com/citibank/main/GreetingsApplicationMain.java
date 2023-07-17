package com.citibank.main;

import com.citibank.domian.GoodAfternoonGreetings;
import com.citibank.domian.GoodEveningGreetings;
import com.citibank.domian.GoodMorningGreetings;
import com.citibank.domian.GreeetingsApplication;
import com.citibank.domian.Greetings;

public class GreetingsApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodMorningGreetings goodMorningGreetings = new GoodMorningGreetings();
		
		GreeetingsApplication application = new GreeetingsApplication(goodMorningGreetings);
		application.doGreet();
		
		GoodAfternoonGreetings goodAfternoonGreetings = new GoodAfternoonGreetings();
		GreeetingsApplication application2 = new GreeetingsApplication(goodAfternoonGreetings);
		
		application2.doGreet();
		
		Greetings goodEveningGreetings = () -> System.out.println("Good Evening");
		
		GreeetingsApplication application3 = new GreeetingsApplication(goodEveningGreetings);
		application3.doGreet();
		
		
	//	GreeetingsApplication application1 = new GreeetingsApplication(goodAfternoonGreetings);
		
	//	application1.doGreet();
		
		

	}

}
