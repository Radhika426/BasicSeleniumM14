package actions_Class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day28_Assignment2 {

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
		//Verify and click on Delete option using Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Delete']")));
		delete.click();
		//Verify the script is successful
		try {
			right_click.click();
			System.out.println("My script is Unsuccessful");
		} catch (Exception e) {
			System.out.println("My script is Successful");
		}
		Thread.sleep(2000);
		//Close the browser
		driver.close();
	}
}
