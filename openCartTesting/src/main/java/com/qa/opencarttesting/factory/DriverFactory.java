package com.qa.opencarttesting.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencarttesting.excpetion.BrowserInitException;

public class DriverFactory {

	WebDriver driver;
	Properties prop;
	OptionsManager Omanager;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initDriver(Properties prop) {
		Omanager = new OptionsManager(prop);
		String browser = prop.getProperty("browser"); 
		switch(browser.trim().toLowerCase()) {
		case "chrome":
			tldriver.set(new ChromeDriver(Omanager.getChromeOption()));
			break;
		case "edge":
			tldriver.set(new EdgeDriver(Omanager.getEdgeOption()));
			break;
		case "firefox":
			tldriver.set(new FirefoxDriver(Omanager.getFireOption()));
			break;
		case "safari":
			tldriver.set(new SafariDriver());
			break;
		default:
			throw new BrowserInitException("Wrong browser value passed : " + browser);
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	
	public Properties getProp() {
		try {
		FileInputStream filestream = new FileInputStream("./src/test/resources/config/config.properties");
		prop = new Properties();
		prop.load(filestream);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
}
