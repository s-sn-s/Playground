package SelConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class pracRelativeSelector {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");

			
			try {
//			doClickCheckBox("John Smith");
//				Thread.sleep(1000);
			doClickCheckBox("Joe Root");
				Thread.sleep(1000);
			doClickCheckBox("Joe Root");
				Thread.sleep(1000);
			doClickCheckBox("Joe Root");
				Thread.sleep(1000);	
			doClickCheckBox("Joe Root");
			}catch(InterruptedException e) {
				throw new RuntimeException("Insomniac");
			}
		} 
		catch(NoSuchElementException e) {
			throw new RuntimeException("Did you pass rigth emp name?");
		}
		finally {
			driver.quit();
		}

	}
	
	public static void doClickCheckBox(String name) throws NoSuchElementException{
		By empNameAdmin = By.xpath("//td[text()='" + name + "']");
		By empNameAdminCheckBox = By.xpath("//input[@type='checkbox']");
		
		WebElement empCheckBox = driver.findElement(with(empNameAdminCheckBox).toLeftOf(empNameAdmin));
		
		FluentWait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2));
		fluent.until(ExpectedConditions.elementToBeClickable(empCheckBox));
		empCheckBox.click();
	}

}
