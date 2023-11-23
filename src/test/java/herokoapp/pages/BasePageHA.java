package herokoapp.pages;

import herokoapp.manager.AppManagerHerokoApp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePageHA {

     private WebElement findElementBase(By by) {
        return AppManagerHerokoApp.getDriver().findElement(by);
    }

    private List<WebElement> findElementsBase(By by) {
        return AppManagerHerokoApp.getDriver().findElements(by);
    }

    public void clickBase(By by) {
         findElementBase(by).click();
    }

    public int listOfElementsSize(By by) {
         return findElementsBase(by).size();
    }

//    public boolean isElementExist(List<WebElement> list) {
//      // List<WebElement> list = new ArrayList<>();
////        if(timeout == 30) {
////            list = findElementsBase(by);
////        } else {
////            try {
////                AppManagerHerokoApp.getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
////                list = findElementsBase(by);
////            } catch (Exception e) {
////                e.getMessage();
////            } finally {
////                AppManagerHerokoApp.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////            }
////        }
//        return (list.size() > 0);
//    }
//
//    public void clickBase(WebElement element) {
//        element.click();
//    }
//
//    public void sendTextBase(WebElement element, String text) {
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//    }
//
//    public String getTextBase(WebElement element) {
//        return element.getText().trim().toUpperCase();
//    }
//
//    public boolean isElementContainsText(String expectedResult, String actualResult) {
//        if (actualResult.contains(expectedResult)) {
//            return true;
//        } else {
//            System.out.println("actual result: " + actualResult +
//                    " expected result " + expectedResult);
//            return false;
//        }
//    }
//
//    public void jsClick(String str) {
//        JavascriptExecutor js = (JavascriptExecutor) AppManagerHerokoApp.getDriver();
//        js.executeScript(str);
//    }
//
//    public void pause(long mil) {
//        try {
//            Thread.sleep(mil);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
