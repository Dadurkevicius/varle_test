package lt.arnoldas.pages;

import lt.arnoldas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    public static void clickOnFirstElement(By locator) {
        List<WebElement> elements = getElements(locator);
        elements.get(0).click();
    }

    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<String> getSearchResultText(By locator) {

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

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void selectOptionByValue(By locator, String selectValue) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(selectValue);
    }

    public static boolean isElementVisible(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {

        for (int i = 1; i <= (seconds * 2); i++) {
            try {
                Thread.sleep(1500);

                if (isElementVisible(locator)) {
                    return true;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NoSuchElementException e) {
            }
        }

        return false;
    }
}

