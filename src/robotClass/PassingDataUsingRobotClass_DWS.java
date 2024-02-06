package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingDataUsingRobotClass_DWS {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
	
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		//If Caps lock is pressed in real time then the data "mobile" will be passed in uppercase
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
