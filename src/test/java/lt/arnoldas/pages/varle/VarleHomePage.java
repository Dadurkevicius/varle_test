package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;

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
    public static void open(){
        Common.setUpEdgeDriver();
        Common.openUrl("https://www.varle.lt/");
    }
    public static void logInToPage(){
        Common.clickOnElement(Locators.Varle.VarleLogin.buttonRegister);
        Common.sendKeysToElement(Locators.Varle.VarleLogin.fieldUserId, VarleHomePage.getUserId());
        Common.sendKeysToElement(Locators.Varle.VarleLogin.fieldUserPassword, VarleHomePage.getUserPassword());
        Common.clickOnElement(Locators.Varle.VarleLogin.buttonLogIn);
    }
    public static void enterSearchText(String text) {
        Common.sendKeysToElement(Locators.Varle.VarleSearch.searchField, text);
    }
    public static void clickOnSearch() {
        Common.clickOnElement(Locators.Varle.VarleSearch.searchField);

    }
    public static void clickOnSearchArrow() {
        Common.clickOnElement(Locators.Varle.VarleSearch.searchArrow);
    }
    public static boolean checkSearchResult(List<String> searchResultCriteria) {
        List<String> searchResults = Common.getSearchResult(Locators.Varle.VarleSearch.itemsOfSearchResult);
        for (String searchResult : searchResults) {
            if (compareResult(searchResult, searchResultCriteria))
                return false;

        }return true;
    }

    private static boolean compareResult(String result, List<String> resultsCriteria){
        for (String criteria : resultsCriteria) {
            if (!result.contains(criteria)){
                return false;
            }
        }
        return true;
    }
}
