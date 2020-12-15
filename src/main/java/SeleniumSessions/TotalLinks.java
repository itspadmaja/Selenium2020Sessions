package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		//get total number of links
		//get the text of each element and ignore the blank text
		/*
		 * List<WebElement> linklist = driver.findElements(By.tagName("a"));
		 * System.out.println("The total number of links is: "+linklist.size());
		 * 
		 * for(int i=0;i<linklist.size();i++) { String text = linklist.get(i).getText();
		 * 
		 * if(!text.isEmpty()) {
		 * 
		 * System.out.println(i+"---->"+text); }
		 * 
		 * }
		 */
		 String h2_text = driver.findElement(By.tagName("h2")).getText();
		 System.out.println(h2_text);
		 
		 
		 
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doGetText(By locator) {
		getElement(locator).getText();
		
	}
}


