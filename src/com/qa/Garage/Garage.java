package com.qa.Garage;
import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vh) {
		garage.add(vh);
	}
	
	public void removeVehicle(Vehicle vh ) {
		garage.remove(vh);	
	}
	
	
	public void showVehiclesInGarage() {
		if (garage.size() != 0) {
			for (Vehicle vh : garage) {
				System.out.println(vh);			
			}else {
				System.out.println("No vehicles in garage");
			}
		}
		
		
	}
	// if vehicles != 0, for loop vehicles vh : vehicles
	
	
}
