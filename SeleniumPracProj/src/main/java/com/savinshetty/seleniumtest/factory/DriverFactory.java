package com.savinshetty.seleniumtest.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.savinshetty.seleniumtest.exception.MyRunTimeException;

public class DriverFactory {
	
	WebDriver driver;
	
	public WebDriver initDriver(String browser) {
		
		switch(browser.toLowerCase().trim()){
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				throw new MyRunTimeException("Please pass right browser");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
	}
}