package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20_IndependentDependentXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		//Get the text(price) of the 14 inch laptop
		//WebElement text = driver.findElement(By.xpath("//span[contains(text(),'1590.00')]"));
		//Get the price of Music 2
		WebElement text = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div/child::span"));
		System.out.println(text.getText());
		
		

	}

}
