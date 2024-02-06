package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String url="https://www.amazon.in/";
		String currentUrl = driver.getCurrentUrl();
		if(url.equals(currentUrl)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		driver.close();
		
	}

}
