package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_RefreshMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);// It is used to provide waiting condition
		driver.navigate().refresh();
		Thread.sleep(2000);
		//System.out.println("Done");
		driver.close();

	}

}
