package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageObjectManager;

public class TestSetup {
    private WebDriver driver;
    private PageObjectManager pageObjectManager;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        pageObjectManager = new PageObjectManager(driver);
    }


    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
