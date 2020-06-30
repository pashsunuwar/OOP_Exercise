package com.qa.Inheritance;

public class Animal {
	
	
	public String name;
	public String colour;
	public int age;
	public String favouritehobby;
	public void sleep() {
		System.out.println("zzZZZ");
	}
	
	public void noise() {
		System.out.println("grr");
	}
	
	// for override method
	public static void emotion() {
		System.out.println("im mad yo");
	}
	
	// for override method
	public static void size() {
		System.out.println("HUGEEEEEE");
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavouritehobby() {
		return favouritehobby;
	}
	public void setFavouritehobby(String favouritehobby) {
		this.favouritehobby = favouritehobby;
	}

}
