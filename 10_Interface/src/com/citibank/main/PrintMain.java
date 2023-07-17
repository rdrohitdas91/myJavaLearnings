package com.citibank.main;

import com.citibank.domain.Cannon350X;
import com.citibank.domain.HP3432;

public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HP3432 HP3432 = new HP3432();
		HP3432.print();
		HP3432.wirelessPrinting();
		Cannon350X Cannon350X = new Cannon350X();
		Cannon350X.print();
		Cannon350X.borderlessPrinting();

	}

}
