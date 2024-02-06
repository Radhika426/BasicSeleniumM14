package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		String url="https://www.makemytrip.com/";
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
