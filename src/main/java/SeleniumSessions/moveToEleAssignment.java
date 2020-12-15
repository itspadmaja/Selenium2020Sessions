package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveToEleAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		By signup = By.id("ctl00_HyperLinkLogin");
		By submenu1 = By.linkText("SpiceClub Members");
		By submenu2 = By.linkText("Member Login");
		
		
		WebElement login = getElement(signup);
		Thread.sleep(6000);
		doMoveToElement(login);
		WebElement menu1 = getElement(submenu1);
		Thread.sleep(6000);
		doMoveToElement(menu1);
		getElement(submenu2).click();
		
		
		
		/*
		 * Actions act = new Actions(driver);
		 * act.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().
		 * perform(); Thread.sleep(6000);
		 * act.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build
		 * ().perform(); Thread.sleep(6000);
		 * driver.findElement(By.linkText("Member Login")).click();
		 */
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doMoveToElement(WebElement locator) {
		Actions act = new Actions(driver);
		act.moveToElement(locator).build().perform();
		
		
	}

}
