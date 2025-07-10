package revision;

public class conditions {
	public static void main(String[] args) {
		
		int a =1;
		int b =2;
		
		if(a>b) {
			System.out.println(a + " is greater than " + b);
		}else {
			System.out.println(b + " is greater than " + a);
		}
		 
		String browser = "chrome";
		
		System.out.println("***********");
		
		switch(browser) {
		case "firefox":
			System.out.println("firefox browser selected");
			break;
		case "edge":
			System.out.println("edge browser selected");
			break;
		case "chrome":
			System.out.println("chrome browser selected");
			break;
		default:
			System.out.println("please enter proper name!");
		}
		
		
	}
}
