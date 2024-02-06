package testNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day40_Priority_InvocationCount_ThreadPoolSide {
	
	@Test(priority = 'a')
	public void royalEnfield() {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Royal Enfield page
		driver.get("https://www.royalenfield.com/");
		driver.quit();

	}
	
	@Test(priority = 'b')
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
	
	@Test(priority = 'd',invocationCount = 2,threadPoolSize = 3)
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
	
	@Test(priority = 'c')
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
	
	@Test(priority = 'e')
	public void bmw() {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into BMW page
		driver.get("https://www.bmw.in/");
		driver.quit();

	}
	
	


}
