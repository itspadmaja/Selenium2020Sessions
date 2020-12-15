package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		/*1st
		 * 
		 * driver.findElement(By.id("username")).sendKeys("test123@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("test123");
		 * driver.findElement(By.id("loginBtn")).click();
		 */
		/*2nd
		 * 
		 * WebElement email = driver.findElement(By.id("username")); WebElement pwd =
		 * driver.findElement(By.id("password")); WebElement login =
		 * driver.findElement(By.id("loginBtn")); email.sendKeys("test123@gmail.com");
		 * pwd.sendKeys("test123"); login.click();
		 */
		//By Locators---3rd
		
	   /* By email_id =	By.id("username");
		By pwd_id = By.id("password");
		By login_id = By.id("loginBtn");
		*/
		/*WebElement email = driver.findElement(email_id);
		WebElement pwd = driver.findElement(pwd_id);
		WebElement login = driver.findElement(login_id);
		
		email.sendKeys("test123@gmail.com");
		pwd.sendKeys("test123");
		login.click();*/
		
		/*4th
		
		getElement(email_id).sendKeys("test123@gmail.com");
		getElement(pwd_id).sendKeys("test123");
		getElement(login_id).click();
		
		5th
		
		doSendKeys(email_id, "test123@gmail.com");
		doSendKeys(pwd_id,"test123");
		
		doClick(login_id);*/
		
		//6th
		
		String emailid = "username";
		String pwdid = "password";
		String loginid = "loginBtn";
		
		doSendKeys(getLocator(emailid),"test123@gmail.com");
		doSendKeys(getLocator(pwdid), "test123");
		doClick(getLocator(loginid));


		
		
	}
	public static By getLocator(String value) {
		return By.id(value);
	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
