package javaSes;

public class CarTest {
	
	public static void main(String[] args) {
		
		BMWinherit bmwi = new BMWinherit();
		
		bmwi.engine();
		bmwi.start();
		bmwi.refuel();
		bmwi.tpms();
		bmwi.autoPark();
		bmwi.stop();
		
		System.out.println("---------------");
		
		AudiInherit ai = new AudiInherit();
		
		ai.engine();
		ai.start();
		ai.refuel();
		ai.tpms();
		ai.laneAssistStart();
		ai.laneAssistEnd();
		ai.stop();
		
		
	}
}
