package revision;

public class samePacChildClasAccMod extends accessModifiers{

	public static void main(String[] params) {
		samePacChildClasAccMod spccam = new samePacChildClasAccMod();
		System.out.println("Same package child class!");
		System.out.println("public " + spccam.i);
		System.out.println("protected " + spccam.c);
		System.out.println("undefined/default " + spccam.s);
	}
}
