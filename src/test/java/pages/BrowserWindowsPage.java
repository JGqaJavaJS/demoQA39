package pages;

import manager.AppManager;
import org.openqa.selenium.By;

public class BrowserWindowsPage extends BasePage{

    By btnWindowbtn = By.xpath("//button[@id='windowButton']");
    By btnWindowbtnMessage = By.xpath("//button[@id='messageWindowButton']");

    public void navigateToWindowsPage() {
        AppManager.getDriver().navigate().to("https://demoqa.com/browser-windows");
    }

    public void clickWindowBtn() {
        clickBase(btnWindowbtn);
    }

    public void clickWindowsBtnMessage() {
        clickBase(btnWindowbtnMessage);
    }
}
