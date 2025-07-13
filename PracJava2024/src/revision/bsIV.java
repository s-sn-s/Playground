package revision;

public interface bsIV extends ukEuroMotors{

	int maxSpeed = 120;
	
	void hornRegulation();
	
	static int speedLimit() {
		return maxSpeed;
	}
	
	default void seatBelt() {
		 System.out.println("we provide 2 seat belts!");
	}
	
}
