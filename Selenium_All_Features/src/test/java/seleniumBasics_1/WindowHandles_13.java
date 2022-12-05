package seleniumBasics_1;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_13 {





	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		
		Iterator<String>it = windows.iterator();
		
		//Print all the titles of the windows/tabs opened
		
				
		/*
		 * while(it.hasNext()) {
		 * 
		 * driver.switchTo().window(it.next()); System.out.println("Title is: " +
		 * driver.getTitle());
		 * 
		 * }
		 */
				 
		
		String parentId = it.next();
		
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']")).getText());
		
	
		String emailId= driver.findElement(By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']")).getText().split("@")[1];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);










	}

}



