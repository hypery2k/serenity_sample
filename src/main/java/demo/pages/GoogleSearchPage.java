package demo.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://google.com")
public class GoogleSearchPage extends PageObject {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type=\"search\"]|//input[@type=\"text\"]")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@target=\"_top\"]")
    private WebElement signInButton;

    public void clickOnSignIn() {
        element(signInButton).waitUntilVisible();
        signInButton.click();
    }

    public void inputTerm(String searchTerm) {
        element(searchInput).waitUntilVisible();
        element(searchInput).typeAndEnter(searchTerm);
    }

    public void clickOnSearch() {
        element(searchButton).waitUntilVisible();
        searchButton.click();
    }

}