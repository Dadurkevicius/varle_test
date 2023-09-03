package lt.arnoldas.pages;

import lt.arnoldas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    public static void sendKeysToElement(By locator, String message) {
        getElement(locator).sendKeys(message);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }
}
