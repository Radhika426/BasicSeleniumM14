package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Enter data into text field
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("mobile");
		Thread.sleep(2000);
		//Click on Search button
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
