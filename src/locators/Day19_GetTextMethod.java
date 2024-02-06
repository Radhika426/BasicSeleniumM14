package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_GetTextMethod {

	public static void main(String[] args) throws InterruptedException {

		//Launching Browser
		WebDriver driver = new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Capture Register text and print it
		WebElement register_Text = driver.findElement(By.xpath("//a[text()='Register']"));
		System.out.println(register_Text.getText());
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
