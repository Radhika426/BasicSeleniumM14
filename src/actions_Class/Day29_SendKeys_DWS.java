package actions_Class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29_SendKeys_DWS {

	public static void main(String[] args) {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify DWS Home page using Url
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in DWS Home page");
			WebElement search_field = driver.findElement(By.id("small-searchterms"));
			Actions a = new Actions(driver);
			//Verify search textfield is enabled or not
			if(search_field.isEnabled()) {
				System.out.println("Search field is enabled");
				//Enter books into search text field
				a.moveToElement(search_field).click().sendKeys("books").build().perform();
				//Click on search button
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println("Script is successful");
				//Close the browser
				driver.close();
			}
			else
				System.out.println("Search field is not enabled");
		}
		else
			System.out.println("You are not in DWS Home page");
		
	}

}
