package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21_Assignment_IndependentDependentXpath {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		String given_Title="Demo Web Shop. Digital downloads";
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
			//Click on Digital Downloads link
			driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
			//Verify Digital Downloads page using title
			String current_Title = driver.getTitle();
			if(given_Title.contains(current_Title)) {
				System.out.println("You are in Digital Downloads page");
				//Get text of products in Digital Downloads page
				List<WebElement> all_Products = driver.findElements(By.xpath("//h2[@class='product-title']/../div[3]/div/span"));
				for (WebElement product : all_Products) {
					String text = product.getText();
					System.out.println(text);
					Thread.sleep(1000);
				}
				//Close the browser
				driver.close();
		    }
			else
				System.out.println("You are not in Digital Downloads page");
		}	
		else
			System.out.println("Check the Url of the page");

	}
}
