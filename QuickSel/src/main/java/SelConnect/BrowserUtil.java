package SelConnect;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

	public static void main(String[] args) {
	
		WebDriver d = new ChromeDriver();
	
		d.get("https://savinshetty.com");
		d.get("https://google.com");
		d.get("https://savinshetty.com");
		d.get("https://google.com");
		d.get("https://savinshetty.com");
		
		
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		d.quit();
	
	}
}