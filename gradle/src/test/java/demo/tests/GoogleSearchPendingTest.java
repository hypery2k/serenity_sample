package demo.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import demo.requirements.Google;
import demo.steps.GoogleSteps;

@RunWith(ThucydidesRunner.class)
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