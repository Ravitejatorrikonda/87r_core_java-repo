package com.exception.test;

class InvalidAgeOfVehicleException extends Exception{
	public InvalidAgeOfVehicleException(String message) {
		super(message);
	}
}

class InvalidAgeOfTireException extends Exception{
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}

class InvalidAgeOfEngineException extends Exception{
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}
}


class Vehicle{
	public void checkAge(int ageOfVehicle , int ageOfTire , int ageOfEngine)throws InvalidAgeOfVehicleException, InvalidAgeOfTireException, InvalidAgeOfEngineException{
		if(ageOfVehicle > 10) {
			throw new InvalidAgeOfVehicleException("Invalid age....");
		}else if(ageOfTire > 2) {
			throw new InvalidAgeOfTireException("invalid tire...");
		}else if(ageOfEngine > 15) {
			throw new InvalidAgeOfEngineException("Invalid Engine...");
		}else {
			System.out.println("Valid Vehicle...");
		}
	}
}


public class Example9 {

	public static void main(String[] args) {
		
		
		try {
			new Vehicle().checkAge(16, 1, 10);
		} catch (InvalidAgeOfVehicleException | InvalidAgeOfTireException | InvalidAgeOfEngineException e) {
			e.printStackTrace();
		}
		System.out.println(" iam Exicuted..");

	}

}
