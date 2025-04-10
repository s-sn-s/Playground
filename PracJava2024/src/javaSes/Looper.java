package javaSes;

import java.util.Arrays;

public class Looper {
	
	public static void main(String[] args) {
		
		int upper = 10;
		
		for(int i = 1;i<upper;i++){
			for(int j = 0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("----------");
		
		String[] sAr = {"Hello","looper","Its","enhanced!"};
		
		//enhanced for loop
		for(String s : sAr) {
			System.out.println(s);
		}
		
		System.out.println("----------");
		
		//object array
		Object[] myObjectArray = new Object[4];
		myObjectArray[0] = 1;
		myObjectArray[1] = "b";
		myObjectArray[2] = 'c';
		// object index 3 2ould be null
		
		
		System.out.println(Arrays.toString(myObjectArray));
		
		System.out.println("----------");
		
		for(Object o : myObjectArray) {
			System.out.println(o);
		}
	}
}