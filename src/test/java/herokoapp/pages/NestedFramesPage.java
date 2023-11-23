package herokoapp.pages;

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
}
