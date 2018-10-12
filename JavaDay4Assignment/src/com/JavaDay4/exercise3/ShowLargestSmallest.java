package com.JavaDay4.exercise3;

import java.util.Scanner;

public class ShowLargestSmallest {
	public static void main(String[] args) {
		int numOfElement;

		System.out.println("Enter number of elements that you want :");
		Scanner scanIn = new Scanner(System.in);
		numOfElement = scanIn.nextInt();

		int[] inArray = new int[numOfElement];

		System.out.println("Enter each element:");
		for (int count = 0; count < numOfElement; count++) {
			inArray[count] = scanIn.nextInt();
		}

		for (int i = 0; i < numOfElement; i++) {
			for (int j = 1; j < (numOfElement - i); j++) {
				if (inArray[j - 1] > inArray[j]) {
					// swap elements
					int temp = inArray[j - 1];
					inArray[j - 1] = inArray[j];
					inArray[j] = temp;
				}

			}
		}

		System.out.println("Largest number in that array is: " + inArray[numOfElement -1] + "; and it's power 2 is :"
				+ Math.pow(inArray[numOfElement - 1], 2));
		System.out.println("Smallest number in that array is: " + inArray[0] + "; and it's power 2 is :"
				+ Math.pow(inArray[0], 2));

	}

}
