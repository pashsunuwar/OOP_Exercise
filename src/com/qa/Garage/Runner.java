package com.qa.Garage;

public class Runner {
	public static void main(String[] args) {
		
//		Car car1 = new Car(001, 200, "BMW", "M4", 2020, 150, 4);
//		
//		Car hiscar = new Car(002, 400, "BMW", "M8", 2018, 150, 4);
//		vehicles.add(hiscar);
//		Car hercar = new Car(003, 100, "Fiat", "500", 2017, 70, 1.2);
//		
//		Bus bus1 = new Bus(004, 150, "Volvo", "Tank", 1996, 69, 5.5);
//		
//		Motorcycle bike = new Motorcycle(005, 400, "Honda", "Fly", 2016, 200, 3);
//		Motorcycle bike2 = new Motorcycle();
//		
//		
//		System.out.println("This car has " + hiscar.MAX_SEAT + " seats");
//		hercar.noise();
//		bus1.numberOfGears();
//		System.out.println();
		
		Garage g = new Garage();
		
		g.addVehicle(new Car(001, 300, " BMW ", " M4 ", 2020, 140, 3.3));
		g.addVehicle(new Bus(002, 500, " Volvo ", " Tank ", 2009, 70, 4));
		g.addVehicle(new Car(003, 180, " Ford ", " g ", 2000, 90, 3));
		
		g.showVehiclesInGarage();
	}

}
