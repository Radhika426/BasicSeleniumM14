package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	WebElement genderMaleRadioButton;

	@FindBy(id = "gender-female")
	WebElement genderFemaleRadioButton;

	@FindBy(name = "FirstName")
	WebElement firstNameTextField;

	@FindBy(name = "LastName")
	WebElement lastNameTextField;

	@FindBy(id = "Email")
	WebElement emailTextField;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement passwordTextField;

	@FindBy(css = "#ConfirmPassword")
	WebElement confirmPasswordTextField;

	@FindBy(css = "input[name='register-button']")
	WebElement registerButton;

	public void clickMaleRadioButton() {
		genderMaleRadioButton.click();
	}

	public void clickFemaleRadioButton() {
		genderFemaleRadioButton.click();
	}

	public void enterFirstName(String firstName) {
		firstNameTextField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameTextField.sendKeys(lastName);
	}

	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordTextField.sendKeys(confirmPassword);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}
}
