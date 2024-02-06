package select_Class;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23_IsMultiple {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter into Demo page
		driver.get("file:///C:/Users/DELL/Downloads/demo-1.html");
		//Store the WebElements of 2 dropdown menu
		WebElement single_SelectDD = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		WebElement multi_SelectDD = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		//Verify whether the dropdown menus are Single Select or Multi Select
		Select s1 = new Select(single_SelectDD);
		Select s2 = new Select(multi_SelectDD);
		if(s1.isMultiple()) {
			System.out.println("You are using s1 dropdown menu");
			List<WebElement> s1_Values = s1.getOptions();
			for (WebElement v1 : s1_Values) {
				v1.click();
				Thread.sleep(1000);
			}
			s1.deselectAll();
		}
		else {
			System.out.println("You are using s2 dropdown menu");
			List<WebElement> s2_Values = s2.getOptions();
			for (WebElement v2 : s2_Values) {
				v2.click();
				Thread.sleep(1000);
			}
			s2.deselectAll();
		}
		driver.close();

	}

}
