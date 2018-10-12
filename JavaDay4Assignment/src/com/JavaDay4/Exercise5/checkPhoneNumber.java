package com.JavaDay4.Exercise5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class checkPhoneNumber {
	public static void main(String[] args)
	{
		String sampleString;		
		Scanner scanIn = new Scanner(System.in);		
		System.out.println("Enter the phone number");
		sampleString = scanIn.nextLine();
		
		StringTokenizer st = new StringTokenizer(sampleString, " -");		
		System.out.println("Country Code is " + st.nextElement());
		System.out.println("Zone Code is " +"("+ st.nextElement()+")");
		System.out.println("Phone number is " + st.nextElement());	
	
		
	}

}
