package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_Task_XpathByTextFunction {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Register link
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		//Click on Log in link
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		//Click on Shopping cart link
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		//Click on Wishlist link
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
