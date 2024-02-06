package Bikes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hero {

	@Test
	public void hero() {
		//Given data
		String given_Url="https://www.heromotocorp.com/en-in.html";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Hero page
		driver.get("https://www.heromotocorp.com/en-in.html");
		//Verify Hero page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Hero page");
			driver.quit();
		}
		else
			System.out.println("You are not in Hero page");
	}
}