package demo.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import demo.requirements.Wikipedia;
import demo.steps.WikipediaEndUserSteps;

@Story(Wikipedia.Search.SearchByMultipleKeywords.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("searchData.csv")
public class CsvSearchByKeywordStoryTest {

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

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
	public Pages pages;

	@Steps
	public WikipediaEndUserSteps endUser;

	@Test
	public void searching_by_keyword_should_display_the_corresponding_article() {
		endUser.is_the_home_page();
		endUser.looks_for(getKeyword());
		endUser.should_see_definition(getDefinition());
	}

}