package revision;

public class samePackAccessMod {

	public void displayVarz(accessModifiers am) {
		System.out.println("Same package!");
		System.out.println("public " + am.i);
		System.out.println("protected " + am.c);
		System.out.println("undefined/default " + am.s);
	}
	
	public static void main(String[] s) {
		accessModifiers am = new accessModifiers();
		samePackAccessMod spam = new samePackAccessMod();
		spam.displayVarz(am);
	}
}
