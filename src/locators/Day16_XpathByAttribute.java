package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16_XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Log in link
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		//Fill up the login form
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("radhe123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("radha@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
