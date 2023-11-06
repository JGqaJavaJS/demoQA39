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
}
