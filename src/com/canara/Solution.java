package com.canara;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank b = new BankImpl(25000.0);
		while(true) {
			System.out.println("Welcome to Canara Bank");
			System.out.println("Enter your option \n1.Deposit\n2.Withdraw\n3.Getbalance\n4.exit");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.println("enter amount to be deposited");
			int damount=scan.nextInt();
			b.deposit(damount);
			break;
			case 2:System.out.println("enter amount to be withdrawal");
			b.withdrawn(scan.nextInt());
			break;
			case 3:System.out.println(b.getBalance());
			break;
			case 4:System.out.println("Thank you, visit Again");
				System.exit(0);
			break;
			default:
				try {
					throw new InvalidChoiceException("Invalid choice, Kindly enter valid choice");
				}
				catch (InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("-------------------------------------------");
		}
	}
}
