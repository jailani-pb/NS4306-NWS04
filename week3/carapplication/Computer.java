package week3.carapplication;

public class Computer {

	String operatingSystem;
	boolean powerStateOn;
	
	public Computer(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		shutDown();
	}
	
	public void shutDown() {
		powerStateOn = false;
	}
	
	public void powerOn() {
		powerStateOn = true;
	}
	
}
