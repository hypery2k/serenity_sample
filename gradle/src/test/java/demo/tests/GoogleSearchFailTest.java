package demo.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import demo.requirements.Google;
import demo.steps.GoogleSteps;

@RunWith(ThucydidesRunner.class)
@Story(Google.Search.SearchFail.class)
public class GoogleSearchFailTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://www.google.com")
	public Pages pages;

	@Steps
	public GoogleSteps googleSteps;

	@Test
	public void googleSearchFailTest() {
		googleSteps.performSearch("42");
		googleSteps.findSearchResult("Stupidedia");
		googleSteps.verifyUrl("http://www.wikipedia.org/42");

	}
}