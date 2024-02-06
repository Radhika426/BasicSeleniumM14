package actions_Class;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29_KalkiFashion_Assignment {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Kalki Fashion page
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(3000);
		//Open all the products in new windows
		List<WebElement> products = driver.findElements(By.xpath("(//div[@id='desktop-nav'])[1]/div/a"));
		Actions a = new Actions(driver);
		for (WebElement product : products) {
			Thread.sleep(12000);
			a.moveToElement(product).keyDown(Keys.SHIFT).click().build().perform();
			Thread.sleep(15000);
		}
		//Close the browser
		driver.quit();

	}

}
