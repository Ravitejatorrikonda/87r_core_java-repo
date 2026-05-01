package com.bankdetails;

public class BankApplication {

	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;

	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
         System.out.println("Account Created Successfully");
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	//setters

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//methods
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("enter ammount 0 above ");
		}else {
			this.balance +=amount;
			System.out.println("ammount deposit successfully"+balance);
		}
		
	}
	public void withdraw(double amount) {
		
		if(balance >=amount) {
			this.balance -=amount;
			System.out.println("ammount withdraw success");
		}else if(amount <=0) {
			System.out.println("Invalid withdrawal amount");
		}else {
			System.out.println("Insufficient funds");
		}
		
	}
	public void showBalance() {
		System.out.println("current balance : "+ balance);
	}
	
	
	
	
	

}
