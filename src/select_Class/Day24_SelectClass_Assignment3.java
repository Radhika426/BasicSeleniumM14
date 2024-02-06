package select_Class;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day24_SelectClass_Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		String given_Title="Demo Web Shop. Books";
		//Launching Browser
		WebDriver driver = new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify DWS homepage using Url
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("You are in DWS homepage");
			//Click on Books link
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
			//Verify Books page using title
			String current_Title = driver.getTitle();
			if(given_Title.contains(current_Title)) {
				System.out.println("You are in Books page");
				//Print all the text of options in "Sort By" dropdown menu
				List<WebElement> all_Options = driver.findElements(By.xpath("//select[@id='products-orderby']/option"));
				for (WebElement option : all_Options) {
					System.out.println(option.getText());
					Thread.sleep(1000);
				}
				//Close the browser
				driver.close();

			}
			else
				System.out.println("You are not in Books page");
		}
		else
			System.out.println("Check the Url of the page");

	}
}
