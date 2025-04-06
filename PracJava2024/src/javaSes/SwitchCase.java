package javaSes;

public class SwitchCase {

	public static void main(String[] args) {
		
		SwitchCase sc = new SwitchCase();
		char switchMe = 's';
		
		if(sc.checkMyState(switchMe)) {

        switch(switchMe){
            case 'a':
                System.out.println("Test A");
                break;
            case 's':
                System.out.println("Test B");
                break;
            case 'c':
                System.out.println("Test C");
                break;
            default:
                System.out.println("Test Default");
                break;
        	}
		}
	}
	
	private Boolean checkMyState(char c) {
		
		switch(c) {
		case 'x':
			System.out.println("x");
			return true;
		case 'y':
			System.out.println("y");
			return false;
		default: 
			System.out.println("really?");
			return true;
		}		
	}

}
