package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day16_Assignment1_GiftCard extends UtilityForDemoWebShop {

	public static void main(String[] args) {
		
		//Given data
		String given_Title="Demo Web Shop. $25 Virtual Gift Card";
		//Open and Maximize the browser
		UtilityForDemoWebShop.ChromeBrowser();
		//Enter into Demo Web Shop page 
		driver.get("https://demowebshop.tricentis.com/");
		//Verify Home page using Welcome to our store text
		WebElement welcomeText = driver.findElement(By.xpath("//h2[@class=\"topic-html-content-header\"]"));
		if(welcomeText.isDisplayed()) {
			System.out.println("Successfully entered the homepage");
			//click on Add to cart button
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			//Verify Gift card page using $25 Virtual Gift Card text
			String current_Title = driver.getTitle();
			if(given_Title.contains(current_Title)) {
				System.out.println("You are in $25 Gift card page");
				//Fill in the details
				driver.findElement(By.xpath("//div[@class='giftcard']/div[1]/input")).sendKeys("Ramya");
				driver.findElement(By.xpath("//div[@class='giftcard']/div[2]/input")).sendKeys("ramya123@gmail.com");
				driver.findElement(By.xpath("//div[@class='giftcard']/div[3]/input")).sendKeys("Radhika");
				driver.findElement(By.xpath("//div[@class='giftcard']/div[4]/input")).sendKeys("radhika123@gmail.com");
				driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Hi Hello Bye");
				WebElement quantity = driver.findElement(By.xpath("//input[@name='addtocart_2.EnteredQuantity']"));
				quantity.clear();
				quantity.sendKeys("3");
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
				//Click on Shopping cart link
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				//Verify Shopping cart page using Shopping cart text
				WebElement shoppingCartText = driver.findElement(By.xpath("//div[@class='page-title']"));
				if(shoppingCartText.isDisplayed()) {
					System.out.println("You are in Shopping cart page");
					//Click on Gift card checkbox
					driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
					//Click on Update shopping cart button
					driver.findElement(By.xpath("//input[@name='updatecart']")).click();
					//Close the browser
					UtilityForDemoWebShop.CloseBrowser();
				}
				else
					System.out.println("You are not in Shopping cart page");
			}
			else
				System.out.println("You are not in Gift card page");
		}
		else
			System.out.println("Unsuccessful");
		

	}

}
