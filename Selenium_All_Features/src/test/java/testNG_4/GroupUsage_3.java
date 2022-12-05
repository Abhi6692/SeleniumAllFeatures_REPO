package testNG_4;

import org.testng.annotations.Test;

public class GroupUsage_3 {

	
	@Test(groups= {"Smoke"})
	public void testMethod1() {
		
		System.out.println(" GroupUsage_3 testMethod1 Executed Successfully");
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println(" GroupUsage_3 testMethod2 Executed Successfully");
		
	}
	
	@Test(groups= {"Smoke"})
	public void testMethod3() {
		
		System.out.println(" GroupUsage_3 testMethod3 Executed Successfully");
	}
	
	
}
