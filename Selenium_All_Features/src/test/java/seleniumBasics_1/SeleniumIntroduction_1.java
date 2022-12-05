package seleniumBasics_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction_1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\Desktop\\Edureka\\Selenium_All_Features\\ChromeDriver\\chromedriver.exe");
		//Invoking Browser
		//Chrome --> ChromeDriver(Class) --> Methods
		//Firefox --> FirefoxDriver(Class) --> Methods
		//WebDriver (Interface)
		WebDriver driver = new ChromeDriver();

		//Two  Ways
		driver.get("https://rahulshettyacademy.com");

		//driver.navigate().to("https://rahulshettyacademy.com");

		System.out.println("The Title of the page is --> "+ driver.getTitle());
		System.out.println("The Page URL is -->" + driver.getCurrentUrl());



		//To Refresh the page 
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());
		//Press F5 using KEYS operation


		//To Go back to Previous page
		driver.navigate().back();

		//To navigate to next page
		driver.navigate().forward();


		driver.close();
		//driver.quit();


	}

}
