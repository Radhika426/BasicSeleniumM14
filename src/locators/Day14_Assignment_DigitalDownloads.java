package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_Assignment_DigitalDownloads {

	public static WebDriver driver;

	//Pre-condition
	public static void ChromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//Test Script 
	public static void DigitalDownloads() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");
		WebElement welcomeText = driver.findElement(By.cssSelector("div[class='topic-html-content-title']"));
		if(welcomeText.isDisplayed()) {
			System.out.println("Successfully entered the home page");
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			WebElement digitalDownloadsText = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(digitalDownloadsText.isDisplayed()) {
				System.out.println("You are in Digital Downloads page");
				List<WebElement> addToCart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement cart : addToCart) {
					cart.click();
					Thread.sleep(2000);
				}
				driver.findElement(By.linkText("Shopping cart")).click();
				WebElement shoppingCartText = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shoppingCartText.isDisplayed()) {
					System.out.println("You are in Shopping cart page");
					List<WebElement> removeFromCart = driver.findElements(By.cssSelector("input[type='checkbox']"));
					removeFromCart.remove(removeFromCart.size()-1);
					for (WebElement checkbox : removeFromCart) {
						checkbox.click();
						Thread.sleep(2000);
					}
					driver.findElement(By.name("updatecart")).click();
				}
				else
					System.out.println("You are not in Shopping cart page");
			}
			else
				System.out.println("You are not in Digital Downloads page");
		}
		else
			System.out.println("Unsuccessful");
	}

	//Post-condition
	public static void CloseBrowser() {
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeBrowser();
		DigitalDownloads();
		CloseBrowser();
	}

}
