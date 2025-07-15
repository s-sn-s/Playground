package revision;

public class finallyTestWIthReturn {

	public int finalyyVSreturn() {
		
		try {	
		System.out.println(1/0);	
		}
		catch(Exception e) {
			return 1;
		}
		finally {
			return 0;
		}
	}
	
	public static void main(String[] prams) {
		
		finallyTestWIthReturn fin = new finallyTestWIthReturn();
		int a = fin.finalyyVSreturn();
		System.out.println(a);
	}
	
}
