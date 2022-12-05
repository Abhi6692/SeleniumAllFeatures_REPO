package globalValues_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive   {

	
	public static void main(String[] args) throws IOException {
	
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\OM\\Desktop\\Edureka\\Selenium_All_Features\\src\\test\\java\\globalValues_5\\data.properties");
		prop.load(file);
		
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("url"));
		
	}
	
}
