package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSenderAndReceiver extends BaseClass {
	
	@DataProvider(name="login")
	public Object[][] sender() {
		Object[][] obj = new Object[2][2];
		obj[0][0]="radhe123@gmail.com";
		obj[0][1]="radha@123";
		obj[1][0]="admin01@gmail.com";
		obj[1][1]="admin01";
		return obj;
	}
	
	@Test(dataProvider = "login")//(dataProvider = "sender")
	public void receiver(String email,String password) {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
