package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Day38_TakeScreenshotWebElement_DWS {

	public static void main(String[] args) throws IOException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		LocalDateTime time = LocalDateTime.now();
		String date = time.toString().replace(':','-');
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		WebElement logo = driver.findElement(By.className("header"));
		File from = logo.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\DELL\\Pictures\\Saved Pictures\\Screenshots\\Logo"+date+".png");
		FileHandler.copy(from, to);

	}

}
