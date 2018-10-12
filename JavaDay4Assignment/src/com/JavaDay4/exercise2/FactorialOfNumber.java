package com.JavaDay4.exercise2;

import java.util.Scanner;

public class FactorialOfNumber {
	
	static long Fact(int num)
	{
		if(num == 0)
			return 1;
		else
		return (num * Fact(num-1));
	}
	
	public static void main(String[] args)
	{
		int inNum;
		long fact;
		
		Scanner scanIn= new Scanner(System.in);
		System.out.println("Enter your number");
		inNum = scanIn.nextInt();
		
		fact = Fact(inNum);
		
		System.out.println("Factorial of "+inNum+" = "+ fact);
		
		
		
		
	}
}
