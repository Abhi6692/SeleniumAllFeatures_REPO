package seleniumBasics_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_Dropdown_6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List <WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		
		for(WebElement option:options) {
			
			if (option.getText().equalsIgnoreCase("India")) {
				
				option.click();
			}
		}
		
		
	}

}
