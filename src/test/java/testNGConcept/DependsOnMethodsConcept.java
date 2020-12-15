package testNGConcept;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void loginTest() {
		System.out.println("login to the app");
		//int i = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageSearch() {
		System.out.println("home page search test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageUserInfo() {
		System.out.println("home page user info test");
	}
}
