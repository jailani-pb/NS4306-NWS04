package week3.carapplication;

public class Portable extends Computer {

	int batteryCapacity;
	
	public Portable(String operatingSystem) {
		super(operatingSystem);
	}
	
	public int getBatteryPercentage() {
		return batteryCapacity;
	}
	
	public void chargeBattery(int percentage) {
		if(percentage >= 0) {
			batteryCapacity += percentage;
			if(batteryCapacity > 100) {
				batteryCapacity = 100;
			}
		}
	}
	
	public void useDevice() {
		if(powerStateOn) {
			batteryCapacity -= 5;
		}
	}

}




