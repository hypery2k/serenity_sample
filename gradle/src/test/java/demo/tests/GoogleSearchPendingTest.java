package demo.tests;

import demo.requirements.Google;
import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@Story(Google.Search.SearchPending.class)
public class GoogleSearchPendingTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "https://www.google.com")
    public Pages pages;

    @Steps
    public GoogleSteps googleSteps;

    @Test
    @Pending
    @Title("This test will not be run.")
    public void googleSearchPendingTest() {
        googleSteps.performSearch("evozon");
        googleSteps.findSearchResult(" on Twitter");
        googleSteps.verifyUrl("twitter.com/evozon");

    }
}