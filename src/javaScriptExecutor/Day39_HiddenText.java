package javaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day39_HiddenText {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Facebook page
		driver.get("https://www.facebook.com/signup/");
		//Pass value to Hidden WebElement
		WebElement gender = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Successful';",gender);

	}

}
