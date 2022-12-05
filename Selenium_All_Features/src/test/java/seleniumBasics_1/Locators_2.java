package seleniumBasics_1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

	static String wrongPswErrMsg;
	static String pswdGenerated ;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		//Invoking Browser
		//Chrome --> ChromeDriver(Class) --> Methods
		//Firefox --> FirefoxDriver(Class) --> Methods
		//WebDriver (Interface)
		WebDriver driver = new ChromeDriver();
		//Implicit Waits
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //method Deprecated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Abhi");
		driver.findElement(By.name("inputPassword")).sendKeys("WrongPasswrd");
		driver.findElement(By.className("signInBtn")).click();

		if(driver.findElement(By.cssSelector("p.error")).isDisplayed()){

			wrongPswErrMsg = driver.findElement(By.cssSelector("p.error")).getText();
			System.out.println("The error message is --> " + wrongPswErrMsg);
			
			//Click on the Forgot password link
			driver.findElement(By.linkText("Forgot your password?")).click();
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhishek Sarkar");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sarkar.abhishek06@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9007606324"); 
			driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();

			System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
			String temp = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
			pswdGenerated = temp.substring(31, 49);
			System.out.println("The password extracted form the string is -->"+pswdGenerated);
			
			//Click on go to Login button
			driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
			driver.findElement(By.id("inputUsername")).sendKeys("Abhi");
			driver.findElement(By.name("inputPassword")).sendKeys(pswdGenerated);
			driver.findElement(By.className("signInBtn")).click();


		}


	}
	




}


