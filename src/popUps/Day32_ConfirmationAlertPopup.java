package popUps;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32_ConfirmationAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.dismiss();
		Thread.sleep(2000);
		driver.close();

	}

}
