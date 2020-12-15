package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Padmaja Prasad\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

	}

}
