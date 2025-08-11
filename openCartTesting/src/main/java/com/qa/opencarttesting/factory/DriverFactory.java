package com.qa.opencarttesting.factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.opencarttesting.excpetion.BrowserInitException;

public class DriverFactory {

	WebDriver driver;
	Properties prop;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initDriver(String browser) {
		
		switch(browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new ChromeDriver();
			break;
		case "safari":
			driver = new ChromeDriver();
			break;
		default:
			throw new BrowserInitException("Wrong browser value passed : " + browser);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
	}
	
}
