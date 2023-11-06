package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.MessageSympleHeadingPage;
import pages.SympleHeadingPage;

public class LinksPageTests extends BaseTest {

    MessageSympleHeadingPage messageSympleHeadingPage = new MessageSympleHeadingPage();
    SympleHeadingPage sympleHeadingPage = new SympleHeadingPage();

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

    @Test
    public void testNewWindow1() {
        browserWindowsPage.navigateToWindowsPage();
        browserWindowsPage.clickWindowBtn();
        softAssert.assertEquals(linksPage.getHandlesQuantity(), 2, "quantity 2?");
        linksPage.switchHandleTab(1);
        softAssert.assertTrue(sympleHeadingPage.validateTextH1(), "text correct");
        softAssert.assertAll();
    }

    @Test
    public void testNewWindow2() {
        browserWindowsPage.navigateToWindowsPage();
        browserWindowsPage.clickWindowsBtnMessage();
        softAssert.assertEquals(linksPage.getHandlesQuantity(), 2, "quantity 2?");
        linksPage.switchHandleTab(1);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        softAssert.assertTrue(messageSympleHeadingPage.validateTextContains(), "text correct");
        softAssert.assertAll();
    }
}
