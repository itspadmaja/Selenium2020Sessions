package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserSwitchCase {
	static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "Edge";
		switch (browser) {
		
		  case "Chrome":
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padmaja Prasad\\Downloads\\chromedriver.exe"); 
		  driver = new
		  ChromeDriver();
		 
		  break;
		 
		case "Edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Padmaja Prasad\\Downloads\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
			break;
				

		default:
			System.out.println("Please pass the correct browswer"+browser);
			break;
		}
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
