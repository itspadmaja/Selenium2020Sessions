package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitForAlertConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10); Alert alert =
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * System.out.println(alert.getText()); alert.accept();
		 */
		Alert alert = waitForAlert(10) ;
		System.out.println(alert.getText()); alert.accept();
	}
	public static Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

}
