package demo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLoginPage extends PageObject {

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    private WebElement userInput;

    @FindBy(id = "Passwd")
    private WebElement passwordInput;

    @FindBy(id = "signIn")
    private WebElement loginButton;

    public void inputUserName(String emailAddress) {
        element(userInput).waitUntilVisible();
        userInput.sendKeys(emailAddress);
    }

    public void inputPassword(String password) {
        element(passwordInput).waitUntilVisible();
        passwordInput.sendKeys(password);
    }

    public void clickOnLogin() {
        element(loginButton).waitUntilVisible();
        loginButton.click();
    }

}