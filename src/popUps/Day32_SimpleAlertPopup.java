package popUps;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32_SimpleAlertPopup {

	public static void main(String[] args) throws Throwable  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println("Your alert text is: "+al.getText());
		al.accept();
		//al.dismiss();//It performs same function as accept()
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
