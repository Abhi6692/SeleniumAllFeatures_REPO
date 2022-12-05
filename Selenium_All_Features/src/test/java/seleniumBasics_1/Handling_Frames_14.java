package seleniumBasics_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames_14 {

	public static void main(String[] args) {


		
		
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		//Open any Url (Two Ways)
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

		//To get the total number of iframes present in the page
		int iFrameCount = driver.findElements(By.tagName("iframe")).size();

		System.out.println("The total number of iFrame Present: " + iFrameCount);

		//There are three ways to switch to iFrames
		driver.switchTo().frame("By Index"); //1st Way
		driver.switchTo().frame("By Name or ID"); //2nd Way
		driver.switchTo().frame("WebElement"); //3rd Way


		// How to switch back to the Main Frame

		//This will pass the control to the imminent parent frame of the current frame
		driver.switchTo().parentFrame();  //1st Way

		//This will pass the control to the main document which contains the iframes
		driver.switchTo().defaultContent(); //2nd Way









	}

}
