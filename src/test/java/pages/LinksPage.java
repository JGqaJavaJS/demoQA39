package pages;

import manager.AppManager;
import org.openqa.selenium.By;

import java.util.Set;

public class LinksPage extends BasePage{
    // https://demoqa.com/links

    By linkSimple = By.xpath("//a[@id='simpleLink']");
    By linkDynamic = By.xpath("//a[@id='dynamicLink']");

    public void clickLinkDynamic() {
        clickBase(linkDynamic);
    }

    public void clickLinkSimple() {
        clickBase(linkSimple);
    }

    public void navigateToLinkPage() {
        AppManager.getDriver().navigate().to("https://demoqa.com/links");
    }

    public int getHandlesQuantity() {
        // Get the window handles as a set
        Set<String> windowHandles = AppManager.getDriver().getWindowHandles();

        // Get the number of open tabs/windows
        return windowHandles.size();
    }

    public void switchHandleTab(int index) {
        // Get the window handles as a set
        Set<String> windowHandles = AppManager.getDriver().getWindowHandles();

        // Switch to the new tab (assuming it's the second tab, so we'll use index 1)
        String newTabHandle = (String) windowHandles.toArray()[index];
        AppManager.getDriver().switchTo().window(newTabHandle);
        System.out.println("-------------------------------- switch handle with the index " + index);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
