package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcalss {
	@AfterTest
	public void testAfter() {
		System.out.println("After test");
	}


	@Test
	public void test() {
		System.out.println("Test ");
	}

//	@BeforeTest
//	public void testBefore() {
//		System.out.println("Before Test");
//	}

}
