package demo.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issues;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import demo.steps.GoogleSteps;

@RunWith(SerenityRunner.class)
public class GoogleLoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://www.google.com")
	public Pages pages;

	@Steps
	public GoogleSteps googleSteps;

	@Test
	@Issues(value = { "#2" })
	public void performLogin() {
		googleSteps.clickOnSignIn();
		googleSteps.performLogin("google@gmail.com", "pass");
	}

}