package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppHubSpotLogin {

	public static void main(String[] args) throws InterruptedException {
		
		Browser_Util br = new Browser_Util();
		WebDriver driver = br.initiate_driver("Chrome");
		br.launchUrl("https://app.hubspot.com/");
		Thread.sleep(6000);
		
		By email = By.id("username");
		By pwd = By.id("password");
		By loginbutton = By.id("loginBtn");
		
		Element_util eleUtil = new Element_util(driver);
		eleUtil.doSendKeys(email, "test123@gmail.com");
		eleUtil.doSendKeys(pwd, "test@123");
		eleUtil.doClick(loginbutton);
		
		br.quitBrowser();;
		

	}

}
