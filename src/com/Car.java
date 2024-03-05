package com;

public class Car 
{
	private String vehicleNo;
	private String color;
	private int noOfWheels;
	private Long chassisNo;
	
	
	public Car(String vehicleNo, String color, int noOfWheels, Long chassisNo) 
	{
		this.vehicleNo = vehicleNo;
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.chassisNo = chassisNo;
	}
	
	
	public String getVechileNo() {
		return vehicleNo;
	}
	public void setVechileNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public Long getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(Long chassisNo) {
		this.chassisNo = chassisNo;
	}

	public void carDetails()
	{
		System.out.println("Vechile No :"+vehicleNo);
		System.out.println("Color : "+color);
		System.out.println("NoOfWheels :"+noOfWheels);
		System.out.println("Chassis No : "+chassisNo);
	}
	
	
	
	
	
	
	
}
