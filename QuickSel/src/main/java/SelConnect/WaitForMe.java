package SelConnect;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitForMe {

//	private WebDriver driver;
//	
//	public WaitForMe(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public static void setSysWait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
}
