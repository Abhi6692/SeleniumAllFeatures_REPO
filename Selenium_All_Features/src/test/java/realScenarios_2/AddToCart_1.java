package realScenarios_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Arrays;

public class AddToCart_1 {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OM\\Desktop\\Edureka\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		addItems(driver, itemsNeeded);

	}


	//Utility Method for adding the intended items in the cart
	public static void addItems(WebDriver driver, String[] itemsNeeded){
		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++){
			//Brocolli - 1 Kg
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();//format it to get actual vegetable name

			//convert array into array list for easy search//  check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if(itemsNeededList.contains(formattedName))
			{
				j++;

				//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				//if we apply break directly,it will come out of the execution loop only after 1st element
				if(j==itemsNeeded.length){
					break;}


			}
		}





	}


}