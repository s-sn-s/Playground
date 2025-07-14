package revision2;
import revision.accessModifiers;

public class diffPackAccessMod extends accessModifiers{

	public static void main(String s) {
		diffPackAccessMod dpam = new diffPackAccessMod();
		System.out.println("Different package!");
		System.out.println("public " + dpam.i);
		System.out.println("protected " + dpam.c);
	}
}
