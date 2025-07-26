package SelConnect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGdemo {

	WebDriver driver;
	
	@BeforeTest
	public void initDriver() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void hitMySite() {
		driver.get("https://savinshetty.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void hitGoogleSite() {
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void hitOHRMSite() {
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void hitMarketSite() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getCurrentUrl());
	}

	@AfterTest
	public void destroyDriver() {
		driver.quit();
	}
	
}
