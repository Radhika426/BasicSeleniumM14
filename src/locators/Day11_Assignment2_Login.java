package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_Assignment2_Login {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		String given_LoginTitle="Demo Web Shop. Login";
		
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
			
			//Click on the Log in link
			driver.findElement(By.linkText("Log in")).click();
			
			//Verify the Login page by using Title
			String current_LoginTitle = driver.getTitle();
			if(given_LoginTitle.contains(current_LoginTitle)) {
				System.out.println("You are in Login page");
				
				//Fill up the Login form by using Css Selector
				driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("radhe123@gmail.com");
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("radha@123");
				driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				Thread.sleep(2000);
				
				//Close the browser
				driver.close();
			}
			else 
				System.out.println("You are not in Login page");
		}
		else 
			System.out.println("Unsuccessful");
		
	}

}
