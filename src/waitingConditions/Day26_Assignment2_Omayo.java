package waitingConditions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day26_Assignment2_Omayo {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Omayo page
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Check the TimerEnable button
		WebElement timer_Button = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		//Click on TimerEnable button
		timer_Button.click();

	}

}
