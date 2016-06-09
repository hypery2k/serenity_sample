package demo.tests;

import demo.requirements.Wikipedia;
import demo.steps.WikipediaEndUserSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Wikipedia.Search.SearchByMultipleKeywords.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("searchData.csv")
public class CsvSearchByKeywordStoryTest {

    @Managed
    WebDriver driver;

    String keyword;
    String definition;

    @Qualifier
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Steps
    public WikipediaEndUserSteps endUser;

    @Test
    public void searching_by_keyword_should_display_the_corresponding_article() {
        endUser.is_the_home_page();
        endUser.looks_for(getKeyword());
        endUser.should_see_definition(getDefinition());
    }

}