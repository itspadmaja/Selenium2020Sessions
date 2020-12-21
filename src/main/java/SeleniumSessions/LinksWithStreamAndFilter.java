package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksWithStreamAndFilter {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By industry_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");

		By links = By.tagName("a");
		List<WebElement> Linklist = driver.findElements(links);
		System.out.println(Linklist.size());

//		List<String> collectList = Linklist
//				.stream()
//				.filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon")).map(ele -> ele.getText())
//				.collect(Collectors.toList());

		
		
		  List<String> collectList = Linklist 
		  .stream()
		  .filter(ele->!ele.getText().isEmpty())
		  .filter(ele->ele.getText().startsWith("")) .map(ele->ele.getText().trim())
		  .collect(Collectors.toList());
		 
		 

		// collectList.stream().forEach(ele->System.out.println(ele));
		collectList.parallelStream().forEach(ele -> System.out.println(ele));

	}

}
