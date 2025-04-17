package SelConnect;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultiWInHand {

	WebDriver driver;	
	public MultiWInHand(WebDriver driver) {
		this.driver = driver;
	}

	public String[] getUrlTitles(String parentTab, int noOfUrl, String... urls) {

		if (noOfUrl==0|| urls==null) {
			new RuntimeException("===========Invalid argument passed=======");
			return null;
		}else{

			String[] pageTitles = new String[noOfUrl+1];

			for(String s : urls) {
				driver.switchTo().newWindow(WindowType.TAB).get(s);
			}

			Set<String> allWInHandels = driver.getWindowHandles();

			Iterator<String> winHandIterator = allWInHandels.iterator();

			int counter = 0;

			while(winHandIterator.hasNext()) {
				System.out.println("Session id of window " + (counter+1) + " : " + ((RemoteWebDriver)driver).getSessionId());
				String toWinHand = winHandIterator.next();
				driver.switchTo().window(toWinHand);
				pageTitles[counter]=driver.getTitle();
				if(!parentTab.equals(driver.getWindowHandle())){
					System.out.println("Closing : " + pageTitles[counter]);
					System.out.println("Window handle : " + driver.getWindowHandle());
					driver.close();
				}
				counter++;
			}
			driver.switchTo().window(parentTab);
			return pageTitles;
		}
	} 
}
