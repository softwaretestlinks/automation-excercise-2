package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage {
    private WebDriver driver;

    // Locator for "Search all jobs" button
    private By searchAllJobsButton = By.xpath("/html/body/div[2]/div[1]/div/div/div/a");

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSearchAllJobs() {
        driver.findElement(searchAllJobsButton).click();
    }
}
