package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtility {
	
	public static WebDriver driver;
	
	public void loginUsingMobileNumber(String ph_no) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(ph_no);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ramya@123");
		Thread.sleep(1000);
		//Handle dropdown menus
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select s_Date = new Select(date);
		Select s_Month = new Select(month);
		Select s_Year = new Select(year);
		Thread.sleep(1000);
		s_Date.selectByValue("10");
		Thread.sleep(1000);
		s_Month.selectByIndex(4);
		Thread.sleep(1000);
		s_Year.selectByVisibleText("1991");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

	public void loginUsingEmailId(String email_id1, String email_id2) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email_id1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email_id2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ramya@123");

		//Handle dropdown menus
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select s_Date = new Select(date);
		Select s_Month = new Select(month);
		Select s_Year = new Select(year);
		Thread.sleep(1000);
		s_Date.selectByValue("10");
		Thread.sleep(1000);
		s_Month.selectByIndex(4);
		Thread.sleep(1000);
		s_Year.selectByVisibleText("1991");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
