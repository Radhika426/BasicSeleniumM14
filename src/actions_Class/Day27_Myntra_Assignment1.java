package actions_Class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day27_Myntra_Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into the Myntra page
		driver.get("https://www.myntra.com/");
		//Mouse hover on Men
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(men).perform();
		//Click on Sweaters link
		driver.findElement(By.xpath("//a[text()='Sweaters']")).click();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
