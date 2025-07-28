package SelConnect;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.testng.Assert.assertThrows;

public class streamsPrac {

	public static void main(String[] params) {
		
		WebDriver driver = new ChromeDriver();
		try {
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		By formInputsBy = By.xpath("//form[contains(@action,'register')]//input");
//		
//		List<WebElement> formInputElement = driver.findElements(formInputsBy);
//		
//		formInputElement.stream().forEach(e->System.out.println(e.getDomAttribute("placeholder")));
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		By loginName = By.xpath("//input[@data-test='username']");
		By loginPass = By.xpath("//input[@data-test='password']");
		By loginNameCreds = By.xpath("//div[@id='login_credentials']");
		By loginPassCreds = By.xpath("//div[@class='login_password']");
		By loginBtn = By.cssSelector("input.btn_action");
		
		By priceBy = By.cssSelector("div.inventory_item_price"); 
		
		String[] userCredDivContent = driver.findElement(loginNameCreds).getText().split(":");
		String[] userPassDivContent = driver.findElement(loginPassCreds).getText().split(":");
		
		String[] userName = userCredDivContent[1].split("\n");
		String password = userPassDivContent[1].trim();
		
		driver.findElement(loginName).sendKeys(userName[1]);
		driver.findElement(with(loginPass).below(loginName)).sendKeys(password);

		driver.findElement(with(loginBtn).below(loginPass)).click();
		
		FluentWait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2));
		fluent.until(ExpectedConditions.urlContains("inventory"));
		
		Object[] Prices = driver.findElements(priceBy)
							.stream()
								.map(e->e.getText()
									.substring(1))
										.sorted(Comparator.reverseOrder())
											.toArray();
		
		for(Object o : Prices) {
			System.out.println(o);
		}
		
		}finally{
		driver.quit();
		}
	}
}