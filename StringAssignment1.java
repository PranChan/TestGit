
//1. Write a program to replace the spaces in the input string with %20

package com.assignments.java;

import java.util.Scanner;

public class StringAssignment1 {

	public static void main(String[] args) {
		System.out.println("Please enter any string");
		Scanner s= new Scanner(System.in);
		String s1= s.nextLine();   //to access string from user
		System.out.println("    :"+s1);
		String s2=s1.replaceAll(" ","%20");
		System.out.println("New String is:"+s2);

	}

}
