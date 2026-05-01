package com.Bank;

public class BankProcessor {

	public static void main(String[] args) {
	BankAccount obj=new BankAccount(2345345, "Rajesh", 50000.0);
	System.out.println("Current Balance : "+obj.getBalance());
	
	obj.deposit(20000.0);
	System.out.println(obj.getBalance());
	
	obj.withdraw(80000.0);
	System.out.println(obj.getBalance());

	}

}
