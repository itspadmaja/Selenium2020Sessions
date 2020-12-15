package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//fileupload method, type = "file" should be there
		WebElement choosefile = driver.findElement(By.name("upfile"));
		choosefile.sendKeys("C:\\Users\\Padmaja Prasad\\Documents\\Utest Test Case\\testCycle.Xlsx");
	}

}
