package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Circle;
import com.citibank.domain.Line;
import com.citibank.domain.Shapes;
import com.citibank.domain.Triangle;
import com.citibank.factory.ShapesFactory;

public class ShapesMain {
  public static void main(String args[]) {
	  Shapes shapes = null;
	  Scanner scanner = new Scanner(System.in);
	  int shapeChoice;
	  System.out.println("Menu");
	  System.out.println("1. Cicrle");
	  System.out.println("2. Triangle");
	  System.out.println("3. Line");
	  System.out.println(" Enter your choice");
	  shapeChoice = scanner.nextInt();
	  
	  ShapesFactory factory = new ShapesFactory();
	  shapes = factory.createShape(shapeChoice);
	  if(shapes != null) {
		  shapes.draw();
	  }else {
		  System.out.println("Invalid Choice of Shape");
	  }
	  
	  
//	  switch (shapeChoice) {
//	case 1: 
//		shapes = new Circle();
//		break;
//	case 2: 
//		shapes = new Triangle();
//		break;
//	case 3: 
//		shapes = new Line();
//		break;
//	default:
//		shapes = new Shapes();
//		break;
//	}
//	shapes.draw();
  }
}

