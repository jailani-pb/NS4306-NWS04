package week1.carapplication;

public class Car {
	
	String brand;
	String model;
	String colour;
	int currentSpeed = 0;
	Wheels wheels;
	
	public void pressAccelerate() {
		int speedModifier = wheels.size / 2;
		currentSpeed += 5 + speedModifier;
	}
	
	public void pressBrake() {
		// Implement brakeModifier with int data type
		
		// Assign wheels brakeSpeed to brakeModifier
		int brakeModifier = wheels.brakeSpeed;
		// Decrement currentSpeed with the brakeModifier
		currentSpeed -= brakeModifier;
		// Challenge: Prevent currentSpeed from having
		// negative value
		if(currentSpeed < 0) {
			currentSpeed = 0;
		}
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", colour=" + colour + ", currentSpeed=" + currentSpeed
				+ ", wheels=" + wheels + "]";
	}
	
}
