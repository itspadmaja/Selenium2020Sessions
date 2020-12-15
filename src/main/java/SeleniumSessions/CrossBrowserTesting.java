package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	 static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "Chrome";
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver()	;
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Pls Pass the correct browser"+browser);
		}
		
		driver.get("http://www.google.com"); String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		  
		System.out.println(driver.getCurrentUrl());
		  
		driver.quit();
		 
		
	}

}
