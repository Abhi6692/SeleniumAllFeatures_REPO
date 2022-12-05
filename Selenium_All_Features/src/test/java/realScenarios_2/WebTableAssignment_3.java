package realScenarios_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment_3 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//Window Scroll till the webtable
		jse.executeScript("window.scrollBy(0,500)");

		//Print number of Rows in Product Table
		System.out.println("The number of Rows present in the Product table is :" +driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size()); 
		
		//Print number of Columns in Product Table
		System.out.println("The number of Columns present in the Product table is :" +driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size());
		
		//Print the contents of 2nd rows
		
		List <WebElement> secondRowDetails = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		
		/*
		 * //I applied this for loop to check the order of the elements inserted in list
		 * for(int i =0; i<secondRowDetails.size();i++) {
		 * 
		 * System.out.println(secondRowDetails.get(i).getText());
		 * 
		 * }
		 */
		
		//Printing the Details of the second column
		System.out.println("The Instructor is -- " + secondRowDetails.get(0).getText() + " || " + "The course name is -- "+ secondRowDetails.get(1).getText() + " || " + "The Price is -- "+ secondRowDetails.get(2).getText());
	}

}
