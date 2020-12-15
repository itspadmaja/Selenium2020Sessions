package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefrence {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement element = driver.findElement(By.id("Form_submitForm_subdomain"));
		element.sendKeys("radhika1rama@gmail.com");
		driver.navigate().refresh();
	    element = driver.findElement(By.id("Form_submitForm_subdomain"));
		element.sendKeys("radhika1rama@gmail.com");
		// StaleElementReferenceException: stale element reference: element is not attached to the page document
		//if you refresh the page, you must create WebElement again, otherwise stale element ref exception will be thrown, stale means rotten /not fresh/element depricated
		//it wont work even page back & forward, page loading because new version of DOM = Document Object Model (Html source code )is created....id got staled and DOM version got updated, so we r getting stale elemnt ref exception
	}

}
