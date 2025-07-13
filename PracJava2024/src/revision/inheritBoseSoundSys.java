package revision;

public class inheritBoseSoundSys extends inheritSoundSys{

	public inheritBoseSoundSys() {
		System.out.println("Bose default const!");
	}
	
	public inheritBoseSoundSys(int i) {
//		super();
		super(i-1);
		System.out.println("Bose Parameterised const " + i);
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Added some bass bro!!");
	}
	
}
