package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day22_Assignment1_Facebook {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://www.facebook.com/";
		String email_id="ramya123@gmail.com";
		String ph_no="9444877766";
		String userData= email_id;
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
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
					System.out.println("Signup using mobile number");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(ph_no);
					driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ramya@123");
					//Handle dropdown menus
					WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
					WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
					WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
					
					Select s_Date = new Select(date);
					Select s_Month = new Select(month);
					Select s_Year = new Select(year);
					
					s_Date.selectByValue("10");
					Thread.sleep(2000);
					s_Month.selectByIndex(4);
					Thread.sleep(2000);
					s_Year.selectByVisibleText("1991");
					
					driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
					driver.findElement(By.xpath("//button[@name='websubmit']")).click();
					Thread.sleep(2000);
					//Close the browser
					driver.close();
					
				}
				else {
					System.out.println("Signup using email id");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email_id);
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email_id);
					driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ramya@123");
					
					//Handle dropdown menus
					WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
					WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
					WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
					
					Select s_Date = new Select(date);
					Select s_Month = new Select(month);
					Select s_Year = new Select(year);
					
					s_Date.selectByValue("10");
					Thread.sleep(2000);
					s_Month.selectByIndex(4);
					Thread.sleep(2000);
					s_Year.selectByVisibleText("1991");
					
					driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
					driver.findElement(By.xpath("//button[@name='websubmit']")).click();
					Thread.sleep(2000);
					//Close the browser
					driver.close();	
				}
				
			}
			else
				System.out.println("You are not in Signup page");
		}
		else
			System.out.println("Check the Url of the page");
	}

}
