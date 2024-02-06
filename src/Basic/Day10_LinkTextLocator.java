package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_LinkTextLocator {

	public static void main(String[] args) {
		
		String given_Url="https://demowebshop.tricentis.com/";
		String given_loginTitle="Demo Web Shop. Login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("Successfully entered");
			driver.findElement(By.linkText("Log in")).click();
			String current_loginTitle = driver.getTitle();
			if(given_loginTitle.contains(current_loginTitle)) {
				System.out.println("You are in Login page");
				driver.close();
			}
			else {
				System.out.println("You are not in Login page");
			}
		}
		else
			System.out.println("Unsuccessful");

	}

}
