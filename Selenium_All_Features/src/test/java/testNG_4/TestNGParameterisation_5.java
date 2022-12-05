package testNG_4;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterisation_5 {

	@Parameters({"URL","Browser"})
	@Test
	public void testMethod1(String url, String browser) {
		
		System.out.println(" TestNGParameterisation_5 testMethod1 Executed Successfully");
		System.out.println("The parameter fetched is" + url);
		System.out.println("The Browser is :" + browser);
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println(" TestNGParameterisation_5 testMethod2 Executed Successfully");
		
	}
	
	@Test
	public void testMethod3() {
		
		System.out.println(" TestNGParameterisation_5 testMethod3 Executed Successfully");
	}
	
	
	
	
}
