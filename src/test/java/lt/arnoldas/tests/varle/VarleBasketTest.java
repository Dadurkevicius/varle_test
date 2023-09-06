package lt.arnoldas.tests.varle;

import lt.arnoldas.pages.varle.VarleBasketPage;
import lt.arnoldas.pages.varle.VarleHomePage;
import lt.arnoldas.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class VarleBasketTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        VarleHomePage.open();
        VarleHomePage.logInToPage();
    }
@Test
    public void testIfPossibleToAddItemToBasket()

    {
        String nameOfGoods = "Laikrodis";
        int expectedBasketItems = 1;
        int actualBasketItems;

        VarleHomePage.clickOnSearch();
        VarleHomePage.enterSearchText(nameOfGoods);
        VarleHomePage.clickOnSearchArrow();
        VarleHomePage.clickOnFirstItem();
        VarleHomePage.clickToAddToBasket();
        VarleHomePage.clickButtonBuy();
        actualBasketItems = VarleBasketPage.checkCountOfBasketItems();

        Assert.assertEquals(actualBasketItems, expectedBasketItems);
    }
    }

