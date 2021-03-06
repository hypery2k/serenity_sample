package demo.tests;

import demo.requirements.Google;
import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@Story(Google.Search.SearchByKeyword.class)
public class GoogleSearchPassTest {

    @Managed
    WebDriver driver;

    @Steps
    GoogleSteps googleSteps;

    @Test
    public void googleSearchPassTest() {
        googleSteps.performSearch("42");
        googleSteps.findSearchResult("Stupidedia");
        googleSteps.verifyUrl("http://www.stupidedia.org/stupi/42");

    }
}