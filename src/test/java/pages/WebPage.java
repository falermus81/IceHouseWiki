package pages;

import org.openqa.selenium.By;

public interface WebPage {
    void click(By by);
    void sendKeys(By by, String text);
    void assertTitle(String title);
    void assertText(By by, String text);
}
