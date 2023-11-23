package herokoapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramesTests extends BaseTestHA{

    @Test
    public void quantityMainFramesTest() throws InterruptedException {
        nestedFramesPage.navigateToFramePage();
        nestedFramesPage.clickBtnNestedFrames();
        int quantity = nestedFramesPage.getFramesQuantity();
//        Thread.sleep(10000);
//        nestedFramesPage.clickBtnNestedFrames();
//        Thread.sleep(10000);
        System.out.println("-----------" + quantity);
//        Assert.assertEquals(nestedFramesPage.getFramesQuantity(), 2);
        Assert.assertEquals(quantity, 2);
    }

    @Test
    public void nestedFramesQuantity() {
        nestedFramesPage.navigateToFramePage();
        nestedFramesPage.clickBtnNestedFrames();
        nestedFramesPage.switchToFrame(0);
        int quantity = nestedFramesPage.getFramesQuantity();
        System.out.println("-----------" + quantity);
        Assert.assertEquals(quantity, 3);
    }


}
