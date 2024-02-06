package Shoes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nike {
	
	@Test
	public void nike() {
		//Given data
		String given_Url="https://www.nike.com/in/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Nike page
		driver.get("https://www.nike.com/in/");
		//Verify Nike page using URL
				String current_Url = driver.getCurrentUrl();
				if(given_Url.equals(current_Url)) {
					System.out.println("You are in Nike page");
					driver.quit();
				}
				else
					System.out.println("You are not in Nike page");
	}
}