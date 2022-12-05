package seleniumBasics_1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_10 {

	static String text = "Abhishek";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//Explicit wait initialization via 
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Exact syntax
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='alertbtn']")));
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println("Explicit Wait");
	}

}
