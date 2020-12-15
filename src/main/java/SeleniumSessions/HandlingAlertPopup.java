package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("Incorrect text");
		}
		alert.accept();
		//alert.dismiss();
		driver.switchTo().defaultContent();

	}

}
