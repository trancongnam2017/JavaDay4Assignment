package com.JavaDay4.exercise1;

import java.util.Scanner;

public class SimpleCal {
	public static void main(String[] args)
	{
		float inputNum;
		double result;
		
		System.out.println("Enter your number:");
		
		Scanner scanIn = new Scanner(System.in);
		inputNum = scanIn.nextFloat();
		
		System.out.println(inputNum + " power 2 is equal to :" + Math.pow(inputNum, 2));
		System.out.println(inputNum + " power 3 is equal to :" + Math.pow(inputNum, 3));
	}
	
	
	

}
