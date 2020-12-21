package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkswithStream {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By industry_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		By links = By.tagName("a");
		List<WebElement> industry_List = driver.findElements(industry_options);
		
		long startTime = System.currentTimeMillis();
		
		//industry_List.stream().forEach(ele->System.out.println(ele.getText()));
		industry_List.parallelStream().forEach(ele->System.out.println(ele.getText()));

		long endTime = System.currentTimeMillis();
		
		System.out.println(startTime - endTime);
		

	}

}
