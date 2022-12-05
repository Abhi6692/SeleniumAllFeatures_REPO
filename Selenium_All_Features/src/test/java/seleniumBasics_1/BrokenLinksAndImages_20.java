package seleniumBasics_1;




import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksAndImages_20 {


	@Test
	public void testMethodBrokenLinksandImages() throws InterruptedException, MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 3");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put PageloadTimeout -->To wait for the page to load properly
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		//Open any Url (Two Ways)
		driver.get("https://classic.crmpro.com/index.html?e=2");
		//driver.navigate().to("https://phptravels.com/demo/");


		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Abhi6692");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rony#6692");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();

		driver.switchTo().frame("mainpanel");


		//We will test those links only whose href is available 

		List<WebElement>  linksAndImages = driver.findElements(By.tagName("a"));

		//Adding all  the images with tag "img"
		linksAndImages.addAll(driver.findElements(By.tagName("img")));

		System.out.println("The total number of Links and Images present----> " + linksAndImages.size());



		List<WebElement> activeLinks = new   ArrayList<WebElement>();

		for (int i = 0 ; i<linksAndImages.size() ; i++) {



			if(linksAndImages.get(i).getAttribute("href") != null && (!linksAndImages.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(linksAndImages.get(i));

			}
		}		


		System.out.println("The total number of Active Links and Images are ---> " + activeLinks.size());




		// Check the href URL with HTTP connection API  


		for(int i = 0 ; i <activeLinks.size(); i++) {


			HttpsURLConnection connection = (HttpsURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
			
			connection.connect(); 
			String response = connection.getResponseMessage();
			connection.disconnect();

			System.out.println(activeLinks.get(i).getAttribute("href") + " -----> " +response );

		}


		driver.quit();




	}

}




