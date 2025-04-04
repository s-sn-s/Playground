package javaSes;

public class Looper {
	
	public static void main(String[] args) {
		
		int upper = 10;
		
		for(int i = 1;i<upper;i++){
			for(int j = 0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}