package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day25_GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {

		String id="small-searchterms";
		//Open the Browser
		WebDriver driver = new ChromeDriver();
		//Maximizing window
		driver.manage().window().maximize();
		//Enter into Demo Web Shop page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		String attribute_value = search_field.getAttribute("id");
		System.out.println(attribute_value);
		if(id.equals(attribute_value)) {
			System.out.println("Our script is correct");
		}
		else
			System.out.println("Check the script.......");
		Thread.sleep(2000);
		driver.close();

	}

}
