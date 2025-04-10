package javaSes;

public class CompileTimePolyMethOvLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompileTimePolyMethOvLoad cTpMoVlD = new CompileTimePolyMethOvLoad();
		Boolean paymentStatus = false;
		
		String paymentMethod = "ccard";
		
		switch(paymentMethod.toLowerCase().trim()){
			case "api":
				paymentStatus = cTpMoVlD.payment("fd21542g87", "2546216bfcvgb", 123);
				break;
			case "dcard":
				paymentStatus = cTpMoVlD.payment("121 322 132 121", 123);
				break;
			case "ccard":
				paymentStatus = cTpMoVlD.payment(123, "121 322 132 121");
				break;
			default:
				System.out.println("Payment type invalid!");
				break;
		}
		
		if(paymentStatus) {
			System.out.println("Order success!!");
		}else {
			System.out.println("Order failed!");
		}
		
	}
	
	private boolean payment(String upiNumber, String upiId, int retry) {
		System.out.println("UPI Payment successfull!");
		return true;
	}
	
	private boolean payment(String cardNumber, int cvv) {
		System.out.println("Debit Card Payment successfull!");
		return true;
	}
	
	private boolean payment(int cvv, String cardNumber) {
		System.out.println("Credit Card Payment successfull!");
		return true;
	}
}
