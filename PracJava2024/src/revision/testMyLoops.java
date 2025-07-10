package revision;

public class testMyLoops {

	public static void main(String[] args) {
		
		int a = 3;
		int c = 1;
		while(a>0) {
			System.out.print("\nlet me loop");
			for(int i = c;i>0;i--) {
				System.out.print("!");
			}
			c++;
			a--;
		}
		
		System.out.println("\n**********");
		
		//pre for
		
		for(int i = 1; i<3; ++i) {
			System.out.println(i);
		}
		
		System.out.println("**********");
		
		//post for
		
		for(int i = 1; i<3; i++) {
			System.out.println(i);
		}
		
	}
}
