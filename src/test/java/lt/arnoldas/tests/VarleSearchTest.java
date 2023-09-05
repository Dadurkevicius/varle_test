package lt.arnoldas.tests;

import lt.arnoldas.pages.varle.VarleHomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VarleSearchTest extends BaseTest{
    @BeforeMethod
    @Override
    public void setUp() {
        VarleHomePage.open();
        VarleHomePage.logInToPage();
    }
    @Test
    public void test(){

    }
}
