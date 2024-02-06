package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ktmindia.com/");
		String current_titleKtm = driver.getTitle();
		driver.get("https://www.royalenfield.com/");
		
		driver.navigate().back();
		String given_titleKtm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors"; 
		if(given_titleKtm.equals(current_titleKtm)) { //contains() can also be used
			System.out.println("You are in KTM webpage");
		}
		else {
			System.out.println("You are in RoyalEnfield Webpage");
		}
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}

}
//contentEquals() is same as contains()
