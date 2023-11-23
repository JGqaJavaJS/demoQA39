package herokoapp.pages;

import herokoapp.manager.AppManagerHerokoApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends FramePage{

//    @FindBy(xpath="//frame")
//    List<WebElement> allFrames;
    By allFrames = By.xpath("//frame");

//    public int getFramesQuantity() {
//        return allFrames.size();
//    }

    public int getFramesQuantity() {
        return listOfElementsSize(allFrames);
    }

    public void switchToFrame(int number) {
        AppManagerHerokoApp.getDriver().switchTo().frame(findElementsBase(allFrames).get(number));
    }

    public void switchToDefaultContent() {
        AppManagerHerokoApp.getDriver().switchTo().defaultContent();
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
