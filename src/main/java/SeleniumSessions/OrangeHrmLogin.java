package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		
		Browser_Util br =new Browser_Util();
		WebDriver driver = br.initiate_driver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By username = By.id("Form_submitForm_subdomain");
		By lastname = By.id("Form_submitForm_LastName");
		By firstname = By.id("Form_submitForm_FirstName");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By email = By.id("Form_submitForm_Email");
		By company = By.id("Form_submitForm_CompanyName");
		By contact_num = By.id("Form_submitForm_Contact");
		
		Element_util ele_util = new Element_util(driver);
		ele_util.doSendKeys(username, "tester@123");
		ele_util.doSendKeys(lastname, "Rama");
		ele_util.doSendKeys(firstname, "Radhika");
		ele_util.doSendKeys(jobTitle, "Automation Engineer");
		ele_util.doSendKeys(email, "Radhika1rama@gmail.com");
		ele_util.doSendKeys(company, "Applause");
		ele_util.doSendKeys(contact_num, "704-512-1116");
		
		br.closeBrowser();
	}

}
