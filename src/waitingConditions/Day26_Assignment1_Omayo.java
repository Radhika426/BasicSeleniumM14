package waitingConditions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day26_Assignment1_Omayo {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Omayo page
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Check the Dropdown button
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Dropdown']")));
		//Click on Dropdown button
		dropdown.click();
		//Click on facebook option
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		//Verify the facebook login page using Create account WebElement
		WebElement create_Account = driver.findElement(By.xpath("//a[text()='Create new account']"));
		if(create_Account.isDisplayed()) {
			System.out.println("You are in Facebook Login page");
			driver.navigate().back();
			driver.close();
		}
		else
			System.out.println("You are not in Facebook Login page");
		

	}

}
