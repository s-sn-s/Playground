package SelConnect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
	
	public static void main(String[] args) throws InterruptedException{
		
		String siteName = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		System.out.println("session initialized!");
		
		d.get(siteName);
		
		System.out.println(d.getTitle());
//		d.wait(5000);
		
		d.quit();
		
	}
	
}