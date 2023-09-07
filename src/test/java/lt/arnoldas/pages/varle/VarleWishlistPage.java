package lt.arnoldas.pages.varle;

import lt.arnoldas.pages.Common;
import lt.arnoldas.pages.Locators;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class VarleWishlistPage {
    public static void clickOnFirstThreeHeartIcons(){
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.heartIcons);
        Common.clickOnFirstThreeElements(Locators.Varle.VarleWishlist.heartIcons);
    }
    public static void clickOnFavourites() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.favouritesButton);
        Common.clickOnElement(Locators.Varle.VarleWishlist.favouritesButton);
    }

    public static void clickOnAllUnfavouriteButtons() {
      Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.favouritesHeader);
        List<WebElement> favourites = Common.getElements(Locators.Varle.VarleWishlist.unfavouriteButton);
        while (favourites.size()>0){
            Common.clickOnElement(Locators.Varle.VarleWishlist.unfavouriteButton);
            Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.favouritesHeader);
            favourites = Common.getElements(Locators.Varle.VarleWishlist.unfavouriteButton);
        }
    }

    public static int checkCountOfFavouriteItems() {
        Common.waitForElementToBeVisible(Locators.Varle.VarleWishlist.favoriteItemList);
        return Common.getElements(Locators.Varle.VarleWishlist.favoriteItemList).size();
    }
}

