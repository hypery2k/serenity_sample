package demo.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@RunWith(ThucydidesRunner.class)
public class GoogleThucydidesDriverIT {
	@Managed
	public WebDriver webdriver;

	@Test
	public void googleSearchTest() {
		// And now use this to visit Google
		webdriver.get("http://www.google.com");

		// Find the text input element by its name
		WebElement element = webdriver.findElement(By.name("q"));

		// Enter something to search for
		element.sendKeys("Cheese!");

		// Now submit the form. WebDriver will find the form for us from the element
		element.submit();

		// Check the title of the page
		System.out.println("Page title is: " + webdriver.getTitle());
	}
	
  public static void LegazyWebDriverTest(String[] args) {
    // Create a new instance of the html unit driver
    // Notice that the remainder of the code relies on the interface, 
    // not the implementation.
    WebDriver driver = new HtmlUnitDriver();

    // And now use this to visit Google
    driver.get("http://www.google.com");

    // Find the text input element by its name
    WebElement element = driver.findElement(By.name("q"));

    // Enter something to search for
    element.sendKeys("Cheese!");

    // Now submit the form. WebDriver will find the form for us from the element
    element.submit();

    // Check the title of the page
    System.out.println("Page title is: " + driver.getTitle());

    driver.quit();
}
}
