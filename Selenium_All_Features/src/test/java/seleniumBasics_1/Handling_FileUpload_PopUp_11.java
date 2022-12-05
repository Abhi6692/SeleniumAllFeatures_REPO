package seleniumBasics_1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileUpload_PopUp_11 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		//Open any Url (Two Ways)
		driver.get("http://www.globalsqa.com/samplepagetest/");
		
		Thread.sleep(3000);
		
		// Instead of clicking on that upload button , we need to enter SendKeys with the file location address
		// It will only work when type = "file"
		driver.findElement(By.xpath("//input[@name='file-553']")).sendKeys("C:\\Users\\OM\\Desktop\\Serialization & Deserialization.pdf");
		
		System.out.println("Reached this Point");
		
		
		
		
	}
		
		
		

	}


