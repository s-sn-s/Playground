package SelConnect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownWithoutSelectMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		elementUtil exe = new elementUtil(driver);
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By selectDrop = By.cssSelector("select#Form_getForm_Country");
		
		WebElement selectDropElement = driver.findElement(selectDrop); 
		
		Select select = new Select(selectDropElement);
		
		List<WebElement> countryOptions = select.getOptions();
		
		for(WebElement country : countryOptions) {
			if(country.getText().trim().toLowerCase().equalsIgnoreCase("india")) {
				country.click();
			}
		}
		
//		select.isMultiple();
		
		select.deselectAll();
		
		exe.sleepFor(5000);
		
		driver.quit();
		
	}
	
	public static void doSelectBasedOnElement() {
		
	} 
	
}
