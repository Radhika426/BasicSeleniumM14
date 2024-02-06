package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Assignment2_GetTextMethod {

	public static void main(String[] args) throws InterruptedException {

		//Given text
		String given_Text="Featured products";
		//Launching Browser
		WebDriver driver = new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify DWS Homepage using Url
		String current_Text = driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
		if(given_Text.equalsIgnoreCase(current_Text)) {
			System.out.println("You are in DWS Home page");
			//Locate the links and print the their names(texts)
			List<WebElement> all_Links = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li/a"));
			for (int i=0 ; i<all_Links.size();i++) {
				String text = all_Links.get(i).getText();
				Thread.sleep(1000);
				System.out.println(text);
				Thread.sleep(1000);
			}
			//Close the browser
			driver.close();
		}
		else
			System.out.println("Check the Url of the page");

	}

}
