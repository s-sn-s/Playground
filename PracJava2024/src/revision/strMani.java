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
		
		//escape char
		String escStr = " Hello \"Team\" ";
		
		if(escStr.trim().startsWith("Hello")) {
			System.out.println(true);
		}
		
		System.out.println(escStr);
		
		System.out.println("-----------");
		
		String team = escStr.substring(escStr.indexOf('T'),escStr.indexOf("m")+1);
		  
		System.out.println(team);
		
		System.out.println("-----------");
		String a = "s";
		String b = "s";
		
		String c = new String("s");
		
		if(a==b) {
			System.out.println(true);
		}
		System.out.println(a==c?true:false);
		System.out.println(a=="s"?true:false);
		System.out.println(a.equals(c)?true:false);
		
	}
	
}
