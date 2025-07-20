package SelConnect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateConcept {

	public static void main(String[] params) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://savinshetty.com/rps.html");
		System.out.println(driver.getTitle());
		
		driver.get("https://savinshetty.com");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	
}
