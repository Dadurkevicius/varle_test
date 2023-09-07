package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VarleHomePage {
    private static String userId = "tester@gmail.com";
    private static String userPassword = "hegS5*taTy.Tikq";

    public static String getUserId() {
        return userId;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void open() {
        Common.setUpEdgeDriver();
        Common.openUrl("https://www.varle.lt/");
    }

    public static void logInToPage() {
        Common.clickOnElement(Locators.Varle.VarleLogin.buttonRegister);
        Common.sendKeysToElement(Locators.Varle.VarleLogin.fieldUserId, VarleHomePage.getUserId());
        Common.sendKeysToElement(Locators.Varle.VarleLogin.fieldUserPassword, VarleHomePage.getUserPassword());
        Common.clickOnElement(Locators.Varle.VarleLogin.buttonLogIn);
    }

    public static void enterSearchText(String text) {
        Common.sendKeysToElement(Locators.Varle.VarleSearch.searchField, text);
    }

    public static void clickOnSearch() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleSearch.searchField);
        Common.clickOnElement(Locators.Varle.VarleSearch.searchField);

    }

    public static void clickOnSearchArrow() {
        Common.clickOnElement(Locators.Varle.VarleSearch.searchArrow);
    }

    public static boolean checkSearchResult(List<String> searchResultCriteria) {
        Common.waitForElementToBeVisible(Locators.Varle.VarleSearch.itemsOfSearchResult);
        List<String> searchResults = Common.getSearchResultText(Locators.Varle.VarleSearch.itemsOfSearchResult);
        for (String searchResult : searchResults) {
            if (compareResult(searchResult, searchResultCriteria))
                return false;
        }
        return true;
    }

    public static List<Double> convertFromSearchElementsToPrices() {

        List<WebElement> pricesInEuros = Common.getElements(Locators.Varle.VarleSearch.pricesOfSearchResults);
        List<WebElement> followingSiblings = Common.getElements(Locators.Varle.VarleSearch.centsOfSearchResults);
        List<Double> convertedSearchPrices = new ArrayList<>();

        for (int i = 0; i < pricesInEuros.size(); i++) {
            String finalText;
            String siblingText = followingSiblings.get(i).getText();
            if (!siblingText.equals(" €")) {
                finalText = pricesInEuros.get(i).getText() + siblingText;
            } else {
                finalText = pricesInEuros.get(i).getText();
            }

            convertedSearchPrices.add(Double.parseDouble(finalText));
        }

        return convertedSearchPrices;
    }

    private static boolean compareResult(String result, List<String> resultsCriteria) {
        for (String criteria : resultsCriteria) {
            if (!result.contains(criteria)) {
                return false;
            }
        }
        return true;
    }

    public static void clickOnFirstItem() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleSearch.itemsOfSearchResult);
        Common.clickOnFirstElement(Locators.Varle.VarleSearch.itemsOfSearchResult);
    }

    public static void clickToAddToBasket() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleSearch.buttonToAddToBasket);
        Common.clickOnElement(Locators.Varle.VarleSearch.buttonToAddToBasket);
    }

    public static void clickButtonBuy() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleSearch.buttonToBuy);
        Common.clickOnElement(Locators.Varle.VarleSearch.buttonToBuy);
    }

    public static void clickOnItemPriceSortButton(String value) {
        Common.selectOptionByValue(Locators.Varle.VarleSearch.selectPriceFilter, value);
        Common.waitForElementToBeVisibleCustomised(Locators.Varle.VarleSearch.selectPriceFilter, 5);
    }

    public static boolean checkIfPricesInDoubleAreDescending(List<Double> prices) {
        boolean answer = false;
        for (int i = 0; i < prices.size() - 1; i++) {
            if (prices.get(i) >= prices.get(i + 1)) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
