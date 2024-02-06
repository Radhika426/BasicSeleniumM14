package Shoes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fila {

	@Test
	public void fila() {
		//Given data
		String given_Url="https://fila.co.in/";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Fila page
		driver.get("https://fila.co.in/");
		//Verify Fila page using URL
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in Fila page");
			driver.quit();
		}
		else
			System.out.println("You are not in Fila page");
	}
}