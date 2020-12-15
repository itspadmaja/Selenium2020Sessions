package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Util {
	
	WebDriver driver;
	/**
	 * 
	 * @param browserName
	 * @return driver
	 */
	public WebDriver initiate_driver(String browserName) {
		
				if(browserName.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
				else if(browserName.equals("Edge"))
				 {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
				else {
					System.out.println("Please pass the correct browser name : "+browserName);
				}
				return driver;
	}
	/**
	 * this method launch url by get method
	 * @param url
	 */
	public void launchUrl(String url) {
		System.out.println("url = "+url);
		driver.get(url);
	}
	/**
	 * this launch url by navigate to method
	 * @param url
	 */
	public void navigateUrl(String url) {
		System.out.println("url = "+ url);
		driver.navigate().to(url);
		
	}
	/**
	 * this method
	 * @return page title
	 */
	public String getPagetitle() {
		String title =driver.getTitle();
		System.out.println("The page title is: "+title);
		return title;
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}

}
