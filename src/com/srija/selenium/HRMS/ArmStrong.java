package com.srija.selenium.HRMS;

public class ArmStrong {

	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]);
		int n = num;
		int check = 0, reminder;

		while (num > 0) {
			reminder = num % 10;
			check = check + (int) Math.pow(reminder, 3);
			num = num / 10;
		}
		if (check == n)
			System.out.println(n + "  is a ArM StRoNg no  ");
		else
			System.out.println(n + "  Not a Arm strong no ");
	}
}
