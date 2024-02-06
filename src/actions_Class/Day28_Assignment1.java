package actions_Class;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day28_Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into dhtmlgoodies page
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//Locate all capitals and store in WebElement array in order
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement copenhagen = driver.findElement(By.id("box4"));
		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement[] capitals= {rome,madrid,oslo,copenhagen,seoul,stockholm,washington};
		//Drag the capitals into respective countries one by one
		List<WebElement> countries = driver.findElements(By.xpath("//div[@id='countries']/div"));
		Actions a = new Actions(driver);
		int i=0;
		for (WebElement country : countries) {
			a.dragAndDrop(capitals[i++], country).build().perform();
			Thread.sleep(1000);
		}
		//Close the browser
		driver.close();
	}

}
