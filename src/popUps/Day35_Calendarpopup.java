package popUps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day35_Calendarpopup {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Provide explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//Enter into Agoda page
		driver.get("https://www.agoda.com/");
		//Handle Ad popup
		WebElement no_thanks = driver.findElement(By.xpath("//button[text()='No thanks']"));
		wait.until(ExpectedConditions.visibilityOf(no_thanks));
		no_thanks.click();
		//Select Check-In and Check-Out dates
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-01-20']")).click();
		WebElement next_month = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
		for (; ;) {
			try {
				driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
				System.out.println("Script is Successful");
				break;
			} catch (Exception e) {
				next_month.click();
			}	
		}
	}

}
