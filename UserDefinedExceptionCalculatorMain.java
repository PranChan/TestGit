package com.assignments.java;

import java.util.Scanner;

public class UserDefinedExceptionCalculatorMain {

	public static void main(String[] args) {

		try {
			System.out.println("Please enter the values of a,b");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			CalculatorClass calClass = new CalculatorClass(a, b);
			calClass.sum();
			calClass.sub();
			calClass.mul();
			calClass.div();
			calClass.mod();
			s.close();
		} catch (PositiveValuesException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Userdefined exception handled");
		}
		

	}

}
