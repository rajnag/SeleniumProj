package com.srija.selenium.HRMS;

public class Fibonacci {

	public static void main(String args[]) {

		int n = Integer.parseInt(args[0]);
		System.out.println("The fibonacci series are     ");
		int f1, f2 = 0, f3 = 1;
		for (int i = 0; i <= n; i++) {
			System.out.println(" " + f2 + " ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}

	}
}
