package com.qa.Garage;

public class Car extends Vehicle {
	
	public Car(int id, double bill, String brand, String name, int year, int topspeed, double enginesize) {
		super(id, bill, brand, name, year, topspeed, enginesize);
		// TODO Auto-generated constructor stub
	}

	final int MAX_SEAT = 5;

	@Override
	public String toString() {
		return "Car [id=" + id + ", bill=" + bill + ", brand=" + brand + ", name=" + name + ", year=" + year
				+ ", topspeed=" + topspeed + ", enginesize=" + enginesize + "]";
	}
	

}
