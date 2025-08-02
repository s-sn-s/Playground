package com.qa.testCycle.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.qa.testCycle.exception.frameworkException;

public class driverFactory {

	WebDriver driver;
	
	public WebDriver initDriver(String browser) {
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;	
		default:
			throw new frameworkException("Invalid browser passed :" + browser);	
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
	}
}
