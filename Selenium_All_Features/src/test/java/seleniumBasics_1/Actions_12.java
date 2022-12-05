package seleniumBasics_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_12 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/"); 	
		
		Actions action = new Actions(driver);
		
		//To Hover over the "Sing In " link and "Right Click"
		WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		action.moveToElement(signIn).contextClick().build().perform();
		
		//Sending text to the Search Bar in Capital letter
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("abhishek").build().perform();
	}

}
