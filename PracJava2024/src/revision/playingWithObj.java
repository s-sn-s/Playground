package revision;

public class playingWithObj {
	
	int myInt = 100;
	String myStr = "Str";
	char ch = 'c';
	int undefinedInt;
	
	public static void main(String[] args) {
		
		playingWithObj pwo = new playingWithObj();
		pwo.undefinedInt=101;
		System.out.println(pwo.ch);
		System.out.println(pwo.myStr);
		System.out.println(pwo.myInt);
		System.out.println(pwo.undefinedInt );
		
		
		
	}
}
