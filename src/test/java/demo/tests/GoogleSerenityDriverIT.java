package demo.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class GoogleSerenityDriverIT {

    @Managed
    WebDriver webdriver;

    @Test
    public void legacyTest() {
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
}
