package SelConnect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameForm {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		try {
			driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
			
			By mailBy = By.xpath("//label[contains(text(),'mail')]/following-sibling::input");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(mailBy));
//			ExpectedConditions.visibilityOfAllElementsLocatedBy(mailBy)
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			By frameImg = By.xpath("//img[contains(@src,'Examples.png')]");

			By frameBy = By.cssSelector("[id*=frame-one]");

			By propTilteBy = By.xpath("//label[text()='Proposal title ']/following-sibling::input");
			By porposedDateBy = By.xpath("//label[contains(text(),'Proposed')]/following-sibling::textarea");
			By descBy = By.xpath("//label[contains(text(),'Desc')]/following-sibling::textarea");
			By fileAttachBy = By.xpath("//input[@type='file']");
			By firstNameBy = By.xpath("//label[contains(text(),'First Name')]/following-sibling::input");
			By lastNameBy = By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input");
			By streetAddBy = By.xpath("//label[contains(text(),'Street')]/following-sibling::input");
			By cityBy = By.xpath("//label[contains(text(),'Street')]/following-sibling::input");
			By stateBy = By.xpath("//label[contains(text(),'State')]/following-sibling::select");
			By zipCodeBy = By.xpath("//label[contains(text(),'Zip')]/following-sibling::input");
			By numberBy = By.xpath("//label[contains(text(),'Number')]/following-sibling::input");
//			By mailBy = By.xpath("//label[contains(text(),'mail')]/following-sibling::input");

//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//			wait.until(ExpectedConditions.visibilityOf(doFindElement(mailBy)));
			
			doClick(frameImg);
			
			WebElement frameEle = driver.findElement(frameBy);
			
			driver.switchTo().frame(frameEle);

//			WebElement titleEle = driver.findElement(propTilteBy);
//			WebElement dateEle = driver.findElement(porposedDateBy);
//			WebElement descEle = driver.findElement(descBy);
//			WebElement fileEle = driver.findElement(fileAttachBy);
//			WebElement fNameEle = driver.findElement(firstNameBy);
//			WebElement lNameEle = driver.findElement(lastNameBy);
//			WebElement streetEle = driver.findElement(streetAddBy);
//			WebElement cityEle = driver.findElement(cityBy);
			WebElement stateEle = driver.findElement(stateBy);
//			WebElement zipEle = driver.findElement(zipCodeBy);
//			WebElement numberEle = driver.findElement(numberBy);
//			WebElement mailEle = driver.findElement(mailBy);
//
//			driver.findElement(frameImg).click();

			doSendKeys(propTilteBy, "Title text");

//			doSendKeys(porposedDateBy, "05/20/1997");

			doSendKeys(descBy, "test desc");

			doSendKeys(fileAttachBy, "/Users/savin/git/s-sn-s/QuickSel/src/main/java/SelConnect/myUploadTestFile.txt");
			
			doSendKeys(firstNameBy, "testName");
			
			doSendKeys(lastNameBy, "testLastName");
			
			doSendKeys(stateBy, "reti");
			
			doSendKeys(cityBy, "Dalas");
			
			Select select = new Select(stateEle);
			
			select.selectByVisibleText("Iowa");
			
			doSendKeys(zipCodeBy, "90192");

			doSendKeys(numberBy, "976854");
				
			doSendKeys(mailBy, "testMail@njds.com");
			
			driver.switchTo().defaultContent();

		} finally {
			driver.quit();
		}
	}

	public static void doClick(By by) {
		doFindElement(by).click();
	}

	public static void doSendKeys(By by, String keysToSend) {
		doFindElement(by).sendKeys(keysToSend);
	}

	public static WebElement doFindElement(By by) {
		return driver.findElement(by);
	}
}