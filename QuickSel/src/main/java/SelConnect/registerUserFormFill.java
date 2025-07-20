package SelConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerUserFormFill {

	static WebDriver driver;

	public static void main(String[] params) {

		By by_firstName = By.id("input-firstname");
		By by_lastName = By.id("input-lastname");
		By by_email = By.id("input-email");
		By by_telephone = By.id("input-telephone");
		By by_password = By.id("input-password");
		By by_confirmPassword = By.id("input-confirm");
		By by_privacyPolicyCheck = By.name("agree");
		By by_submit = By.xpath("//input[@type='submit']");

		try {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

			elementUtil exe = new elementUtil(driver);

			exe.doSendKeys(by_firstName, "savin");
			exe.doSendKeys(by_lastName, "shetty");
			exe.doSendKeys(by_email, "testMail@mail.com");
			exe.doSendKeys(by_telephone, "1231231234");
			exe.doSendKeys(by_password, "9876543210");
			exe.doSendKeys(by_confirmPassword, "9876543210");
			exe.doClick(by_privacyPolicyCheck);
			exe.sleepFor(5000);
//		exe.doClick(by_submit);
		} finally {
			if (driver != null) {
				driver.quit();
			}
		}

	}
}
