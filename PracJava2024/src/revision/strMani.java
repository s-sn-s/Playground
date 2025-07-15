package revision;

import java.util.Arrays;

public class strMani {

	public static void main(String[] params) {
		
		String myStr = "Hello people of the Earth!";
		System.out.println(myStr.length());
		
		System.out.println(myStr.indexOf("of"));
		
		System.out.println(myStr.indexOf('E'));
		
		System.out.println(myStr.indexOf('S'));
		
		//split
		String[] myStrArr = myStr.split(" ");
		System.out.println(Arrays.toString(myStrArr));
	}
	
}
