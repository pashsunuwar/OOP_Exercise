package com.qa.Inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Dog doggo = new Dog();
		doggo.setAge(2);
		doggo.setFavouritehobby("playing catch");
		System.out.println("My " + doggo.age +  " year old dog loves " + doggo.getFavouritehobby());
		//Animal doggo = new Dog(); doesn't work with doggo.noise & doggo.emotion.. why?
		Animal.noise();
		doggo.emotion();
		doggo.size();
		
		
		Tiger kitty = new Tiger();
		kitty.setColour("orange-brown");
		kitty.setFavouritehobby("sleeping");
		kitty.noise();
		System.out.println("Kitty the tiger has " + kitty.getColour() + " fur and enjoys " + kitty.getFavouritehobby());
		kitty.sleep();
		kitty.emotion();
		
		
		Gorilla Harambe = new Gorilla();
		Harambe.setName("Harambe");
		Harambe.setColour("Black");
		Animal.size();
		Harambe.emotion();
		Harambe.sleep();
		Harambe.noise();
		
		
		
		
	}

}
