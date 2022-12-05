package realScenarios_2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoped_LinksandTabs_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");



		//1. Give me the count of links on the page.
		System.out.println("The count of LINKS on the entire Page is : "+driver.findElements(By.tagName("a")).size());


		//2. Count of links on the footer section-


		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope

		System.out.println("The count of LINKS on the footer Page is : "+footerdriver.findElements(By.tagName("a")).size());

		//3. Find the link count of the first column of the footer
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println("The count of LINKS on the first column of the footer is : "+coloumndriver.findElements(By.tagName("a")).size());

		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{


			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		}
		
		
		// opens all the tabs
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();

		
		//Prints the title of all the tabs
		while(it.hasNext())
		{

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}










	}

}
