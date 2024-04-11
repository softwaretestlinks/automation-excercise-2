package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private HomePage homePage;
    private CareersPage careersPage;
    private JobSearchPage jobSearchPage;
    private JobSearchResultsPage jobSearchResultsPage;
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public CareersPage getCareersPage() {
        if (careersPage == null) {
            careersPage = new CareersPage(driver);
        }
        return careersPage;
    }

    public JobSearchPage getJobSearchPage() {
        if (jobSearchPage == null) {
            jobSearchPage = new JobSearchPage(driver);
        }
        return jobSearchPage;
    }
    public JobSearchResultsPage getJobSearchResultsPage() {
        if (jobSearchResultsPage == null) {
            jobSearchResultsPage = new JobSearchResultsPage(driver);
        }
        return jobSearchResultsPage;
    }
}

