package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksWithStreamFooterLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		//ul.footer-nav li a
		 driver.findElements(By.cssSelector("ul.footer-nav li a"))
		.stream()
		.filter(ele->!ele.getText().isEmpty())
		.forEach(ele->System.out.println(ele.getText()));
	}

}
