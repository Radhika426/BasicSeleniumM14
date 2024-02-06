package popUps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day35_Assignment2_RedBus {

	public static void main(String[] args) throws InterruptedException {

		//To avoid notification pop-up
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//Open the browser
		WebDriver driver = new ChromeDriver(option);
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Provide explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//Enter into Redbus page
		driver.get("https://www.redbus.in/");
		//Select From, To and Date of booking
		Actions act = new Actions(driver);
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//text[text()='Bangalore']")));
		act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.id("dest")).sendKeys("Chennai");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//text[text()='Chennai']")));
		act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//span[text()='20']")).click();
		//Click on Search Buses button
		driver.findElement(By.id("search_button")).click();
	}
}
