//3. Write a function to find the revervse of a string without using StringBuffer/StringBuilder reverse method
package javaPractice;

import java.util.Scanner;

public class StringsAssignment3 {
	

	public static void main(String[] args) {
		
		System.out.println("Please enter any string");
		Scanner s= new Scanner(System.in);
		String s1= s.nextLine();   //to access string from user
		System.out.println("    :"+s1);
		//System.out.println(s1.substring(2, 6));     //using substring function
		for(int i=s1.length()-1;i>=0;i--)
				{
			char[] charArray =s1.toCharArray();
			      System.out.println(charArray[i]);
				}

	}

}
