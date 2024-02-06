package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16_Assignment2_GiftCard {

	public static WebDriver driver;
	public static String given_Url="https://demowebshop.tricentis.com/";
	public static String given_Title="Demo Web Shop. $25 Virtual Gift Card";

	public static void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void CloseBrowser() {
		driver.close();
	}

	public static void giftCard() throws InterruptedException {
		//Enter into Demo Web Shop page 
		driver.get("https://demowebshop.tricentis.com/");
		//Verify Home page using url
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("Successfully entered the DWS homepage");
			//click on Add to cart button
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			//Verify Gift card page using title
			String current_Title = driver.getTitle();
			if(given_Title.contains(current_Title)) {
				System.out.println("You are in $25 Gift card page");
				Thread.sleep(2000);
				String[] name= {"ramya","ramya123@gmail.com","ramya","ramya123@gmail.com"};
				//Fill in the details
				List<WebElement> giftCard_Fields = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
				int i=0;
				for (WebElement field : giftCard_Fields) {
					field.sendKeys(name[i++]);
					Thread.sleep(2000);
				}
				driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("hi hello how are you");
				Thread.sleep(2000);
				WebElement qty = driver.findElement(By.xpath("//input[@name='addtocart_2.EnteredQuantity']"));
				qty.clear();
				Thread.sleep(2000);
				qty.sendKeys("3");
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//span[@class='close']")).click();
//				Thread.sleep(2000);
				Thread.sleep(5000);
				//Click on Shopping cart link
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				Thread.sleep(2000);
				//Verify Shopping cart page using Shopping cart text
				WebElement shoppingCartText = driver.findElement(By.xpath("//div[@class='page-title']"));
				Thread.sleep(2000);
				if(shoppingCartText.isDisplayed()) {
					System.out.println("You are in Shopping cart page");;
					//Click on Gift card checkbox
					WebElement checkBox = driver.findElement(By.xpath("//input[@name='removefromcart']"));
					checkBox.click();
					if(checkBox.isSelected()) {
						System.out.println("Your checkox is selected");
						//Click on Update shopping cart button
						WebElement update_Cart = driver.findElement(By.xpath("//input[@name='updatecart']"));
						if(update_Cart.isEnabled()) {
							System.out.println("Update_cart click is successful");
							update_Cart.click();
							Thread.sleep(2000);
						}
						else
							System.out.println("Update_cart click is unsuccessful");
						
					}
					else
						System.out.println("Your checkox is not selected");
				}
				else
					System.out.println("You are not in Shopping cart page");
			}
			else
				System.out.println("Check the title of the page");
		}
		else
			System.out.println("Check the Url of the page");
	}
	
	public static void main(String[] args) throws InterruptedException {
		OpenBrowser();
		giftCard();
		CloseBrowser();
	}



}
