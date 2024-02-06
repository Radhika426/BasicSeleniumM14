package Shoes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puma {

	@Test
	public void puma() {
		//Given data
		String given_Url="https://in.puma.com/in/en";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Puma page
		driver.get("https://in.puma.com/in/en");
		//Verify Puma page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Puma page");
			driver.quit();
		}
		else
			System.out.println("You are not in Puma page");
	}
}