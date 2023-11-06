package pages;

import org.openqa.selenium.By;

public class SympleHeadingPage extends BasePage{
    By textH1 = By.xpath("//h1[@id='sampleHeading']");

    public boolean validateTextH1() {
        return isElementContainsText(getTextBase(textH1), "This is a sample page".toUpperCase());
    }
}
