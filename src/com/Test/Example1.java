package com.Test;

import java.util.Scanner;

class Vehicle{
	private String name;
	private long number;
	private String VehicleType;
	public Vehicle(String name, long number, String vehicleType) {
		super();
		this.name = name;
		this.number = number;
		VehicleType = vehicleType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	
	
	public void profileDetails() {
		System.out.println("Owener Name : "+name);
		System.out.println("Vehicle Number : "+number);
		System.out.println("Vehicle Type : "+VehicleType);
	}
	
	
	
	
}


class ServiceVehicle extends Vehicle{
	private String serviceCenterName;
	private String serviceCategory;
	
	public ServiceVehicle(String name, long number, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		super(name, number, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vehicle profile has been created.");
	}

	public String getServiceCenterName() {
		return serviceCenterName;
	}

	public void setServiceCenterName(String serviceCenterName) {
		this.serviceCenterName = serviceCenterName;
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	
	
	
	public void updatedServiceCenter(String center) {
		if(center == null && center.equals("")) {
			System.out.println("invalid service upadte");
		}else {
			this.serviceCenterName=center;
		}
	}
	
	public void updatedServiceCategory(String category) {
		if(category == null && category.equals("")) {
			System.out.println("Invlid Category........");
		}else {
			this.serviceCategory=category;
		}
	}
	
	
	
	public void vehicleUpdatedDetails() {
	   
		profileDetails();
		System.out.println("Service Center Name : "+serviceCenterName);
		System.out.println("Service category: "+serviceCategory);
	}
	
	
	
	
}

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :  ");
		String name=sc.nextLine();
		
		System.out.println("ENter number : ");
		long number=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter VehicleType : ");
		String type=sc.nextLine();
		
		System.out.println("Enter Service Center Name : ");
		String center=sc.nextLine();
		
		System.out.println("Enter Ctegory : ");
		String category=sc.nextLine();
		
		
		ServiceVehicle sv=new ServiceVehicle(name, number, type, center, category);
		
		
//		int option=0;
		boolean result=true;
		
		while(result) {
			System.out.println("Provide a menu to perform the following operations:\r\n"
					+ "1. Update Service Category\r\n"
					+ "2. Update Service Center Name\r\n"
					+ "3. View Vehicle Profile Details\r\n"
					+ "4. Exit the program\r\n"
					+ "");
			int option=sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			
			case 1:{
				System.out.println("Updated service category : ");
				String categorys=sc.nextLine();
				sv.updatedServiceCategory(categorys);
				
				break;
			}case 2:{
				
				System.out.println("upadte Service center Name : ");
				String centers=sc.nextLine();
				sv.updatedServiceCenter(centers);
				break;
			}case 3:{
				sv.vehicleUpdatedDetails();
				break;
			}case 4:{
				System.out.println("Thank you !");
				result=false;
				break;
			}
				

			default:System.out.println("invalid options");
				break;
			}
			
			
		}
		
		
		sc.close();

	}

}
