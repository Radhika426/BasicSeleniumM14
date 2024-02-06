package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_Assignment2_AbsoluteXpath {

	public static void main(String[] args) throws Throwable {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Click on Books link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		//Navigate back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		//Click on Computers link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//Click on Demo Web Shop logo
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/a/img")).click();
		Thread.sleep(2000);
		//Click on Electronics link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		//Navigate back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		//Click on Apparel & Shoes link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		//Click on Demo Web Shop logo
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/a/img")).click();
		Thread.sleep(2000);
		//Click on Digital Downloads link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		//Navigate back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		//Click on Jewelry link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		//Click on Demo Web Shop logo
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/a/img")).click();
		Thread.sleep(2000);
		//Click on Gift Cards link
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[7]/a")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();
				

	}

}
