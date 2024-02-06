package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Assignment {
	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into the Demo Web Shop webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Enter into Abhibus webpage
		driver.navigate().to("https://www.abhibus.com/");
		Thread.sleep(2000);
		//Again back into the Demo Web Shop webpage
		driver.navigate().back();
		Thread.sleep(2000);
		//Verify the title of the webpage by using if else condition
		String given_title="Demo Web Shop";
		String current_title = driver.getTitle();
		if(given_title.equals(current_title)) {
			System.out.println("You are in Demo Web Shop webpage");
		}
		else {
			System.out.println("You are in Abhibus webpage");
		}
		Thread.sleep(2000);
		//Enter some data into the text field
		driver.findElement(By.name("q")).sendKeys("Mobile");
		Thread.sleep(2000);
		//Refresh the webpage
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Go forward to the Abhibus webpage
		driver.navigate().forward();
		Thread.sleep(2000);
		//Close the browser
		driver.close();

	}

}
