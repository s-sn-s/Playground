package javaSes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class revStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		revStr rs = new revStr();
//		System.out.println(rs.revMyString("ItIsMe!!"));
//		System.out.println(rs.revStrWithoutCounter("ABC"));
//		System.out.println(rs.revIt("SAVIN"));
		System.out.println(rs.revMeUp("SAVIN"));
	}

	private String revMyString(String myStr) {
		
		char[] strAry = myStr.toCharArray();
		char[] revStrAry = new char[myStr.length()];
		int counter = 0;
		for(int i = myStr.length(); i>0 ;i--) {
			revStrAry[counter]=strAry[i-1];
			counter++;
		}
		
		String myRevStr=new String(revStrAry);
		return myRevStr;
	}
	
	private String revStrWithoutCounter(String OGstr) {
		
		int right = OGstr.length()-1;
		int left = 0;
		char[] revStrChr = OGstr.toCharArray();		
		
		while(left<right) {
			char temp = revStrChr[left];
			revStrChr[left]=revStrChr[right];
			revStrChr[right]=temp;
			left++;
			right--;
		}
		
		return new String(revStrChr);
	}
	
	private String revIt(String ogStr) {
		char[] chrAr = ogStr.toCharArray();
		int strLen = ogStr.length();
		char[] rvChrAr =  new char[strLen];
		int counter = 0;
		for(int i = strLen-1; i >= 0 ; i--) {
			rvChrAr[counter] = chrAr[i];
			counter++;
		}
		String rvStr = new String(rvChrAr);
		return rvStr;
	}
	
	private String revMeUp(String ogSTR) {
		int strSize = ogSTR.length();
		int counter = 0;
		char[] ogChrAry = ogSTR.toCharArray();
		char[] rvChrAry = new char[strSize];
		
		for(int i = strSize-1; i>=0;i--) {
			rvChrAry[counter]=ogChrAry[i];
			counter++;
		}
		
		String rvSTR = new String(rvChrAry);
		
		return rvSTR;
	}
}
