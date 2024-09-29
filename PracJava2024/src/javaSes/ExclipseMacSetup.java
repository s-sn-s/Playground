package javaSes;

public class ExclipseMacSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Java Mac setup");
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
