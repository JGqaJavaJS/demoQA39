package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{

    By textH5Element = By.xpath("//h5[text()='Elements']");

    public boolean validateElementH5ExistOnThePage() {
        return isElementExist(textH5Element, 30);
    }
}
