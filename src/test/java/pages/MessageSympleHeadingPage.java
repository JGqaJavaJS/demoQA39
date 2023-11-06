package pages;

import org.openqa.selenium.By;

public class MessageSympleHeadingPage extends BasePage{
    By text = By.tagName("body");

    public boolean validateTextContains() {
        System.out.println(getTextBase(text));
        return isElementContainsText("Knowledge".toUpperCase(), getTextBase(text));
    }
}
