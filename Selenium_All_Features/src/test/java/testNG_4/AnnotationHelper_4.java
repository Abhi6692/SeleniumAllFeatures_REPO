package testNG_4;

import org.testng.annotations.Test;

public class AnnotationHelper_4 {

	
	@Test(priority = 4)
	public void testMethod1() {
		
		System.out.println(" AnnotationHelper_4 testMethod1 Executed Successfully");
	}
	
	@Test(priority = 2)
	public void testMethod2() {
		
		System.out.println(" AnnotationHelper_4 testMethod2 Executed Successfully");
		
	}
	
	@Test(priority = 1, dependsOnMethods = "testMethod2")
	public void testMethod3() {
		
		System.out.println(" AnnotationHelper_4 testMethod3 Executed Successfully");
	}
	
	
	@Test(priority = 0, timeOut = 4000)
	public void testMethod4() {
		
		System.out.println(" AnnotationHelper_4 testMethod4 Executed Successfully");
	}
}
