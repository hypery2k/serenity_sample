package demo.pages;

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

    @FindBy(id = "search")
    private WebElement searchResults;

    public void findResult(String resultsTerm) {
        element(searchResults).waitUntilVisible();
        waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div#search li.g")));
        List<WebElement> resultList = searchResults.findElements(By.cssSelector("li.g"));

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