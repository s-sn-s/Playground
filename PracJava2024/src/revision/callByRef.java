package revision;

public class callByRef {

	//static method can not directly access non static variables or methods
	int myMarks;
	String name;
	
	public void myNonStaticMethod(callByRef cbr) {
		System.out.println("My non static method");
		myMarks = 89;
		name = "Savin";
		System.out.println(cbr.myMarks + " " + cbr.name);
		callByRef.myStaticMethod(cbr);
	}
	
	public static void myStaticMethod(callByRef cbr) {
		System.out.println("My static method");
		cbr.myMarks = 99;
		cbr.name = "SavinShetty";
		System.out.println(cbr.myMarks + " " + cbr.name);
		cbr.myNonStaticMethod2();
		
	}
	
	public void myNonStaticMethod2() {
		System.out.println("My 2nd non static method");
	}
	
	public static void main(String[] params) {
		callByRef cbr = new callByRef();
		cbr.myMarks = 79;
		cbr.name = "SavinS";
		System.out.println(cbr.myMarks + " " + cbr.name);
		cbr.myNonStaticMethod(cbr);
		System.out.println(cbr.myMarks + " " + cbr.name);
		
	}
}
