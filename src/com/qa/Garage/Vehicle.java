package com.qa.Garage;

public class Vehicle {
	
	public void noise() {
		System.out.println("Beep, move out the way");
	}
	
	public void numberOfGears() {
		System.out.println("this vehicle has x gears");
	}
	
	public int id;
	public double bill;
	public String brand;
	public String name;
	public int year;
	public int topspeed;
	public double enginesize;
	
	// Constructors using field
	
	public Vehicle(int id, double bill, String brand, String name, int year, int topspeed, double enginesize) {
		super();
		this.id = id;
		this.bill = bill;
		this.brand = brand;
		this.name = name;
		this.year = year;
		this.topspeed = topspeed;
		this.enginesize = enginesize;
	}

	
	// Getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}

	public double getEnginesize() {
		return enginesize;
	}

	public void setEnginesize(double enginesize) {
		this.enginesize = enginesize;
	}
	
	
}