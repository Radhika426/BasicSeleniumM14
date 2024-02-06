package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_Assignment_Login {

	public static WebDriver driver;

	//Pre-condition
	public static void ChromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//Test Script
	public static void Login() {
		driver.get("https://demowebshop.tricentis.com/");
		WebElement welcomeText = driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
		if(welcomeText.isDisplayed()) {
			System.out.println("Successfully entered the home page");
			driver.findElement(By.linkText("Log in")).click();
			WebElement loginText = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(loginText.isDisplayed()) {
				System.out.println("You are in Login page");
				driver.findElement(By.id("Email")).sendKeys("vin123@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("vin123");
				driver.findElement(By.cssSelector("input[type='checkbox']")).click();
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
			}
			else
				System.out.println("You are not in Login page");
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
		Login();
		CloseBrowser();
	}

}
