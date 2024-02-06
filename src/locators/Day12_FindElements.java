package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_FindElements {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Store all the matching web elements
		List<WebElement> community_Poll = driver.findElements(By.cssSelector("input[type='radio']"));
		//System.out.println(community_Poll);
		//Click on each element using for-each loop
		for (WebElement web : community_Poll) {
			web.click();
			Thread.sleep(2000);
		}
		//Close the browser
		driver.close();

	}

}
