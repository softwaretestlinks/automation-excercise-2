package pages;//pages.HomePage
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    // Locators
    //private By acceptCookies = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    private By aboutUsDropdown = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[4]/a[1]");
    private By careersLink = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[4]/ul/li/div/div/div/div[2]/div[4]/div[2]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acceptCookiesIfPresent() throws InterruptedException {
        Thread.sleep(5000);
        List<WebElement> acceptButtons = driver.findElements(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Thread.sleep(5000);
        if (!acceptButtons.isEmpty()) {
            acceptButtons.get(0).click();
        }
    }
    public void navigateToCareersThroughAboutUs() throws InterruptedException {
        Thread.sleep(2000);
       // driver.findElement(acceptCookies).click();
        driver.findElement(aboutUsDropdown).click();
        driver.findElement(careersLink).click();
    }
}
