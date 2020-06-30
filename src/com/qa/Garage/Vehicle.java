package com.qa.Garage;

public class Vehicle {
	
	public void noise() {
		System.out.println("Beep, move out the way");
	}
	
	public void numberOfGears() {
		System.out.println("this vehicle has x gears");
	}
	
	public String brand;
	public String name;
	public int year;
	public int topspeed;
	public int enginesize;
	
	//GETTERS AND SETTERS
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
	public int getEnginesize() {
		return enginesize;
	}
	public void setEnginesize(int enginesize) {
		this.enginesize = enginesize;
	}
	

}
