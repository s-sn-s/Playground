package javaSes;

import java.util.Arrays;

public class revStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		revStr rs = new revStr();
		String rrs = rs.revMyString("ItIsMe!!");
		System.out.println(rrs);
	}

	private String revMyString(String myStr) {
		
//		System.out.println(myStr.length());
		char[] strAry = myStr.toCharArray();
		char[] revStrAry = new char[myStr.length()];
		int counter = 0;
		for(int i = myStr.length(); i>0 ;i--) {
//			System.out.print(i + " ");
//			System.out.print(strAry[i-1]);
			revStrAry[counter]=strAry[i-1];
//			System.out.println(revStrAry[counter]);
			counter++;
		}
		
		String myRevStr=new String(revStrAry);
		return myRevStr;
	}
	
}
