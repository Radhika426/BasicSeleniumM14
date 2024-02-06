package popUps;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day32_Assignment {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into the Demo guru99 page
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Right click on the button and select all the options one by one
		Actions a = new Actions(driver);
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> all_Options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for (WebElement option : all_Options) {
				a.contextClick(right_click).build().perform();
				Thread.sleep(2000);
				//System.out.println(option.getText());
				option.click();
				Thread.sleep(2000);
				//Handle the pop-up
				Alert al = driver.switchTo().alert();
				System.out.println(al.getText());
				al.accept();
				Thread.sleep(2000);
		}
		//Close the browser
		driver.close();
	}
}
