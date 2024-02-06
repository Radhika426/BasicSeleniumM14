package javaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day38_ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into Skillrary page
		driver.get("https://skillrary.com/");
		//Scroll down the page
		JavascriptExecutor je = (JavascriptExecutor)driver;
//		je.executeScript("window.scrollBy(0,1000);");
//		Thread.sleep(2000);
//		je.executeScript("window.scrollBy(0,-1000);");
		
		je.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(2000);
		je.executeScript("window.scrollTo(0,-1000);");

	}

}
