package seleniumBasics_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown_4 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//CURRENCY Dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);//INR
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//PASSENGERS Dropdown
		driver.findElement(By.id("divpaxinfo")).click(); //Click on Passengers dropdown
		Thread.sleep(3000);
		
		//While Loop
//		int i = 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click(); //Click on '+'
//			i++;
//		}
		
		//For Loop
		for(int i = 1; i<5; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();  //Click on Done Button
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//Printing the Final value displayed
		
		//dropdown.getOptions(); //Fetch all the Webelements of dropdown
		//dropdown.getFirstSelectedOption(); // Returns a WebElement
		//dropdown.getAllSelectedOptions(); //Return List of WebElement
		
	
	}

}
