package com.citibank.domian;

public class GreeetingsApplication {
	private Greetings greetings;

	public GreeetingsApplication(Greetings greetings) {
		super();
		this.greetings = greetings;
	}

	public void doGreet() {
		greetings.greet();
	}

}
