package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_Assignment1_AbsoluteXpath {

	public static void main(String[] args) throws Throwable {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Register link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		//Click on Log in link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//Click on Shopping cart link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		//Click on Wishlist link
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
