package waitingConditions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day26_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter into ShoppersStack Welcome page
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));//TimeoutException
		//Check the Login button
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		//Thread.sleep(2000);
		//Click on Login button
		login.click();
		//Check the Create account link
		WebElement create_account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Create Account']")));
		//Thread.sleep(2000);
		//Click on Create account link
		create_account.click();
		//Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
