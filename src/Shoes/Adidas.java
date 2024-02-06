package Shoes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adidas {
	
	@Test
	public void adidas() {
		//Given data
		String given_Url="https://www.adidas.co.in/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Adidas page
		driver.get("https://www.adidas.co.in/");
		//Verify Adidas page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Adidas page");
			driver.quit();
		}
		else
			System.out.println("You are not in Adidas page");
	}
}