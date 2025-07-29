package SelConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class eleInteractionPrac {

	static WebDriver driver = null;

	public static void main(String[] param) {

		try {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);

		driver.get("https://selectorshub.com/xpath-practice-page/");
	
		String carSelected = doSelect("Audi");
		System.out.println(carSelected);
		
		carSelected = doSelect("Opel");
		System.out.println(carSelected);
		
		carSelected = doSelect("Saab");
		System.out.println(carSelected);
		}finally {
			driver.quit();
		}
	}

	public static String doSelect(String selectOption) {
		System.out.println("=======================");
		By selectBy = By.xpath("//select[@id='cars']");

		WebElement selectEle = driver.findElement(selectBy);

		Select s = new Select(selectEle);
		s.getOptions().stream().forEach(e -> System.out.println(e.getText()));
		s.selectByVisibleText(selectOption);
		System.out.println("=======================");
//		System.out.println(s.getFirstSelectedOption());
		return s.getFirstSelectedOption().getText();
	}
}
