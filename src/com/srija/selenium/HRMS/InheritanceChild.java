package com.srija.selenium.HRMS;

public class InheritanceChild extends Inheritance {
		public static String childName="Child";
		public int childAge;

		public static void printMyName(){
			System.out.println("My name is "+ childName+" " +familyName);
	}
		
		public static void main(String[] args){
			printMyName();
		}
	}
