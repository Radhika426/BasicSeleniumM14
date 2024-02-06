package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24_SelectClass_Assignment2 {

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
				//Select a value in Sort by, Display and View As
				WebElement sortBy = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				Select s1 = new Select(sortBy);
			    s1.selectByIndex(1);
				Thread.sleep(1000);
				WebElement display = driver.findElement(By.xpath("//select[@name='products-pagesize']"));
				Select s2 = new Select(display);
				s2.selectByVisibleText("12");
				Thread.sleep(1000);
				WebElement viewAs = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
				Select s3 = new Select(viewAs);
				s3.selectByVisibleText("List");
				
				Thread.sleep(2000);
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
