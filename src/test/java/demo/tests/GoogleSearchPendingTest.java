package demo.tests;

import demo.requirements.Google;
import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@Story(Google.Search.SearchPending.class)
public class GoogleSearchPendingTest {

    @Managed
    WebDriver driver;

    @Steps
    GoogleSteps googleSteps;

    @Test
    @Pending
    @Title("This test will not be run. #2")
    public void googleSearchPendingTest() {
        googleSteps.performSearch("evozon");
        googleSteps.findSearchResult(" on Twitter");
        googleSteps.verifyUrl("twitter.com/evozon");

    }
}