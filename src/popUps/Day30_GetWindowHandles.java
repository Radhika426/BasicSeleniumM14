package popUps;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day30_GetWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions a = new Actions(driver);
		WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		a.moveToElement(books).keyDown(Keys.SHIFT).click().build().perform();
		Set<String> all_Win = driver.getWindowHandles();
		all_Win.remove(parent);
		for (String win : all_Win) {
			driver.switchTo().window(win);
		}
		driver.close();

	}

}
