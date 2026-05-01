package com.Bank;

public class BankAccount {
	
	private int accNum;
	private String accHolder;
	private double balance;
	public BankAccount(int accNum, String accHolder, double balance) {
		
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	//getters
	public int getAccNum() {
		return accNum;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public double getBalance() {
		return balance;
	}
	
	//setters
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("please enter amount minmum '100'  or above");
		}else {
			this.balance +=amount;
		}
	}
	
	public void withdraw(double amount){
		if(balance >= amount) {
			this.balance -=amount;
			
			
		}else {
			System.out.println("insufficent Balance");
		}
		
	}
	
	
	

}
