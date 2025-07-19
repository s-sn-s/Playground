package SelConnect;

import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverBasics{
	
	public static void main(String[] param) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://savinshetty.com/rps.html");
		System.out.println(driver.getTitle());
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		driver.quit();
		
	}
	
}