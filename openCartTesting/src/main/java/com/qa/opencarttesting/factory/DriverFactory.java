package com.qa.opencarttesting.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencarttesting.excpetion.BrowserInitException;

public class DriverFactory {

	WebDriver driver;
	Properties prop;
	OptionsManager Omanager;
	private static final Logger log = LogManager.getLogger (DriverFactory.class);
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

	public WebDriver initDriver(Properties prop) {
		Omanager = new OptionsManager(prop);
		String browser = prop.getProperty("browser");
		
		log.info("Select browser : " + browser);
		
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
			log.error("Wrong browser is passed : " + browser);
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
	
	public static String getScreenshotPath() {
		File srcFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE); 
		String path = System.getProperty("User.dir") + "/screenshot/" + "_" + System.currentTimeMillis() + ".png";
		File desFile = new File(path);
		try {
			FileHandler.copy(srcFile, desFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	public static File getScreenshotFile() {
		File srcFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE); 
		return srcFile;
	}
	
}