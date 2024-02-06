package select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23_DeSelect {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter into Demo page
		driver.get("file:///C:/Users/DELL/Downloads/demo-1.html");
		//Store the WebElement of dropdown menu
		WebElement multi_Select = driver.findElement(By.id("multiple_cars"));
		//Select multiple options from dropdown menu
		Select s_ref = new Select(multi_Select);
		List<WebElement> all_Cars = s_ref.getOptions();
		for (WebElement car : all_Cars) {
			car.click();
		    Thread.sleep(1000);
		}
		Thread.sleep(2000);
		s_ref.deselectAll();
		//De-Select Audi, Ford and Mercedes from Selected options in dropdown menu
		/*s_ref.deselectByIndex(1);
		s_ref.deselectByValue("for");
		s_ref.deselectByVisibleText("Mercedes");*/
		s_ref.getAllSelectedOptions();
		s_ref.getFirstSelectedOption();
		s_ref.getWrappedElement();
		s_ref.isMultiple();

	}

}
