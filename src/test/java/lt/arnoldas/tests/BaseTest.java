package lt.arnoldas.tests;

import lt.arnoldas.pages.Common;
import lt.arnoldas.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
        Common.quitDriver();
    }
}