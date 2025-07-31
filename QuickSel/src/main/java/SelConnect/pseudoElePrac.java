package SelConnect;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pseudoElePrac {

	private static WebDriver driver;

	public static void main(String[] params) {
		try {
			ChromeOptions opts = new ChromeOptions();
			opts.addArguments("--incognito");
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			String fieldName = "lastnam";
			boolean isPseudoStar = isInputRequired(fieldName);
			System.out.println("Is " + fieldName + " required field? : " + isPseudoStar);
		} finally {
			driver.quit();
		}
	}

	public static boolean isInputRequired(String fieldName) {

		String selectorName;

		switch (fieldName.trim().toLowerCase()) {
		case "first name":
		case "firstname":
			selectorName = "firstname";
			break;
		case "last name":
		case "lastname":
			selectorName = "lastname";
			break;
		case "email":
		case "e-mail":
			selectorName = "email";
			break;
		case "telephone":
		case "phone":
			selectorName = "telephone";
			break;
		case "password":
		case "pass":
			selectorName = "password";
			break;
		case "confirm password":
		case "confirm":
		case "confirm-password":
			selectorName = "confirm";
			break;
		default:
			throw new RuntimeException("Invalid input name passed! : " + fieldName);
		}

		JavascriptExecutor execute = (JavascriptExecutor) driver;
		String myPseudoStar = execute
				.executeScript("return window.getComputedStyle(document.querySelector(`label[for='input-" + selectorName
						+ "']`),'::before').getPropertyValue('content')")
				.toString();

		boolean isPseudoStar = myPseudoStar.contains("*") ? true : false;

		return isPseudoStar;
	}
}