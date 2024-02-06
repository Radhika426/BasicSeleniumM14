package popUps;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day35_Assignment1 {

	public static void main(String[] args) {

		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Provide implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Enter into demoautomationtesting page
		driver.get("https://demo.automationtesting.in/Register.html");
		//Fill in the Register form
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ramya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rani");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramya123@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9448764444");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.cssSelector("#checkbox2")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		List<WebElement> languages = driver.findElements(By.xpath("//ul[contains(@class,'ui-auto')]/li/a"));
		for (WebElement lang : languages) {
			if(lang.getText().equals("English")) {
				lang.click();
				break;
			}
		}
        WebElement skills_DD = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select skills = new Select(skills_DD);
        skills.selectByValue("Android");
		driver.findElement(By.id("firstpassword")).sendKeys("ramya@123");
		driver.findElement(By.id("secondpassword")).sendKeys("ramya@123");
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
		for (WebElement country : countries) {
			if(country.getText().equals("India")) {
				country.click();
				break;
			}
		}
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		
		Select s1 = new Select(year);
		s1.selectByVisibleText("1996");
		
		Select s2 = new Select(month);
		s2.selectByVisibleText("May");
		
		Select s3 = new Select(day);
		s3.selectByVisibleText("10");
		
		driver.findElement(By.cssSelector("#submitbtn")).click();
		
		//To Refresh the Register form
		//driver.findElement(By.xpath("//button[@value='Refresh']")).click();	
	}
}