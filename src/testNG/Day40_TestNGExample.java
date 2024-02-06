package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Day40_TestNGExample {

	@Test
	public void dws() {
		Reporter.log("dws", true);
	}
	
	@Test
	public void test() {
		System.out.println("hi iam from test");
	}
	
	@Test
	public void cat() {
		System.out.println("hi iam from cat");
	}

}
