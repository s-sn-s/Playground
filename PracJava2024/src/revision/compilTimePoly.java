package revision;

public class compilTimePoly {
	
	static final int id = 44354;
	static String name = "Savin"; 

	public void myMeth() {
		System.out.println("unparameterised");
	}
	
	public void myMeth(int paraInt) {
		System.out.println("single int parameterised " + paraInt);	
	}
	public void myMeth(String paraStr) {
		System.out.println("single str parameterised " + paraStr);
	}
	public void myMeth(int paraInt, String paraStr) {
		System.out.println("double parameterised "   + paraInt + " "+ paraStr);
	}
	public void myMeth(String paraStr, int paraInt) {
		System.out.println("double parameterised with reverse order " + paraStr + " " + paraInt);
	}
	
	public static void main(String[] args) {
		
		compilTimePoly ctp = new compilTimePoly();
		
		ctp.myMeth();
		System.out.println("----------------");
		ctp.myMeth(id);
		System.out.println("----------------");
		ctp.myMeth(name);
		System.out.println("----------------");
		ctp.myMeth(id,name);
		System.out.println("----------------");
		compilTimePoly.name = "Savin_Shetty";
		ctp.myMeth(name,id);
		System.out.println("----------------");
	}
}
