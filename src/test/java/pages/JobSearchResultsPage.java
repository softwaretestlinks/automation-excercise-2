package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JobSearchResultsPage {
    private WebDriver driver;


    private By searchResultsLocator = By.cssSelector(".search-result");

    public JobSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean areSearchResultsPresent() {

        List<WebElement> searchResults = driver.findElements(searchResultsLocator);
        return !searchResults.isEmpty();
    }
}
