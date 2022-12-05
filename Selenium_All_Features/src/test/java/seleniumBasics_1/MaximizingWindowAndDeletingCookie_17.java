package seleniumBasics_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingWindowAndDeletingCookie_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//This is an important validation to check the session cookie. Once deleted, if the user clicks
		//on any link/button/refresh, the user should be logged out/
		//Login Page and verify the login url
		driver.manage().deleteCookieNamed("sessionkey");
		
		
	}

}
