package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserByUpcasting {

	public static void main(String[] args) {
		
		String s="https://www.qspiders.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		String s1 = driver.getCurrentUrl();
		if(s.equals(s1)) {
			System.out.println("Url is same");
		}
		else {
			System.out.println("Url is not same");
		}
		driver.close();

	}

}
