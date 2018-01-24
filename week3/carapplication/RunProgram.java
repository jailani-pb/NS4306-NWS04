package week3.carapplication;

public class RunProgram {

	public static void main(String[] args) {
		Desktop desktop1 = new Desktop("Windows 10");
		System.out.println(desktop1.operatingSystem);
		desktop1.powerOn();
		System.out.println(desktop1.powerStateOn);
		
		SmartPhone smartPhone1 = new SmartPhone("Android");
		System.out.println(smartPhone1.operatingSystem);
		smartPhone1.chargeBattery(50);
		System.out.println(smartPhone1.getBatteryPercentage());
		smartPhone1.onDisplay();
		System.out.println(smartPhone1.displayOn);
		smartPhone1.powerOn();
		System.out.println(smartPhone1.powerStateOn);
	}
	
}
