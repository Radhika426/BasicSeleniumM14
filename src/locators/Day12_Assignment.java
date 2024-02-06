package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_Assignment {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		String given_DigitalDownloadsTitle="Demo Web Shop. Digital downloads";
		String given_ShoppingCartTitle="Demo Web Shop. Shopping Cart";
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify the url of the page
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("Successfully entered");
			//Click on the DigitalDownloads link
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			//Verify the DigitalDownloads page by using Title
			String current_DigitalDownloadsTitle = driver.getTitle();
			if(given_DigitalDownloadsTitle.contains(current_DigitalDownloadsTitle)) {
				System.out.println("You are in DigitalDownloads page");
				//Store all the Add to cart web elements
				List<WebElement> addToCart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement cart : addToCart) {
					cart.click();
					Thread.sleep(2000);
				}
				//Click on Shopping cart link
				driver.findElement(By.linkText("Shopping cart")).click();
				//Verify the Shopping cart page by using Title
				String current_ShoppingCartTitle = driver.getTitle();
				if(given_ShoppingCartTitle.contains(current_ShoppingCartTitle)) {
					System.out.println("You are in Shopping cart page");
					Thread.sleep(2000);
					//Close the browser
					driver.close();
				}
				else
					System.out.println("You are not in Shopping cart page");
			}
			else
				System.out.println("You are not in DigitalDownloads page");
		}
		else
			System.out.println("Unsuccessful");

	}
	
}
