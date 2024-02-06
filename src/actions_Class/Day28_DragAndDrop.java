package actions_Class;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day28_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into dhtmlgoodies page
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//Drag Rome and drop it into Italy
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
