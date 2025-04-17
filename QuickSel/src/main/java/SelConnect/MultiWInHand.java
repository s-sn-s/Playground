package SelConnect;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultiWInHand {

	WebDriver driver;	
	public MultiWInHand(WebDriver driver) {
		this.driver = driver;
	}
	
	public String[] getUrlTitles(int noOfUrl, String... urls) {
		
		if (noOfUrl==0|| urls==null) {
			new RuntimeException("===========Invalid argument passed=======");
			return null;
		}else{
		
			String[] pageTitles = new String[noOfUrl];
			String parentWinHand = driver.getWindowHandle();
			
			for(String s : urls) {
				driver.get(s);
			}
			
			Set<String> allWInHandels = driver.getWindowHandles();
			
			Iterator<String> winHandIterator = allWInHandels.iterator();
			
			int counter = 0;
			
			while(winHandIterator.hasNext()) {
				System.out.println("Session id of window " + counter + " : " + ((RemoteWebDriver)driver).getSessionId());
				String toWinHand = winHandIterator.next();
				driver.switchTo().window(toWinHand);
				pageTitles[counter]=driver.getTitle();
				counter++;
				if(parentWinHand!=driver.getWindowHandle()){
					driver.close();
				}
			}
			driver.switchTo().window(parentWinHand);
			return pageTitles;
		}
	} 
}
