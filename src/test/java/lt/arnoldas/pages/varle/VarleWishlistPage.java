package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;

public class VarleWishlistPage {

    public static void clickOnHearts(){
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.heartIcons);
        Common.clickOnElement(Locators.Varle.VarleWishlist.heartIcons);
    }
    public static void clickOnFavourites() {
        Common.clickOnElements(Locators.Varle.VarleWishlist.favouritesButton);
    }

    public static int checkCountOfFavouriteItems() {
        return Common.getElements(Locators.Varle.VarleWishlist.favoriteItemList).size();
    }

    public static void clickOnUnfavouriteButton() {
        Common.clickOnElement(Locators.Varle.VarleWishlist.unfavouriteButton);
    }
}
