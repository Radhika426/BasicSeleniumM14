package Shoes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reebok {

	@Test
	public void reebok() {
		//Given data
		String given_Url="https://reebok.abfrl.in/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Reebok page
		driver.get("https://reebok.abfrl.in/");
		//Verify Reebok page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Reebok page");
			driver.quit();
		}
		else
			System.out.println("You are not in Reebok page");
	}
}