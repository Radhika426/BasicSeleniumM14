package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_Url = driver.getCurrentUrl();
		Thread.sleep(2000);
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String given_Url="https://demowebshop.tricentis.com/";
        if(given_Url.equals(current_Url)) {
        	System.out.println("You are in DemoWebShop Webpage");
        }
        else {
        	System.out.println("You are in Redbus Webpage");
        }
        Thread.sleep(2000);
		driver.close();

	}

}
