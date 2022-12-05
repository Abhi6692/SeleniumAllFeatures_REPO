package seleniumBasics_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI_7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		
		
		//This is for choosing the Month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			//Click on the arrow button for next month untill the month matches with the given month
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		 
		List<WebElement> dates= driver.findElements(By.className("day"));
		
		//Grab common attribute
		//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();
		 
		for(int i=0;i<count;i++)
		{
		String text=dates.get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
			dates.get(i).click();
		break;
		}
		 
		}

		
		
		

	}

}
