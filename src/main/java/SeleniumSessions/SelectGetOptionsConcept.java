package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectGetOptionsConcept {
      static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		List<String>industry_List = doSelectDropDownByOptions(industry);
		System.out.println(industry_List.size());
		System.out.println(industry_List);
		
		List<String>country_List = doSelectDropDownByOptions(country);
		System.out.println(country_List.size());
		System.out.println(country_List);
		
		/*
		 * Select industry_select = new Select(driver.findElement(industry));
		 * List<WebElement>industryList = industry_select.getOptions();
		 * System.out.println(industryList.size());
		 * 
		 * for(WebElement e: industryList) { String text = e.getText();
		 * System.out.println(text); }
		 */
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	
}
	public static List<String> doSelectDropDownByOptions(By locator) {
		
		List<String>OptionValueList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement>optionsList = select.getOptions();
		
		for(WebElement e : optionsList) {
			OptionValueList.add(e.getText());
			
			
		}
		return OptionValueList;
	}
}
