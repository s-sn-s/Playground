package javaSes;

public class CarInherit extends VehicleInherit{

	public void start() {
		System.out.println("Car start!");
	}
	
	public void stop() {
		System.out.println("Car stop!");
	}
	
	public void refuel() {
		System.out.println("Car refueling!");
	}
	
	public void tpms() {
		System.out.println("Car checking tyre pressure!");
	}
}
