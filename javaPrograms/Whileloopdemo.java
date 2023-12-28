package javaPrograms;

import java.util.Scanner;

	public class Whileloopdemo {
		public static void main(String[] args) {
			
			int pin_DB = 1234;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the valid pin number");
			int pin_entered = scan.nextInt();
		
			while(pin_DB != pin_entered)
			{
				System.out.println("The ATM pin entered is not correct, Enter the correct pin number");
				
				pin_entered = scan.nextInt();
			
			}
			
			System.out.println("Enter Amount to be winthdrawn");
			
		}

	}
