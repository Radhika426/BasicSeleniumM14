package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("rashmi123@gmail.com");
		Thread.sleep(2000);
		driver.close();
				

	}

}
