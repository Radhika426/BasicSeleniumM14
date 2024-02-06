package popUps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day35_FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Naukri page
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		//Click on Register button
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(2000);
		//Scroll down to end of web page
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		//Upload PDF file in Upload Resume 
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\DELL\\Desktop\\Assignment5-1_SQL.pdf");
		Thread.sleep(2000);
		//Close the browser
		driver.close();
		

	}

}
