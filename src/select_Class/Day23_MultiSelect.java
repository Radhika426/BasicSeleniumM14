package select_Class;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23_MultiSelect {

	public static void main(String[] args) {

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
		//Click on all options from dropdown menu
		/*s_ref.selectByIndex(0);
		s_ref.selectByVisibleText("Audi");
		s_ref.selectByValue("bmw");
		s_ref.selectByIndex(3);
		s_ref.selectByVisibleText("Honda");
		s_ref.selectByValue("jgr");
        s_ref.selectByIndex(6);
		s_ref.selectByVisibleText("Mercedes");
		s_ref.selectByValue("min");
		s_ref.selectByVisibleText("Nissan");
		s_ref.selectByValue("toy");
		s_ref.selectByIndex(11);*/
		List<WebElement> all_Cars = s_ref.getOptions();
		for (WebElement car : all_Cars) {
			System.out.println(car.getText());
			car.click();
		}
		//org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "option"
		/*List<WebElement> all_Cars = driver.findElements(By.xpath("//select[@id='multiple_cars']/option"));
		int i=0;
		for (WebElement car : all_Cars) {
			Select s = new Select(car);
			s.selectByIndex(i++);
		}*/


		
		

	}

}
