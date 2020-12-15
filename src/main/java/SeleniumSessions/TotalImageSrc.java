package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageSrc {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		List<WebElement> imgcount = driver.findElements(By.tagName("img"));
		System.out.println("The total number of images is: "+ imgcount.size());
		for(WebElement e : imgcount) {
			String src = e.getAttribute("src");
			System.out.println(src);
		}
		

	}
	public static int getElementCount(String tagName) {
	return driver.findElements(By.tagName(tagName)).size();
	}
	public static List<String> getAttributeList(String tagName,String attributeName) {
		
		List<String>attrList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(By.tagName(tagName));
		for(WebElement e : eleList) {
			String text = e.getAttribute(attributeName);
			attrList.add(text);
		}
		return attrList;
	}
	

}
