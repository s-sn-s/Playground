package revision;

public class accessModifiers {
	
	public int i = 1;
	protected char c = 'c';
	String s = "savin";
	private boolean b = false;
	
	public void displayVars() {
		System.out.println("Same class!");
		System.out.println("public " + i);
		System.out.println("protected " + c);
		System.out.println("undefined/default " + s);
		System.out.println("private " + b);
	}

	public static void main(String[] s) {
		accessModifiers am = new accessModifiers();
		am.displayVars();
	}
	
}
