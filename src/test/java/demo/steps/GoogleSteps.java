package demo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import demo.pages.GoogleLoginPage;
import demo.pages.GoogleResultsPage;
import demo.pages.GoogleSearchPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSteps extends ScenarioSteps {

	private static final long serialVersionUID = 5416584546042922230L;

	public GoogleSteps(Pages pages) {
		super(pages);
	}

	public GoogleSearchPage googleSearchPage() {
		return getPages().currentPageAt(GoogleSearchPage.class);
	}

	public GoogleResultsPage googleResultsPage() {
		return getPages().currentPageAt(GoogleResultsPage.class);
	}

	public GoogleLoginPage googleLoginPage() {
		return getPages().currentPageAt(GoogleLoginPage.class);
	}

	@Step
	public void inputEmail(String email) {
		googleLoginPage().inputUserName(email);
	}

	@Step
	public void inputPassword(String pass) {
		googleLoginPage().inputPassword(pass);
	}

	@Step
	public void clickOnLogin() {
		googleLoginPage().clickOnLogin();
	}

	@StepGroup
	public void performLogin(String email, String pass) {
		inputEmail(email);
		inputPassword(pass);
		clickOnLogin();
	}

	@Step
	public void inputSearchTerm(String search) {
		googleSearchPage().inputTerm(search);
	}

	@Step
	public void clickOnSearch() {
		googleSearchPage().clickOnSearch();
	}

	@Step
	public void clickOnSignIn() {
		googleSearchPage().clickOnSignIn();
		waitABit(5000);
	}

	@StepGroup
	public void performSearch(String search) {
		inputSearchTerm(search);
		clickOnSearch();
	}

	@Step
	public void findSearchResult(String search) {
		googleResultsPage().findResult(search);
	}

	/**
	 * Assert the url is in the desired location
	 * 
	 * @param url
	 */
	@Step
	public void verifyUrl(String url) {
		assertThat("Url pattern does not match! ", getDriver().getCurrentUrl().contains(url));
	}
}