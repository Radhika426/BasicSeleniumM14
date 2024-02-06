package javaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day39_ClickDisabledElement {
    
	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Java SE 11 Archive Downloads page
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		//Click on Disabled WebElement
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement download_link = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.zip"));
		js.executeScript("arguments[0].scrollIntoView(false);",download_link);
		download_link.click();
		WebElement disable_button = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.zip"));
		js.executeScript("arguments[0].click();",disable_button);

	}

}
