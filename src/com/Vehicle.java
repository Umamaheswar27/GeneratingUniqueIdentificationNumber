package com;

public class Vehicle
{
	public String vehicleNumber;
	public String color;
	public int noOfWheels;
	public long chasissNumber;
	
	
	private Vehicle(String vehicleNumber, String color, int noOfWheels, long chasissNumber)
	{
		
		this.vehicleNumber = vehicleNumber;
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.chasissNumber = chasissNumber;
	}


	public String getVehicleNumber() 
	{
		return vehicleNumber;
	}


	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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


	public long getChasissNumber() {
		return chasissNumber;
	}


	public void setChasissNumber(long chasissNumber) {
		this.chasissNumber = chasissNumber;
	}
	
	
	public void vehcileDetails()
	{
		System.out.println("VehcileNumber: "+vehicleNumber);
		System.out.println("Color: "+color);
		System.out.println("NOOfWheels: "+noOfWheels);
		System.out.println("chasissNumber: "+chasissNumber);
	}
	

}
