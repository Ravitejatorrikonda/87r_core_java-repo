package com.bankdetails;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter User Name : ");
		String name = sc.nextLine();

		System.out.println("Enter User Adress : ");
		String adress = sc.nextLine();

		System.out.println("Enter PhineNumber : ");
		long number = sc.nextLong();

		System.out.println("Enter Intial Balance : ");
		double balance = sc.nextDouble();

		BankApplication obj = new BankApplication(name, adress, number, balance);

		boolean result = true;

		while (result) {

			System.out.println("**** Select an Option from Below ****\r\n" + "1. Withdraw\r\n" + "2. Deposit\r\n"
					+ "3. Show Balance\r\n" + "4. Exit\r\n" + "Enter your option [1-4]:\r\n" + "");

			int options = sc.nextInt();

			switch (options) {
			case 1: {

				System.out.println("Enter withdraw ammount : ");
				double amount = sc.nextDouble();
				obj.withdraw(amount);
				break;
			}
			case 2: {

				System.out.println("Enter diposit ammount : ");
				double amount = sc.nextDouble();
				obj.deposit(amount);
				break;
			}
			case 3: {

				obj.showBalance();
				break;
			}
			case 4: {

				System.out.println("Thank you !");
				result = false;
				break;
			}
			default:
				System.out.println("Invalid option");
				break;
			}

		}

		sc.close();

	}

}
