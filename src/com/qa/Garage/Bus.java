package com.qa.Garage;

public class Bus extends Vehicle{


	public Bus(int id, double bill, String brand, String name, int year, int topspeed, double enginesize) {
		super(id, bill, brand, name, year, topspeed, enginesize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", bill=" + bill + ", brand=" + brand + ", name=" + name + ", year=" + year
				+ ", topspeed=" + topspeed + ", enginesize=" + enginesize + "]";
	}

	final int MAX_SEAT = 50;
	

}
