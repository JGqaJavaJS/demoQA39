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

/*
        // Find the iframe using its index (0-based)
        WebElement iframeElement = driver.findElement(By.tagName("iframe"));//li

        // Switch to the iframe by index
        driver.switchTo().frame(iframeElement);

        // Now, interact with elements inside the iframe
        WebElement elementInsideIframe = driver.findElement(By.id("elementInsideIframe"));
        elementInsideIframe.sendKeys("Text inside iframe");

        // Switch back to the main content
        driver.switchTo().defaultContent();
 */