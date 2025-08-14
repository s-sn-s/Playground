package com.qa.opencarttesting.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {

	Properties prop;

	public OptionsManager(Properties prop) {
		this.prop = prop;
	}

	public ChromeOptions getChromeOption() {
		ChromeOptions options = new ChromeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless"))){
			System.out.println("Chrome opened in headless mode");
			options.addArguments("--headless");
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			System.out.println("Chrome opened in incognito mode");
			options.addArguments("--incognito");
		}
		return options;
	}

	public EdgeOptions getEdgeOption() {
		EdgeOptions options = new EdgeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless"))){
			options.addArguments("--headless");
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			options.addArguments("--inPrivate");
		}
		return options;
	}

	public FirefoxOptions getFireOption() {
		FirefoxOptions options = new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless"))){
			System.out.println("Firefox opened in headless mode");
			options.addArguments("--headless");
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			System.out.println("Firefox opened in incognito mode");
			options.addArguments("--incognito");
		}
		return options;
	}

}
