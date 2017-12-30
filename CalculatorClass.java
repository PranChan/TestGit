package com.assignments.java;

public class CalculatorClass implements Calculator {

	public double c;
	public int a, b;

	CalculatorClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void sum() throws PositiveValuesException {
		try {
		if (a < 0 || b < 0) {
			c = a + b;
			System.out.println("sum is:" + c);
		}
		}catch(Exception ex)
		{
		System.out.println(ex.getMessage());
		}
			throw new PositiveValuesException("Values of variables a and b Must be +ve ");
		
	}

	public void sub() throws PositiveValuesException {
		try {
		if (a < 0 || b < 0) {
			c = a - b;
			System.out.println("subtraction is:" + c);
		}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
			throw new PositiveValuesException("Values of variables a and b Must be +ve ");	
	}

	public void mul() throws PositiveValuesException {
		try {
		if (a < 0 || b < 0) {
			c = a * b;
			System.out.println("Multiplication is:" + c);
		}
		}catch(Exception ex)
		{
		System.out.println(ex.getMessage());
		}
			throw new PositiveValuesException("Values of variables a and b Must be +ve ");
	}

	public void div() throws PositiveValuesException {
		try {
		if (a < 0 || b < 0) {
			c = a / b;
			System.out.println("Division is:" + c);
		}}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
			throw new PositiveValuesException("Values of variables a and b Must be +ve ");
		
	}

	public void mod() throws PositiveValuesException {
		try {
		if (a < 0 || b < 0) {
			c = a / b;
			System.out.println("Mod is:" + c);
		}}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
			throw new PositiveValuesException("Values of variables a and b Must be +ve ");


	}
}
