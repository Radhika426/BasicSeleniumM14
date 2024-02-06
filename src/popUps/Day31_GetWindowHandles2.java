package popUps;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day31_GetWindowHandles2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		wait.until(ExpectedConditions.visibilityOf(twitter));
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		Set<String> all_Win = driver.getWindowHandles();
		all_Win.remove(parent);
		for (String win : all_Win) {
			driver.switchTo().window(win);
		}
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[text()='nopCommerce']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		System.out.println("Script is Successful");
		Thread.sleep(2000);
		driver.quit();
		/*driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.close();*/

	}

}
