package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VarleBasketPage {
    public static int checkCountOfBasketItems() {
        return Common.getElements(Locators.Varle.VarleBasket.removeItemButton).size();
    }

    public static void clickOnAllRemoveButtons() {
        Common.waitForElementToBeClickable(Locators.Varle.VarleBasket.removeItemButton);
        List<WebElement> basketItems = Common.getElements(Locators.Varle.VarleBasket.removeItemButton);
        while (basketItems.size()>0){
            Common.clickOnElement(Locators.Varle.VarleBasket.removeItemButton);
            Common.waitForElementToBeClickable(Locators.Varle.VarleBasket.removeItemButton);
            basketItems = Common.getElements(Locators.Varle.VarleBasket.removeItemButton);
        }
    }
    public static boolean isBasketEnabled(){
        Common.waitForElementToBeVisible(Locators.Varle.VarleBasket.buttonBasket);
        return Common.isElementEnabled(Locators.Varle.VarleBasket.buttonBasket);
    }
}
