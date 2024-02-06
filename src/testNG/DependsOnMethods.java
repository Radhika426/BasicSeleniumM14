package testNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(priority = 1,dependsOnMethods = "redbus")
	public void agoda() {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Agoda page
		driver.get("https://www.agoda.com/");
		driver.quit();

	}
	
	@Test(priority = 2)
	public void dws() {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();

	}
	
	@Test(priority = 3)
	public void redbus() {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Redbus page
		driver.get("https://www.redbus.in/");
		driver.quit();

	}

}
