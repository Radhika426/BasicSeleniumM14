package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.get("https://demowebshop.tricentis.com/");
		//Verify the Home page using Welcome to our store text 
		WebElement welcomeText = driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
		if(welcomeText.isDisplayed()) {
			System.out.println("Successfully entered the Home page");
			//Click on the DigitalDownloads link
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			//Verify the DigitalDownloads page by using Digital Downloads Text
			WebElement digitalDownloadsText = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(digitalDownloadsText.isDisplayed()) {
				System.out.println("You are in DigitalDownloads page");
				//Store all the Add to cart web elements
				List<WebElement> addToCart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement cart : addToCart) {
					cart.click();
					Thread.sleep(2000);
				}
				//Click on Shopping cart link
				driver.findElement(By.linkText("Shopping cart")).click();
				//Verify the Shopping cart page by using Shopping Cart Text
				WebElement shoppingCartText = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shoppingCartText.isDisplayed()) {
					System.out.println("You are in Shopping cart page");
					//Select all the Remove from cart checkboxes in Shopping cart
					List<WebElement> removeFromCart = driver.findElements(By.cssSelector("input[type='checkbox']"));
					//Remove the unwanted element using remove()
					//removeFromCart.remove(3);//static way
					removeFromCart.remove(removeFromCart.size()-1);//dynamic way
					for (WebElement checkbox : removeFromCart) {
						checkbox.click();
						Thread.sleep(2000);
					}
					//Click on Update Shopping cart button
					driver.findElement(By.name("updatecart")).click();
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
