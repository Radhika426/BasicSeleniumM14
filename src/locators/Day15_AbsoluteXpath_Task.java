package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_AbsoluteXpath_Task {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[1]")).sendKeys("book");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
