package lt.arnoldas.pages;

import lt.arnoldas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void setUpEdgeDriver() {
        Driver.setEdge();
    }

    public static void setUpFirefoxDriver() {
        Driver.setFirefox();
    }

    public static void openUrl(String url) {
        Driver.getInstance().get(url);
    }

    public static void quitDriver() {
        Driver.quitWebDriver();
    }

    public static WebElement getElement(By locator) {
        return Driver.getInstance().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getInstance().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String message) {
        getElement(locator).sendKeys(message);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static List<String> getSearchResult(By locator) {

        List<WebElement> elements = getElements(locator);
        List<String> searchResults = new ArrayList<>();

        for (WebElement element : elements) {
            searchResults.add(element.getText().toLowerCase());
        }
        return searchResults;
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickOnFirstThreeElements(By locator) {
        List<WebElement> elements = getElements(locator);
        elements.get(0).click();
        elements.get(1).click();
        elements.get(2).click();
    }

    public static void clickOnAllElements(By locator) {
        List<WebElement> elements = getElements(locator);
        for (WebElement webElement : elements) {
            webElement.click();
        }
    }

    public static void clickOnFirstElement(By locator) {
        List<WebElement> elements = getElements(locator);
        elements.get(0).click();
    }
}

