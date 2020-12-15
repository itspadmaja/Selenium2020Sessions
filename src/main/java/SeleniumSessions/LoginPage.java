package SeleniumSessions;

public class LoginPage {

	public static void main(String[] args) {
		
		Browser_Util br = new Browser_Util();
		br.initiate_driver("Chrome");
		br.launchUrl("https://www.Google.com");
		br.getPagetitle();
		if(br.getPagetitle().equals("Google")) {
			System.out.println("This is Correct Title");
		}
		else {
			System.out.println("In_correct Title ");
		}
		br.closeBrowser();
	}

}
