package com.exception.test;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class St {
	public void checkAge(int age) throws InvalidAgeException {
		if (age < 16) {
			throw new InvalidAgeException("Invalid Age...");
		} else {
			System.out.println("Adult..");
		}
	}
}

public class Example8 {

	public static void main(String[] args) {
		try {
			new St().checkAge(15);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println(" i am Eicuted..");
	}

}
