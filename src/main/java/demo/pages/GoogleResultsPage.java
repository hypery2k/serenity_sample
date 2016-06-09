package demo.pages;

import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class GoogleResultsPage extends PageObject {

    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    public final static String SEARCH_RESULT_SELECTOR = "//*[@id='search']//*[contains(@class,'srg')]//div[contains(@class,'g')]";

    @FindBy(id = "search")
    private WebElement searchResults;

    @iOSFindBy(uiAutomator = ".elements()[0]")
    private WebElement languagePopUp;

    public void findResult(String resultsTerm) {
        element(searchResults).waitUntilVisible();

        waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(SEARCH_RESULT_SELECTOR)));
        List<WebElement> resultList = searchResults.findElements(By.xpath(SEARCH_RESULT_SELECTOR));

        theFor:
        for (WebElement elementNow : resultList) {
            if (elementNow.getText().contains(resultsTerm)) {
                element(elementNow).waitUntilPresent();
                elementNow.findElement(By.cssSelector("h3.r a")).click();
                break theFor;
            }
        }
    }
}