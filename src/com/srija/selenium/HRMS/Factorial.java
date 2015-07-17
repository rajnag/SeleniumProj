package com.srija.selenium.HRMS;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class Factorial {

	/*
	 * public static void main(String args[]) { // converting string in to
	 * integer int num = Integer.parseInt(args[0]);
	 * System.out.println("Entered no is  " + num); int fact = 1; while (num >
	 * 0) { fact = fact * num; num--; }
	 * System.out.println("  The factorial value is   " + fact); }
	 */

	// This Java Factorial Example shows how to calculate factorial of a given
	// number using Java.
	public static void main(String[] args) {

		int number = 5;
		int factorial = number;

		for (int i = (number - 1); i > 1; i--) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of a number is " + factorial);
	}
	
	//Java Factorial using predefined function
	
}
