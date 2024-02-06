package Assertions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	
	@Test
	public void dws() {
		String given_Url="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String current_Url = driver.getCurrentUrl();
		//Assert.assertEquals(current_Url, given_Url);
		//Assert.assertNotEquals(current_Url,given_Url);
		SoftAssert soft_assert = new SoftAssert();
		//soft_assert.assertEquals(current_Url, given_Url);
		soft_assert.assertNotEquals(current_Url, given_Url);
		System.out.println("Script is Successful");
		driver.quit();
		soft_assert.assertAll();
	}

}
