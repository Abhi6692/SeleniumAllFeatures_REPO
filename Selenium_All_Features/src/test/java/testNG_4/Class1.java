package testNG_4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {

	
	@Test
	public void testMethod1() {
		
		System.out.println(" Class1 testMethod1 Executed Successfully");
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println("Class1 testMethod2 Executed Successfully");
		
		Assert.assertTrue(false);
	}
	
}
