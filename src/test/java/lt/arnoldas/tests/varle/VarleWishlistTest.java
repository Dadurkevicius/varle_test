package lt.arnoldas.tests.varle;

import lt.arnoldas.pages.varle.VarleHomePage;
import lt.arnoldas.pages.varle.VarleWishlistPage;
import lt.arnoldas.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VarleWishlistTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        VarleHomePage.open();
        VarleHomePage.logInToPage();
    }

    @Test
    public void testIfItemsCanBeAddedToWishlist() {
        String nameOfGoods = "Laikrodis";
        int expectedFavouriteItems = 1;
        int actualFavouriteItems;

        VarleHomePage.clickOnSearch();
        VarleHomePage.enterSearchText(nameOfGoods);
        VarleHomePage.clickOnSearchArrow();
        VarleWishlistPage.clickOnHeart();
        VarleWishlistPage.clickOnFavourites();
        actualFavouriteItems = VarleWishlistPage.checkCountOfFavouriteItems();

        Assert.assertEquals(actualFavouriteItems, expectedFavouriteItems);
    }

    @Test
    public void testIfItemsCanBeRemovedFromWishlist() {
        String nameOfGoods = "Batai";
        int expectedFavouriteItems = 0;
        int actualFavouriteItems;

        VarleHomePage.clickOnSearch();
        VarleHomePage.enterSearchText(nameOfGoods);
        VarleHomePage.clickOnSearchArrow();
        VarleWishlistPage.clickOnHeart();
        VarleWishlistPage.clickOnFavourites();
        VarleWishlistPage.clickOnAllUnfavoriteButtons();
        actualFavouriteItems = VarleWishlistPage.checkCountOfFavouriteItems();

        Assert.assertEquals(actualFavouriteItems, expectedFavouriteItems);

    }

}

