package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Assignment2_Register {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Click on Register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		//Fill up the Register form
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rashmi");
		driver.findElement(By.id("LastName")).sendKeys("Desai");
		driver.findElement(By.id("Email")).sendKeys("rashmi123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rashmi@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rashmi@123");
		//Click on Register button
		driver.findElement(By.id("register-button")).click();
		//Close the browser
		driver.close();
		

	}

}
