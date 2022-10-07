package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.WebPageLanding;

import static pages.WebPagePool.webPageLanding;
import static pages.WebPagePool.webPageArticle;

public class WebStepLanding {
    @Given("The website {string} is opened using Chrome")
    public void theWebsiteIsOpenedUsingChrome(String webUrl) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(webUrl);
        webPageLanding = new WebPageLanding(webDriver);
    }

    @When("The word {string} is searched in Search Bar")
    public void theWordIsSearchedInSearchBar(String input) {
        webPageLanding.sendKeys(webPageLanding.searchInput, input);
        webPageLanding.click(webPageLanding.searchButton);
        webPageLanding.goToArticle();
    }
}
