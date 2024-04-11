package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static org.testng.Assert.assertTrue;

public class SearchResultStepDefintion {

    public WebDriver driver;
    private PageObjectManager pageObjectManager;
    private JobSearchResultsPage jobSearchResultsPage;

    @Given("I am on the LexisNexis homepage")
    public void i_am_on_the_lexisnexis_homepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\toluc\\IdeaProjects\\automation-excercise-2\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


        driver.get("https://risk.lexisnexis.co.uk/");
        pageObjectManager = new PageObjectManager(driver);

        // Accept cookies if the pop-up is present
        pageObjectManager.getHomePage().acceptCookiesIfPresent();

    }

    @When("I navigate to the Careers page through the {string} dropdown")
    public void i_navigate_to_the_careers_page_through_the_dropdown(String dropdown) throws InterruptedException {

        HomePage homePage = pageObjectManager.getHomePage();
        homePage.navigateToCareersThroughAboutUs();
    }

    @And("I proceed to the new tab opened by the Careers page link")
    public void i_proceed_to_the_new_tab_opened_by_the_careers_page_link() {
        // Switch to the new tab
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    @And("I click on {string}")
    public void i_click_on(String button) {
        if (button.equals("Search all jobs")) {
            CareersPage careersPage = pageObjectManager.getCareersPage();
            careersPage.clickSearchAllJobs();
        }

    }

    @And("I enter {string} into the search box and submit the search")
    public void i_enter_into_the_search_box_and_submit_the_search(String query) throws InterruptedException {
        JobSearchPage jobSearchPage = pageObjectManager.getJobSearchPage();
        jobSearchPage.enterSearchCriteria(query);
        jobSearchPage.clickSearch();
    }

    @Then("I should see at least one result in the search results")
    public void i_should_see_at_least_one_result_in_the_search_results() {
      JobSearchPage jobSearchPage = pageObjectManager.getJobSearchPage();
        boolean hasResults = jobSearchPage.areThereSearchResults();
        assert(hasResults);
    }

}

