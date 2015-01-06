package demo.pages;


import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends PageObject{

	public GoogleSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gbqfq")
	private WebElement searchInput;
	
	@FindBy(id="gbqfbw")
	private WebElement searchButton;
	
	@FindBy(className="gbit")
	private WebElement signInButton;
	
	public void clickOnSignIn(){
		element(signInButton).waitUntilVisible();
		signInButton.click();
	}
	
	public void inputTerm(String searchTerm){
		element(searchInput).waitUntilVisible();
		element(searchInput).typeAndEnter(searchTerm);
	}
	
	public void clickOnSearch(){
		element(searchButton).waitUntilVisible();
		searchButton.click();
	}
	
}