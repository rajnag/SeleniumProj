package com.srija.selenium.HRMS;

public class Swap {

	public static void main(String args[]) {
		
		// without  using temp variable
		
		/*
		 * int num1 = Integer.parseInt(args[0]); int num2 =
		 * Integer.parseInt(args[1]);
		 * System.out.println(" Before swaping numbers are ");
		 * System.out.println(" number1 : " + num1);
		 * System.out.println(" number2 : " + num2);
		 * 
		 * num1 = num1 + num2; num2 = num1 - num2; num1 = num1 - num2;
		 * 
		 * System.out.println(" After swaping numbers are ");
		 * System.out.println(" number1 : " + num1);
		 * System.out.println(" number2 : " + num2);
		 */

		
		// with using temp variable

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		System.out.println(" Before swaping numbers are ");
		System.out.println(x);
		System.out.println(y);
		
		int temp;
		temp = x;
		x = y;
		y = temp;

		System.out.println(" After swaping numbers are ");
		System.out.println(x);
		System.out.println(y);
	}
}
