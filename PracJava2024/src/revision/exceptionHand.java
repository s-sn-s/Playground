package revision;

public class exceptionHand {

	public static void main(String[] params) {
		try {
			System.out.println(9/0);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic error!");
			e.printStackTrace();
		}
	}	
}