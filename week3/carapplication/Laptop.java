package week3.carapplication;

public class Laptop extends Portable {

	boolean sleep;
	
	public Laptop(String operatingSystem) {
		super(operatingSystem);
		closeLid();
	}
	
	public void closeLid() {
		sleep = true;
	}
	
	public void openLid() {
		sleep = false;
	}

}
