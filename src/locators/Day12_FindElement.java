package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_FindElement {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Excellent radio button
		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(1000);
		//Click on Good radio button
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(1000);
		//Click on Poor radio button
		driver.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(1000);
		//Click on Very bad radio button
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(1000);
		//Close the browser
		driver.close();
		

	}

}
