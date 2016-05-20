package demo.tests;

import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleLoginTest {

	@Managed//(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://www.google.com")
	public Pages pages;

	@Steps
	public GoogleSteps googleSteps;

	@Test
	public void performLogin() {
		googleSteps.clickOnSignIn();
		googleSteps.performLogin("google@gmail.com", "pass");
	}

}