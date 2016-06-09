package demo.tests;

import demo.steps.GoogleSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleLoginTest {

	@Managed
	WebDriver driver;

	@Steps
	GoogleSteps googleSteps;

	@Test
	public void performLogin() {
		googleSteps.clickOnSignIn();
		googleSteps.performLogin("google@gmail.com", "pass");
	}

}