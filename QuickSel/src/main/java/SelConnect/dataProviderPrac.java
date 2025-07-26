package SelConnect;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderPrac {

	@DataProvider
	public Object[][] supplyNumber(){
		return new Object[][] {
			{1,2},
			{2,3},
			{3,4}
		};
	}
	
	@Test(dataProvider = "supplyNumber")
	public void sumOfSqr(int a, int b) {
		System.out.println((a*a)+(b*b) + " is sum of square of "+  a +" & "+ b);
	}
}
