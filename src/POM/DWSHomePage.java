package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {

	public DWSHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	WebElement dwsLogo;

	@FindBy(linkText = "Register")
	WebElement registerLink;

	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	WebElement shoppingCartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	WebElement wishlistLink;

	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchTextField;
	
	@FindBy(css = "input[value='Search']")
	WebElement searchButton;
	
	@FindBy(partialLinkText = "Books")
	WebElement booksLink;
	
	@FindBy(partialLinkText = "Computers")
	WebElement computersLink;
	
	@FindBy(partialLinkText = "Electronics")
	WebElement electronicsLink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	WebElement apparelshoesLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	WebElement digitalDownloadsLink;
	
	@FindBy(partialLinkText = "Jewelry")
	WebElement jewelryLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	WebElement giftCardsLink;
	
	@FindBy(name = "NewsletterEmail")
	WebElement newsletterTextField;
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement subscribeButton;
	
	@FindBy(css = "input[value='1']")
	WebElement excellentRadioButton;
	
	@FindBy(css = "input[value='2']")
	WebElement goodRadioButton;
	
	@FindBy(css = "input[value='3']")
	WebElement poorRadioButton;
	
	@FindBy(css = "input[value='4']")
	WebElement veryBadRadioButton;
	
	@FindBy(id = "vote-poll-1")
	WebElement voteButton;


	public void clickDWSLogo() {
		dwsLogo.click();
	}
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	public void clickShoppingCartLink() {
		shoppingCartLink.click();
	}
	
	public void clickWishlistLink() {
		wishlistLink.click();
	}
	
	public void enterProductName(String product) {
		searchTextField.sendKeys(product);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickBooksLink() {
		booksLink.click();
	}
	
	public void clickComputersLink() {
		computersLink.click();
	}
	
	public void clickElectronicsLink() {
		electronicsLink.click();
	}
	
	public void clickApprelShoesLink() {
		apparelshoesLink.click();
	}
	
	public void clickDigitalDownloadsLink() {
		digitalDownloadsLink.click();
	}
	
	public void clickJewelryLink() {
		jewelryLink.click();
	}
	
	public void clickGiftCardsLink() {
		giftCardsLink.click();
	}	
	
	public void enterNewsLetterName(String newsLetterName) {
		newsletterTextField.sendKeys(newsLetterName);
	}
	
	public void clickSubscribeButton() {
		subscribeButton.click();
	}
	
	public void clickExcellentRadioButton() {
		excellentRadioButton.click();
	}
	
	public void clickGoodRadioButton() {
		goodRadioButton.click();
	}
	
	public void clickPoorRadioButton() {
		poorRadioButton.click();
	}
	
	public void clickVeryBadRadioButton() {
		veryBadRadioButton.click();
	}
	
	public void clickVoteButton() {
		voteButton.click();
	}
}
