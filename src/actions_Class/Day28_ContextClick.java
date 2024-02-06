package actions_Class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day28_ContextClick {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into the Demo guru99 page
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Right click on the button
		Actions a = new Actions(driver);
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(right_click).build().perform();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
