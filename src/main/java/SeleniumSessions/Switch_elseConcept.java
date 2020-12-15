package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_elseConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "Edge";
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		default:
			break;
			
			
		}
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
