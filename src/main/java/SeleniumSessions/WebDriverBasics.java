package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padmaja Prasad\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		
		//checkpoint/verification point
		
		if(title.equals("Google")) {
			System.out.println("This is correct title");
			
		}
		else {
			System.out.println("In correct title");
		}
		//get the current url
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("Google")) {
		System.out.println("This is correct url");	
		}
		//get page source
		//System.out.println(driver.getPageSource());
		driver.quit();//close the browser
		//driver.close();
	}

}
