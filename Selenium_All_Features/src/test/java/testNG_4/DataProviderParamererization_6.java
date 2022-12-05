package testNG_4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParamererization_6 {

	
	@Test(dataProvider = "getData")
	public void webLogin(String userName , String password) {
		
		System.out.println(" DataProviderParapererization_6 webLogin  Executed Successfully");
		
		System.out.println("The UN is :" + userName);
		System.out.println("The PW is :" + password);
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object data[][] = new Object[3][2];
		
		data[0][0] = "username 1";
		data[0][1] = "Password 1";
		
		data[1][0] = "username 2";
		data[1][1] = "Password 2";
		
		data[2][0] = "username 3";
		data[2][1] = "Password 3";
		
		
		return data;
		
	}
	
}
