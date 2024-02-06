package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day22_SingleSelect {

	public static void main(String[] args) throws Throwable {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter into Demo page
		driver.get("file:///C:/Users/DELL/Downloads/demo-1.html");
		//Store the WebElement of dropdown menu
		WebElement single_Select = driver.findElement(By.cssSelector("select[id='standard_cars']"));
		//Click on Mercedes option from dropdown menu
		Select s_ref = new Select(single_Select);
		Thread.sleep(2000);
		s_ref.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		//Click on Honda option from dropdown menu
		s_ref.selectByValue("hda");
		Thread.sleep(2000);
		//Click on Nissan option from dropdown menu
		s_ref.selectByIndex(9);
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
