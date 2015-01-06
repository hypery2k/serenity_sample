package demo.pages;

import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

		theFor: for (WebElement elementNow : resultList) {
			if (elementNow.getText().contains(resultsTerm)) {
				element(elementNow).waitUntilPresent();
				elementNow.findElement(By.cssSelector("h3.r a")).click();
				break theFor;
			}
		}
	}
}