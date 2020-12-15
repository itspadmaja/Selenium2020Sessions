package testNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGbasics {
	
	@BeforeSuite
	public void connectDB() {
		System.out.println("connect to the DataBase-----BS");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("create the user-----BT");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch the Browser------BC");
	}
	@BeforeMethod
	public void loginApp() {
		System.out.println("login to the App------BM");
	}
	@Test
	public void getUserInfoTest() {
		System.out.println("get the user info-----TC");
	}
	@Test
	public void checkUserisActive() {
		System.out.println("Check user is active -----TC");
	}
	@Test
	public void checkUserProfile() {
		System.out.println("check user profile----TC");
	}
	
	@AfterMethod
	public void logoutApp() {
		System.out.println("logout the app ------AM");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close the browser-----AC");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("delete the user--------AT");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnect to the DataBase");
	}
	

	
}
