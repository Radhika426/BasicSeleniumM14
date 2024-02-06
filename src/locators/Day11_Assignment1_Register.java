package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_Assignment1_Register {

	public static void main(String[] args) throws InterruptedException {
		
		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		String given_RegisterTitle="Demo Web Shop. Register";
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		
		//Verify the url of the page
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("Successfully entered");
			
			//Click on the Register link
			driver.findElement(By.linkText("Register")).click();
			
			//Verify the Register page by using Title
			String current_RegisterTitle = driver.getTitle();
			if(given_RegisterTitle.contains(current_RegisterTitle)) {
				System.out.println("You are in Register page");
				
				//Fill up the Register form by using Css Selector
				driver.findElement(By.cssSelector("input[value='F']")).click();
				driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Radhe");
				driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Krishnan");
				driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("radhe123@gmail.com");
				driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("radha@123");
				driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("radha@123");
				driver.findElement(By.cssSelector("input[value='Register']")).click();
				Thread.sleep(2000);
				
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
