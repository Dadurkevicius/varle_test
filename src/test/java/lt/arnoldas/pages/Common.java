package lt.arnoldas.pages;

import lt.arnoldas.utilities.Driver;
import org.openqa.selenium.By;
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

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static List<String> getSearchResultPrices(By locator) {

        List<WebElement> pricesInEuros = getElements(locator);
        List<WebElement> followingSiblings = getElements(Locators.Varle.VarleSearch.centsOfSearchResults);
        List<String> searchPriceResults = new ArrayList<>();

        for (int i = 0; i < pricesInEuros.size(); i++) {
            String finalText;
            String siblingText = followingSiblings.get(i).getText();
            if (!siblingText.equals(" €")) {
                finalText = pricesInEuros.get(i).getText() + siblingText;
            } else {
                finalText = pricesInEuros.get(i).getText();
            }
            searchPriceResults.add(finalText);
        }
        return searchPriceResults;
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickOnFirstTwoElements(By locator) {
        List<WebElement> elements = getElements(locator);
        elements.get(0).click();
        elements.get(1).click();
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
    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }
    public static void selectOptionByValue(By locator, String selectValue) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(selectValue);
    }

}

