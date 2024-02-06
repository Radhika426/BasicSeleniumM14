package javaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day39_ScrollIntoView {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		//Scroll down the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",facebook);
		
		WebElement laptop14 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(false);",laptop14);
	

	}

}
