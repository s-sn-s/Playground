package revision;

public class mahindraProductionLine implements usMotorStandards, bsIV{

	@Override
	public void EmissionCheck() {
		System.out.println("Emissions not more than 4%");
	}

	@Override
	public void decibleCheck() {
		System.out.println("Silencer decible maxed at 40dB");
	}

	@Override
	public void hornRegulation() {
		System.out.println("Horn max at 70dB!");
	}
	
	public void seatBelt() {
		
		System.out.println("We provide 6 seat belts");
	}
}
