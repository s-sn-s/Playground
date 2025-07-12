package revision;

public class thisConst {

	String name;
	int age;
	String city;
	boolean isActive;
	int salary;
	
//	public thisConst() {
//		
//	}
	
	public thisConst(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	
	public thisConst(String name, int age, String city, boolean isActive, int salary) {
//		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
		this.salary = salary;
	}

	public static void main(String[] params) {
		thisConst tc1 = new thisConst("Savin", 32);
		System.out.print(tc1.name);		
		System.out.println(tc1.age);
		System.out.println("-------------");
		
		thisConst tc2 = new thisConst("Roopali", 28, "Mumbai", true, 100000);
		System.out.print(tc2.name);		
		System.out.print(tc2.age);
		System.out.print(tc2.city);		
		System.out.print(tc2.isActive);
		System.out.println(tc2.salary);
		System.out.println("-------------");
		
		thisConst tc3 = new thisConst("Sachin", 35, "Mumbai", true, 130000);
		System.out.print(tc3.name);		
		System.out.print(tc3.age);
		System.out.print(tc3.city);		
		System.out.print(tc3.isActive);
		System.out.println(tc3.salary);
		System.out.println("-------------");
	}
}
