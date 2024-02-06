package Bikes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bajaj {

	@Test
	public void bajaj() {
		//Given data
		String given_Url="https://www.bajajauto.com/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Bajaj page
		driver.get("https://www.bajajauto.com/");
		//Verify Bajaj page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Bajaj page");
			driver.quit();
		}
		else
			System.out.println("You are not in Bajaj page");
	}
}