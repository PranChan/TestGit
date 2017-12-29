//2.Write a program to find the first repeated character in the input string e.g: input string: apple answer: p


package com.assignments.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringsAssignment2 {
	 
	
	public static void main(String[] args) {
		
		System.out.println("Please enter any string");
		Scanner s= new Scanner(System.in);
		String s1= s.nextLine();   //to access string from user
		System.out.println("    :"+s1);
		int l=s1.length();
		Set <Character> hs=new HashSet();
		char[] array = s1.toCharArray();
	/*	for(int i=0;i<l;i++)
		{
			char s2=s1.charAt(i);
			//System.out.println(s2);
			String str=String.valueOf(s2);
			char ch=s1.charAt(i+1);
			String str2=String.valueOf(ch);
				if(str.equals(str2))
						{
					System.out.println("Character has been repeated is:"+str);
						}
		}*/
		
		for(int i=0;i<l;i++)
		{
			if(hs.contains(array[i]))
			{
				System.out.println("Repeated character in the array is:"+array[i]);
				
			}
			else
			hs.add(array[i]);
			}

	}

}
