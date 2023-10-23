package pages;

import manager.AppManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    private WebElement findElementBase(By by) {
        return AppManager.getDriver().findElement(by);
    }

    private List<WebElement> findElementsBase(By by) {
        return AppManager.getDriver().findElements(by);
    }

    public boolean isElementExist(By by, int timeout) {
        List<WebElement> list = new ArrayList<>();
        if(timeout == 30) {
            list = findElementsBase(by);
        } else {
            try {
                AppManager.getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
                list = findElementsBase(by);
            } catch (Exception e) {
                e.getMessage();
            } finally {
                AppManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        }
        return (list.size() > 0);
    }

    public void clickBase(By by) {
        WebElement element = findElementBase(by);
        element.click();
    }

    public void sendTextBase(By by, String text) {
        WebElement element = findElementBase(by);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public String getTextBase(By by) {
        WebElement element = findElementBase(by);
        return element.getText().trim().toUpperCase();
    }

    public boolean isElementContainsText(String expectedResult, String actualResult) {
        if (actualResult.contains(expectedResult)) {
            return true;
        } else {
            System.out.println("actual result: " + actualResult +
                    " expected result " + expectedResult);
            return false;
        }
    }

    public void jsClick(String str) {
        JavascriptExecutor js = (JavascriptExecutor) AppManager.getDriver();
        js.executeScript(str);
    }


}
