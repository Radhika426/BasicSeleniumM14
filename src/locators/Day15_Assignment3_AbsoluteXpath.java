package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_Assignment3_AbsoluteXpath {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify Home page using Welcome to our store text
		WebElement welcomeText = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[3]/div/div/div[2]/div/h2"));
		if(welcomeText.isDisplayed()) {
			System.out.println("Successfully entered the Home page");
			//Click on Register link
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			//Verify Register page using Register text
			WebElement registerText = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div/h1"));
			if(registerText.isDisplayed()) {
				System.out.println("You are in Register page");
				//Fill up the Register form
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div[2]/input")).click();
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Ramya");
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Chopra");
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("rc123@gmail.com");
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("rc@123");
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("rc@123");
				driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
				//Close the browser
				driver.close();
			}
			else
				System.out.println("You are not in Register page");
		}
		else
			System.out.println("Unsuccessful");

	}

}
