package herokoapp.pages;

import herokoapp.manager.AppManagerHerokoApp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePageHA{

   By btnNestedFrames = By.xpath("//a[@href='/nested_frames']");
//    @FindBy(xpath = "//a[@href='/nested_frames']")
//    WebElement btnNestedFrames;
//    @FindBy(xpath="//li")
//    List<WebElement> listOfLinks;

    public void navigateToFramePage() {
        AppManagerHerokoApp.getDriver().navigate().to("https://the-internet.herokuapp.com/frames");
    }

    public void clickBtnNestedFrames() {
        clickBase(btnNestedFrames);
    }

}
