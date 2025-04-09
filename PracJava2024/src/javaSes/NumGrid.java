package javaSes;

public class NumGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//00 01 02 03
		//10 11 12 13
		//20 21 22 23
		//30 31 32 33
		
		int max = 9;
		
		for(int tens = 0;tens<=max;tens++) {
			for(int ones = 0;ones<=max;ones++) {
			System.out.print(tens+ "" + ones + " ");	
			}
			System.out.println();
		}
		
	}

}
