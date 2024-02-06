package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Day38_TakeScreenShot_DWS {

	public static void main(String[] args) throws IOException {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/register");
		LocalDateTime time = LocalDateTime.now();
		String date = time.toString().replace(':','-');
		//Take Screenshot of DWS Homepage
		TakesScreenshot ts = (TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\DELL\\Pictures\\Saved Pictures\\Screenshots\\DWS"+date+".png");
		FileHandler.copy(from, to);

	}

}
