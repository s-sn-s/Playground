package revision;

public class rvStr {

	public static void main(String[] param) {
		String s = "My name is Savin";
		
		System.out.println("My OG string is \"" + s + "\"");
		System.out.print("My Reversed String is \"");
		
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("\"");
	}
	
}
