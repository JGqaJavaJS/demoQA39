package tests;

import org.testng.annotations.Test;
import pages.BasePage;

public class LinksPageTests extends BaseTest {

    @Test
    public void handleTests() {
        linksPage.navigateToLinkPage();
        linksPage.clickLinkSimple();
        softAssert.assertEquals(linksPage.getHandlesQuantity(), 2, "quantity 2?");
        linksPage.switchHandleTab(1);
        softAssert.assertTrue(mainPage.validateElementH5ExistOnThePage(), "element on the page");
        linksPage.switchHandleTab(0);
        linksPage.clickLinkDynamic();
        softAssert.assertEquals(linksPage.getHandlesQuantity(), 3, "quantity 3?");
        linksPage.switchHandleTab(1);
        softAssert.assertTrue(mainPage.validateElementH5ExistOnThePage(), "element on the page");
        softAssert.assertAll();
    }
}
