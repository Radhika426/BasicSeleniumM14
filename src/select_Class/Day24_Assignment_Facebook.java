package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day24_Assignment_Facebook extends GenericUtility{
	
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		GenericUtility gen = new GenericUtility();
		//Given data
		String given_Url="https://www.facebook.com/";
		String email_id="ramya123@gmail.com";
		String ph_no="9444877766";
		String userData= "9444877766";
		//Open and Maximize the browser
		openBrowser();
		//Enter into Facebook page
		driver.get("https://www.facebook.com/");
		//Verify Facebook login page using Url
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Facebook login page");
			//Click on Create Account button
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(2000);
			//Verify Signup page using WebElement
			WebElement signup_Text = driver.findElement(By.xpath("//div[text()='Sign Up']"));
			if(signup_Text.isDisplayed()) {
				System.out.println("You are in Signup page");
				Thread.sleep(2000);
				//Fill the form
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramya");
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rani");
				if(Character.isDigit(userData.charAt(0))) {
					gen.loginUsingMobileNumber(ph_no);
					Thread.sleep(2000);
					closeBrowser();

				}
				else {
					gen.loginUsingEmailId(email_id, email_id);
					Thread.sleep(2000);
					closeBrowser();
				}

			}
			else
				System.out.println("You are not in Signup page");
		}
		else
			System.out.println("Check the Url of the page");

	}

}
