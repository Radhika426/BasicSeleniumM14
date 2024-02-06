package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerButton;

	@FindBy(css = "#Email")
	WebElement emailTextField;

	@FindBy(id = "Password")
	WebElement passwordTextField;

	@FindBy(name = "RememberMe")
	WebElement rememberMeCheckbox;

	@FindBy(linkText = "Forgot password?")
	WebElement forgotPasswordlink;

	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;

	public void clickRegisterButton() {
		registerButton.click();
	}

	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	public void clickRememberMeCheckbox() {
		rememberMeCheckbox.click();
	}

	public void clickForgotPasswordlink() {
		forgotPasswordlink.click();
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
