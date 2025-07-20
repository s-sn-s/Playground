package SelConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementConcept {

	public static void main(String[] params) {
		WebDriver driver=null;
		try {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email_input_by = By.id("input-email");
		By password_input_by = By.id("input-password");
		
		WebElement email_input = driver.findElement(email_input_by);
		WebElement password_input = driver.findElement(password_input_by);
		
		email_input.sendKeys("test");
		password_input.sendKeys("test");
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
		driver.quit();
		}
	}
}