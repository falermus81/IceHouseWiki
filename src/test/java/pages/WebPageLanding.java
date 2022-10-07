package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageArticle;

public class WebPageLanding extends WebPageBase {
    public By searchInput = By.id("searchInput");
    public By searchButton = By.id("searchButton");
    public WebPageLanding(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToArticle() {
        webPageArticle = new WebPageArticle(this.webDriver);
    }
}
