package demo.tests;

import demo.requirements.Wikipedia;
import demo.steps.WikipediaEndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Wikipedia.Search.SearchByKeyword.class)
@RunWith(SerenityRunner.class)
public class WikipediaSearchByKeywordStoryIT {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://en.wiktionary.org/wiki/Wiktionary")
    public Pages pages;

    @Steps
    public WikipediaEndUserSteps endUser;

    @Issue("#1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        endUser.is_the_home_page();
        endUser.looks_for("apple");
        endUser.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        endUser.is_the_home_page();
        endUser.looks_for("pear");
        endUser.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
    }

    @Pending
    @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
}