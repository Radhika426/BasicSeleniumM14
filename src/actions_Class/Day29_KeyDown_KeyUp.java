package actions_Class;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29_KeyDown_KeyUp {

	public static void main(String[] args) throws InterruptedException {

		//keyDown--> To press the key
		//keyUp--> To release the key
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		//Scroll down the page
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyUp(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		//Scroll up the page
		a.keyDown(Keys.PAGE_UP).build().perform();
		a.keyUp(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
