package revision;

public class staticNonStat {

	public int marks(String sub) {
		switch(sub.toUpperCase().trim()) {
		case "OB":
			return 90;
		case "CP":
			return 99;
		case "JV":
			return 89;
		case "PY":
			return 100;
		default:
			System.out.println("Please pass right subject name!");
			return -1;
		}
	}
	
	public static String studentName() {
		return "Savin";
	}

	public static void main(String[] para) {
		
		staticNonStat sts = new staticNonStat();
		
		System.out.println(studentName() + " scored " + sts.marks("jv") + " in Java!");
		
	}
	
}
