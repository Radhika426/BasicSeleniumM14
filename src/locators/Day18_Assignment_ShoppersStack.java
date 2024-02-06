package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_Assignment_ShoppersStack {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://www.shoppersstack.com/";
		String given_LoginTitle="ShoppersStack | Login";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into ShoppersStack welcome page 
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(13000);
		//Verify Welcome page using url
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Welcome page");
			//Verify Login button is enabled
			WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
			if(loginButton.isEnabled()) {
				System.out.println("Login button is clickable");
				Thread.sleep(2000);
				//Click on Login button
				loginButton.click();
				//Verify Login page using title
				String current_LoginTitle = driver.getTitle();
				if(given_LoginTitle.contains(current_LoginTitle)) {
					System.out.println("You are in Login page");
					Thread.sleep(2000);
					//Verify Create Account button is displayed
					WebElement createAccButton = driver.findElement(By.xpath("//span[text()='Create Account']"));
					if(createAccButton.isDisplayed()) {
						System.out.println("Create Account button is clickable");
						Thread.sleep(2000);
						createAccButton.click();
						//Verify Signup page using Signup text
						WebElement signupText = driver.findElement(By.xpath("//a[text()='signup']"));
						if(signupText.isDisplayed()) {
							System.out.println("You are in Signup page");
							Thread.sleep(2000);
							//Fill in the Create Your Profile form
							driver.findElement(By.id("First Name")).sendKeys("Ramya");
							driver.findElement(By.name("Last Name")).sendKeys("Krishnan");
							driver.findElement(By.cssSelector("input[value='FEMALE']")).click();
							driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9448764444");
							driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("ramya123@gmail.com");
							driver.findElement(By.id("Password")).sendKeys("Ramya@123");
							driver.findElement(By.name("Confirm Password")).sendKeys("Ramya@123");
							driver.findElement(By.id("Terms and Conditions")).click();
							Thread.sleep(2000);
							//Verify Register button is enabled
							WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
							if(registerButton.isEnabled()) {
								System.out.println("Register button is clickable");
								Thread.sleep(2000);
								registerButton.click();
								Thread.sleep(2000);
								driver.close();
							}
							else
								System.out.println("Register button is not clickable");
						}
						else
							System.out.println("You are not in Signup page");
					}
					else
						System.out.println("Create Account button is not clickable");
				}
				else
					System.out.println("Check the title of the Login page");
			}
			else
				System.out.println("Login button is not clickable");
		}
		else
			System.out.println("Check the Url of the page");

		}

	}
