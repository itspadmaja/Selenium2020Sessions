package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDrownWithoutSelectClass {
      static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//By industry = By.id("Form_submitForm_Industry");
		//By country = By.id("Form_submitForm_Country");
		
		By IndustryOption = (By.xpath("//select[@id='Form_submitForm_Industry']/option"));
		
		doDropDownWithoutSelectClass(IndustryOption,"Aerospace");
	}
	
	public static void doDropDownWithoutSelectClass(By locator,String value) {
		List<WebElement>optionsList = driver.findElements( locator);
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	}


