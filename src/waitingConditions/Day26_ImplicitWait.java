package waitingConditions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26_ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//10 to maximum of 15 seconds in real time
		//Enter into Facebook page
		driver.get("https://www.facebook.com/");
		//Click on Create account link
	    WebElement create_Account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_Account.click();
		//Thread.sleep(2000);
		//Pass data into First name textfield
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Ramya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rani");
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		if(create_Account.isDisplayed()) {
			System.out.println("You are in Login page");
		}
		else
			System.out.println("You are not in Login page");
		

	}

}
