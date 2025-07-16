package revision;

public class palin {

	public boolean checkPalindrome(String originalString) {
		
		String reversedString = new String();
		
//		StringBuilder reversedString = new StringBuilder(); 
		
		for(int i = originalString.length()-1;i>=0;i--) {
			reversedString=reversedString + originalString.charAt(i);
//			reversedString.append(reversedString);
		}
		
		return originalString.equalsIgnoreCase(reversedString)?true:false;
//		return originalString.equals(reversedString)?true:false;
	}
	
	public static void main(String[] params) {
		palin p = new palin();
		
		System.out.println(p.checkPalindrome("Wow"));
		System.out.println(p.checkPalindrome("Savin"));
		System.out.println(p.checkPalindrome("Roopali"));
		
	}
}
