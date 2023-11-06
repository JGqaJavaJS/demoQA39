package tests;

import manager.AppManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import pages.*;

public class BaseTest {

    MainPage mainPage = new MainPage();
    LinksPage linksPage = new LinksPage();
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
    SoftAssert softAssert = new SoftAssert();

    @BeforeSuite (alwaysRun = true)
    public void setup(){
        AppManager.init();
    }

    @AfterSuite(alwaysRun = true)
    public void stop(){
        AppManager.tearDown();
    }
}
