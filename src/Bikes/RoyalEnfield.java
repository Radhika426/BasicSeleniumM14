package Bikes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfield {

	@Test(groups = "smoke")
	public void royalEnfield() {
		//Given data
		String given_Url="https://www.royalenfield.com/in/en/home/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Royal Enfield page
		driver.get("https://www.royalenfield.com/in/en/home/");
		//Verify Royal Enfield page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Royal Enfield page");
			driver.quit();
		}
		else
			System.out.println("You are not in Royal Enfield page");
	}
}