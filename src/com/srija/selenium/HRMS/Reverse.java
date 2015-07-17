package com.srija.selenium.HRMS;

public class Reverse {

	/*
	 * public static void main(String args[]) { int num =
	 * Integer.parseInt(args[0]); System.out.println("Entered no is  " + num);
	 * int pri = num; int result = 0, reminder; while (num > 0) { reminder = num
	 * % 10; result = result * 10 + reminder; num = num / 10; }
	 * System.out.println(pri + "   Reverse of a no is  " + result); }
	 */

	// Reverse A String Without Using Reverse Built In Method Or Recursion In
	// Java
	static int i, c = 0, res;

	public static void stringreverse(String s) {
		char ch[] = new char[s.length()];
		for (i = 0; i < s.length(); i++)
			ch[i] = s.charAt(i);
		for (i = s.length() - 1; i >= 0; i--)
			System.out.print(ch[i]);
	}

	public static void main(String args[]) {
		stringreverse("Welcome to Selenium");
	}

	// Reverse A String With Using Reverse Built In Method

	/*
	 * public static void main(String args[]) { StringBuffer buffer = new
	 * StringBuffer("Game Plan"); buffer.reverse(); System.out.println(buffer);
	 * }
	 */
}
