package javaSes;

public class DataTypes {
	
	public static void main(String[] args) {
		int a = 2147483647;
		byte b0 = 127;
		
		long ln = 9223372036854775807l;
		
		//Numeric
		//Whole number
		//byte > short > int > long
		//decimal - floating
		//float > double
		
		float r = 12.1234567891f;
		double r2 = 12.123456789123456789d;
		
		System.out.println(r);
		System.out.println(r2);
		
		char t = ' ';
		
		//infinity
		System.out.println(1/0.0);
		//NaN
		System.out.println(0.0/0.0);
		
	}

}
