package seleniumBasics_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlind_Window_Authentication_PopUp_21 {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Documents\\GitHub\\SeleniumAllFeatures_REPO\\Selenium_All_Features\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://UserName:Password@the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
	}
	


}
