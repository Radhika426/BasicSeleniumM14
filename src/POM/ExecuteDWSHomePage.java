package POM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSHomePage {
	
	@Test
	public void receiver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Day46_DWSHomePage execute = new Day46_DWSHomePage(driver);
//		execute.searchField.sendKeys("mobile");
//		execute.searchButton.click();
		execute.searchField("mobile");
		execute.searchButton();
	}

}
