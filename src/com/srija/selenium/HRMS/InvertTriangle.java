package com.srija.selenium.HRMS;

public class InvertTriangle {

		public static void main(String args[]) {

			int num = Integer.parseInt(args[0]);
			
			while(num>0){

			for (int i = 1; i <= num; i++) {
				
					System.out.print(" " + num + " ");
				}
				System.out.println("\n");
				num--;
			}

		}
	}


