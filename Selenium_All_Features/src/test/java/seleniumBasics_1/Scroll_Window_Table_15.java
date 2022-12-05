package seleniumBasics_1;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Scroll_Window_Table_15 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//Window Scroll
		jse.executeScript("window.scrollBy(0,500)");

		Thread.sleep(5000);

		//Scroll at the WebTable Level            //CssSelector -->tag.className 
		jse.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");

		List<WebElement> amountValues = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));

		//To Check the Values Fetched
		for(WebElement we :amountValues) {

			System.out.println(we.getText());
		}

		//TO find the sum of the Amount
		int Actualsum = 0;
		for(WebElement we :amountValues) {

			Actualsum = Actualsum + Integer.parseInt(we.getText());
		}

		System.out.println("The Sum of the Amount fetched is : " + Actualsum);


		int sumDisplayed = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		System.out.println(sumDisplayed);

		Assert.assertEquals("The Sum displayed in the website is Incorrect, Please Check Manually", sumDisplayed, Actualsum);





	}

}
