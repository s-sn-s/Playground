package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestngTest {

	protected WebDriver driver;
	
	@Test
	public void getSite() {
		driver = new ChromeDriver();
		driver.get("https://savinshetty.com");
		driver.quit();
	}
	
	@Test
	public void aE() {
		System.out.println(9/0);
	}
	
}
