package lt.arnoldas.tests;

import lt.arnoldas.pages.varle.VarleHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class VarleSearchTest extends BaseTest{
    @BeforeMethod
    @Override
    public void setUp() {
        VarleHomePage.open();
        VarleHomePage.logInToPage();
    }
    @Test
    public void testSearchItemLaikrodis(){
        String nameOfGoods = "Laikrodis";
        List<String> searchResultCriteria = Arrays.asList("laikrodis", "apyrankė");
        boolean actualResult;

        VarleHomePage.clickOnSearch();
        VarleHomePage.enterSearchText(nameOfGoods);
        VarleHomePage.clickOnSearchArrow();
        actualResult = VarleHomePage.checkSearchResult(searchResultCriteria);

        Assert.assertTrue(actualResult);
    }
}
