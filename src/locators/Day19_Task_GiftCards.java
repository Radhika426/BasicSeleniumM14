package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Task_GiftCards {

	public static void main(String[] args) throws InterruptedException {

		//Given data
		String given_Url="https://demowebshop.tricentis.com/";
		String given_Title="Demo Web Shop. Gift Cards";
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
			//Click on Gift Cards link
			driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[1]")).click();
			//Verify Gift Cards page using title
			String current_Title = driver.getTitle();
			if(given_Title.contains(current_Title)) {
				System.out.println("You are in Gift Cards page");
				Thread.sleep(2000);
				//Close the browser
				driver.close();
			}
			else
				System.out.println("You are not in Gift Cards page");
		}
		else
			System.out.println("Check the Url of the page");


	}

}
