package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Assignment_GetTextMethod {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		//Launching Browser
		WebDriver driver = new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify DWS Homepage using Url
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in DWS Home page");
			//Locate the links and print the their names(texts)
			List<WebElement> all_Links = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
			for (WebElement link : all_Links) {
				System.out.println(link.getText());
				Thread.sleep(2000);
			}
			//Close the browser
			driver.close();
		}
		else
			System.out.println("Check the Url of the page");
		

	}

}
