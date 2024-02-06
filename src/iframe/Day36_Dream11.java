package iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day36_Dream11 {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Provide explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
		//Enter into dream11 page
		driver.get("https://www.dream11.com/");
		//Enter mobile number
		//Using index
		//driver.switchTo().frame(0);
		
		//Using id/name value
		//driver.switchTo().frame("send-sms-iframe");
		
		//Using WebElement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.id("regEmail")).sendKeys("9448764444");
		//Click on Hamburger icon
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hamburger']")));
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
	}
}