package revision;

import java.util.Arrays;

public class numSys {

	public static void main(String[] args) {
		
		int a = 5;
		
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println("");
		}
		System.out.println("-------------");
		
		
		//Arrays
		
		int intArr[] = new int[5];
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		System.out.println(Arrays.toString(intArr));
		
		System.out.println("-------------");
		
		for(int i=0; i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		
	}
	
	
	
	
}
