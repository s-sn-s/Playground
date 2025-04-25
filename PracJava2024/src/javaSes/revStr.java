package javaSes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class revStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverseMe = "1 2 3 4 5 6 7 8 9";
		String breaker = "----------------------";
		
		revStr rs = new revStr();

//		System.out.println(breaker);
//		System.out.println(rs.revMyString(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revrev(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revStrWithoutCounter(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revIt(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revMeUp(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revrev(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revEnFor(reverseMe));
//		
//		System.out.println(breaker);
//		System.out.println(rs.revOnlyStr(reverseMe));
//		
		System.out.println(breaker);
		System.out.println(rs.revMeWithStr(reverseMe));
		
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

	private String revrev(String ogS) {
		
		char[] ogChAr =  ogS.toCharArray();
		int originalStringLength = ogS.length();
		char[] rvChAr= new char[originalStringLength];
		int counter = 0; 
		
		for(int i=originalStringLength-1;i>=0;i--) {
//			System.out.print(counter + " ");
//			System.out.print(i+ " ");
//			System.out.print(ogChAr[i]+ " ");
			rvChAr[counter]=ogChAr[i];
//			System.out.print(rvChAr[counter]);
//			System.out.println();
			counter++;
		}
		
		String rvS = new String(rvChAr); 
		
		return rvS;
	} 
	
	private String revEnFor(String ogS) {
		
		char[] ogChAr =  ogS.toCharArray();
		int originalStringLength = ogS.length();
		char[] rvChAr= new char[originalStringLength];
		
		for(char c : ogChAr) {
			rvChAr[--originalStringLength] = c;
		}
		
		String rvS = new String(rvChAr); 
		
		return rvS;
	} 
	
	private String revOnlyStr(String ogS) {
		
		int slength = ogS.length();
		String rvS = "";
		
		for(int i = slength-1; i >= 0;--i) {
			rvS = rvS + ogS.charAt(i);
		}
				
		return rvS;
	}
	
	private String revMeWithStr(String ogS) {
		
		int sLength = ogS.length();
		String rvS = "";
		for(int i = sLength-1; i>=0; i--) {
			rvS = rvS + ogS.charAt(i);
		}
		return rvS;
	}
	
	private String revRevMe(String ogS) {
		
		String revStr = "";
		
		for(int i = ogS.length()-1; i<=0; i--) {
			revStr = revStr + ogS.charAt(i);
		}
		
		return revStr;
	}
	
	private String revMyStr(String ogStr) {
		
		if(ogStr == "") {
			return "Please pass atleast one string";
		}
		
		if(ogStr.length()==1) {
			return ogStr;
		}
		
		String rvStr = "";
		
		for(int i = ogStr.length()-1;i>=0;i--) {
			rvStr = rvStr + ogStr.charAt(i);
		}
		
		return rvStr;
	}
}