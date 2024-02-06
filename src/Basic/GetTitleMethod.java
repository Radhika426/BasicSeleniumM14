package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String given_title="Demo Web Shop";//ctrl+shift+i--->ctrl+f--->title
		String current_title=driver.getTitle();
		if(given_title.equals(current_title)) {
			System.out.println("The given and current title is same");
		}
		else {
			System.out.println("The given and current title is not same");
		}
		driver.close();
	}

}
