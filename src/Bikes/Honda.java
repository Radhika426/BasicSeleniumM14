package Bikes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Honda {
	
	@Test(groups = {"smoke","regression"})
	public void honda() {
		//Given data
		String given_Url="https://www.honda2wheelersindia.com/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Honda page
		driver.get("https://www.honda2wheelersindia.com/");
		//Verify Honda page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Honda page");
			driver.quit();
		}
		else
			System.out.println("You are not in Honda page");
	}
}