package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_Assignment_Registration {

	public static WebDriver driver;

	//Pre-condition
	public static void ChromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//Test Script
	public static void Registration() {
		driver.get("https://demowebshop.tricentis.com/");
		WebElement welcomeText = driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
		if(welcomeText.isDisplayed()) {
			System.out.println("Successfully entered the home page");
			driver.findElement(By.linkText("Register")).click();
			WebElement registerText = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(registerText.isDisplayed()) {
				System.out.println("You are in Register page");
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Vinaya");
				driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Kumar");
				driver.findElement(By.id("Email")).sendKeys("vin123@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("vin123");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("vin123");
				driver.findElement(By.id("register-button")).click();	
			}
			else
				System.out.println("You are not in Register page");
		}
		else
			System.out.println("Unsuccessful");
	}

	//Post-condition
	public static void CloseBrowser() {
		driver.close();
	}

	public static void main(String[] args) {
		
		ChromeBrowser();
		Registration();
		CloseBrowser();
	}

}
