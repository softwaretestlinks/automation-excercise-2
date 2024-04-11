package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JobSearchPage {
    private WebDriver driver;

    // Locators
    private By searchBox = By.xpath("//*[@id=\"search-box-d3ba3a32752d48908f4061d0129326bf\"]");
    private By searchButton = By.id("search-box-button");
    private By searchResults = By.id("searchResultsLocator");

    public JobSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchCriteria(String criteria) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(searchBox).sendKeys(criteria);
        Thread.sleep(5000);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public boolean areThereSearchResults() {
        return !driver.findElements(searchResults).isEmpty();
    }
}
