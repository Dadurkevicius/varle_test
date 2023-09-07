package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;

public class VarleBasketPage {
    public static int checkCountOfBasketItems() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleBasket.removeItemButton);
        return Common.getElements(Locators.Varle.VarleBasket.removeItemButton).size();
    }
}
