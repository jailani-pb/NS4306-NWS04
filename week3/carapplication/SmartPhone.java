package week3.carapplication;

public class SmartPhone extends Portable {

	boolean displayOn;
	
	public SmartPhone(String operatingSystem) {
		super(operatingSystem);
		offDisplay();
	}

	public void onDisplay() {
		displayOn = true;
	}
	
	public void offDisplay() {
		displayOn = false;
	}
	
	@Override
	public void powerOn() {
		super.powerOn();
		onDisplay();
	}
	
}
