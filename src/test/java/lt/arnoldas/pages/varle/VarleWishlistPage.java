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
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.favoritesButton);
        Common.clickOnElement(Locators.Varle.VarleWishlist.favoritesButton);
    }

    public static void clickOnAllUnfavoriteButtons() {
        List<WebElement> favorites = Common.getElements(Locators.Varle.VarleWishlist.unfavoriteButton);
        for (WebElement element : favorites) {
            Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.unfavoriteButton);
            Common.clickOnElement(Locators.Varle.VarleWishlist.unfavoriteButton);
        }
    }

    public static int checkCountOfFavouriteItems() {
        return Common.getElements(Locators.Varle.VarleWishlist.favoriteItemList).size();
    }
}

