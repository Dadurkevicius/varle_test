package lt.arnoldas.tests;

import lt.arnoldas.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() { Common.quitDriver(); }
}