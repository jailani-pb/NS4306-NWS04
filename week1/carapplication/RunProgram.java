package week1.carapplication;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Wheels wheels1 = new Wheels();
		wheels1.brand = "Continental";
		wheels1.size = 18;
		wheels1.brakeSpeed = 4;
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.model = "Focus ST";
		car1.colour = "Blue";
		car1.wheels = wheels1;
		Car car2 = new Car();
		car2.brand = "Mazda";
		car2.model = "6";
		car2.colour = "Red";
		car2.wheels = wheels1;
		printCarDetails(car1);
		printCarDetails(car2);
		
		car1.colour = "White";
		car1.wheels.brand = "Pirelli";
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
		System.out.println("Wheels: " + car.wheels.brand
				+ " " + car.wheels.size + " size"
				+ " " + car.wheels.brakeSpeed + " brake speed");
	}
	
}



