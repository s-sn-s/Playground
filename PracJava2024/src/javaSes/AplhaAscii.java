package javaSes;

public class AplhaAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		System.out.println("Sr | Alphabet | ASCII ");
		for(char a='a';a<='z';a++) {
			System.out.println(counter + " | " + a + " | " + (short)a);
			counter++;
		}
		System.out.println("____________________________");
		for(char a='A';a<='Z';a++) {
			System.out.println(counter + " | " + a + " | " + (short)a);
			counter++;
		}
		System.out.println("____________________________");
		for(char a='0';a<='9';a++) {
			System.out.println(counter + " | " + a + " | " + (short)a);
			counter++;
		}
	}

}
