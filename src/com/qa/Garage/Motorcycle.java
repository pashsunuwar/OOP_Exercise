package com.qa.Garage;

public class Motorcycle extends Vehicle{
	
	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", bill=" + bill + ", brand=" + brand + ", name=" + name + ", year=" + year
				+ ", topspeed=" + topspeed + ", enginesize=" + enginesize + "]";
	}

	public Motorcycle(int id, double bill, String brand, String name, int year, int topspeed, double enginesize) {
		super(id, bill, brand, name, year, topspeed, enginesize);
		// TODO Auto-generated constructor stub
	}

	final int MAX_SEAT = 2;

	
}
