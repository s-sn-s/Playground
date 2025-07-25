package myTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestngTest {

	protected WebDriver driver;
	
	@BeforeTest
	public void initTest() {
		driver = new ChromeDriver();
		driver.get("https://savinshetty.com/rps.html");
	}
	
	@Test
	public void getSite() {
		String myTitle = driver.getTitle();
		boolean bool = myTitle.toLowerCase().contains("play");
		Assert.assertEquals(bool, true);
	}
	
	@Test
	public void aE() {
		System.out.println(9/0);
	}
	
	@AfterTest
	public void breakDownTest() {
		driver.quit();
	}
}
