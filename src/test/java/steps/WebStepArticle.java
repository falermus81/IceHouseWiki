package steps;

import io.cucumber.java.en.Then;

import static pages.WebPagePool.webPageArticle;

public class WebStepArticle {
    @Then("The article page should have title {string}")
    public void theArticlePageShouldHaveTitle(String title) {
        webPageArticle.assertTitle(title);
    }
}
