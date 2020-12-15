package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		
		By email_id = By.id("username");
		By signupLink = By.linkText("Sign up");
		
		 waitForElementToBeLocated(email_id, 10).sendKeys("test@gmail.com");
		 waitForElementToBeLocated(signupLink, 10).click();
		 
		 
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement ele =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(email_id));
		 * ele.sendKeys("test@gmail.com");
		 */
	}
	
	public static WebElement waitForElementToBeLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
