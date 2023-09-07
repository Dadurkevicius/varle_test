package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VarleWishlistPage {
    public static void clickOnHeart() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.heartIcons);
        Common.clickOnFirstElement(Locators.Varle.VarleWishlist.heartIcons);
    }

    public static void clickOnFavourites() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.favouritesButton);
        Common.clickOnElement(Locators.Varle.VarleWishlist.favouritesButton);
    }

    public static void clickOnAllUnfavoriteButtons() {
        List<WebElement> favorites = Common.getElements(Locators.Varle.VarleWishlist.unfavouriteButton);
        for (WebElement element : favorites) {
            Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.unfavouriteButton);
            Common.clickOnElement(Locators.Varle.VarleWishlist.unfavouriteButton);
        }
    }

    public static int checkCountOfFavouriteItems() {
        return Common.getElements(Locators.Varle.VarleWishlist.favoriteItemList).size();
    }
}

