package popUps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day34_DisableNotificationPopup {

	public static void main(String[] args)  {

		ChromeOptions c_Options = new ChromeOptions();
		c_Options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c_Options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");

	}

}
