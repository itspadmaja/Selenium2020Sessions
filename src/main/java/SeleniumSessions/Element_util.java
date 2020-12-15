package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Element_util {
	
	WebDriver driver;
	
	public Element_util(WebDriver driver) {
		this.driver = driver;
	}
	public By getLocator(String value) {
		return By.id(value);
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		getElement(locator).click();
	}
	public  void doSelectVisibleTextDropDown(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	
	}
	public  void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);;

}
	public  void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);;
}
public  List<String> doSelectDropDownByOptions(By locator) {
		
		List<String>OptionValueList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement>optionsList = select.getOptions();
		
		for(WebElement e : optionsList) {
			OptionValueList.add(e.getText());
			
			
		}
		return OptionValueList;

}
public  void  doDropDownWithoutSelectClass(By locator,String value) {
	List<WebElement>optionsList = getElements(locator);
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
public List<WebElement> getElements(By locator) {
	
	return driver.findElements(locator);
}
}
