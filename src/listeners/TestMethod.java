package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.StartListeners.class)

public class TestMethod {
	
	@Test
	public void login() throws InterruptedException {
		String given_Url="https://demowebshop.tricentis.com/";
		String given_LoginTitle="Demo Web Shop. Login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_Url = driver.getCurrentUrl();
		if(given_Url.equals(current_Url)) {
			System.out.println("Successfully entered");
			driver.findElement(By.linkText("Log in")).click();
			String current_LoginTitle = driver.getTitle();
			if(given_LoginTitle.contains(current_LoginTitle)) {
				System.out.println("You are in Login page");
				driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("radhe123@gmail.com");
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("radha@123");
				driver.findElement(By.cssSelector("#RememberMe")).click();
				driver.findElement(By.cssSelector(".button-1.login-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else 
				System.out.println("You are not in Login page");
		}
		else 
			System.out.println("Unsuccessful");

	}

}
