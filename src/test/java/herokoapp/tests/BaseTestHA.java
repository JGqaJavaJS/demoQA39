package herokoapp.tests;

import herokoapp.manager.AppManagerHerokoApp;
import herokoapp.pages.FramePage;
import herokoapp.pages.NestedFramesPage;
import manager.AppManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestHA {

    NestedFramesPage nestedFramesPage = new NestedFramesPage();
    @BeforeSuite(alwaysRun = true)
    public void setup(){
        AppManagerHerokoApp.init();
    }

    @AfterSuite(alwaysRun = true)
    public void stop(){
        AppManagerHerokoApp.tearDown();
    }
}

