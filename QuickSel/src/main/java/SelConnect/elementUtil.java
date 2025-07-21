package SelConnect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementUtil {

	private WebDriver driver;

	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By eleBy, String text) {
		searchElement(eleBy).sendKeys(text);
	}

	public WebElement searchElement(By ele) {
		return driver.findElement(ele);
	}

	public void doClick(By eleBy) {
		searchElement(eleBy).click();
		;
	}

	public void sleepFor(int sec) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int numberOfElementsDisplayedFromList(List<WebElement> list) {
		if(list.size()==0) {
			throw new RuntimeException("Empty list!");
		}
		
		int displayCount = 0;
		
		for(WebElement ele : list) {
			if(ele.isDisplayed()) {
				displayCount++;
			}
		}
		
		return displayCount;
	}

}
