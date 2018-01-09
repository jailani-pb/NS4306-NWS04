package week1.carapplication;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.model = "Focus ST";
		car1.colour = "Blue";
		Car car2 = new Car();
		car2.brand = "Mazda";
		car2.model = "6";
		car2.colour = "Red";
		printCarDetails(car1);
		printCarDetails(car2);
		
		car1.colour = "White";
		printCarDetails(car1);
		printCarDetails(car2);
		
		car1.pressAccelerate();
		printCarDetails(car1);
		printCarDetails(car2);
		
		car1.pressAccelerate();
		printCarDetails(car1);
		printCarDetails(car2);
	}
	
	public static void printCarDetails(Car car) {
		System.out.println("Car: " + car.brand
				+ " " + car.model + " "
				+ car.colour + " (Speed: "
				+ car.currentSpeed + ")");
	}
	
}
