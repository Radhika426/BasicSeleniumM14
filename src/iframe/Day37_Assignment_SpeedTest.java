package iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day37_Assignment_SpeedTest {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Provide explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//Enter into SpeedTest page
		driver.get("https://www.speedtest.net/");
		driver.switchTo().frame("");
		driver.findElement(By.xpath("")).click();
		

	}

}
