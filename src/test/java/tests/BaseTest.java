package tests;

import manager.AppManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;

public class BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeSuite (alwaysRun = true)
    public void setup(){
        AppManager.init();
    }

    @AfterSuite(alwaysRun = true)
    public void stop(){
        AppManager.tearDown();
    }
}
