package com.srija.selenium.HRMS;

public class Polyndrom {

	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]);
		System.out.println("Entered no is  " + num);
		int pri = num;
		int result = 0, reminder;
		while (num > 0) {
			reminder = num % 10;
			result = result * 10 + reminder;
			num = num / 10;
		}

		if (result == pri)
			System.out.println(pri + "  Is a polyndrom ");
		else
			System.out.println(pri + " Not a poyndrom ");
	}
}
