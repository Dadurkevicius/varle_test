package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;

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
}
