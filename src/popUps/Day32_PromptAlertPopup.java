package popUps;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32_PromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		String given_text="Hello Radhika How are you today";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("Radhika");
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		String current_text = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		if(given_text.contains(current_text)) {
			System.out.println("You have successfully entered the data inside the pop-up");
			System.out.println(current_text);
			Thread.sleep(2000);
			driver.close();
		}
		else {
			System.out.println("Data is Unsuccessful");
		    Thread.sleep(2000);
		    driver.close();
		}
			
	}

}
