package com.srija.selenium.HRMS;

public class Prime {

	public static void main(String args[]) {
		/*
		 * int num = Integer.parseInt(args[0]);
		 * 
		 * int flag = 0; for (int i = 2; i < num; i++) { if (num % i == 0) {
		 * System.out.println(num + " Not a prime no "); flag = 1; break; } } if
		 * (flag == 0) { System.out.println(num + " Prime No "); }
		 */

		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
