package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Assignment1_Wishlist {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Click on Wishlist link
		driver.findElement(By.linkText("Wishlist")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
