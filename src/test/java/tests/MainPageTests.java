package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest{

    @Test
    public void elementTextExistOnTheMainPageTest() {
        Assert.assertTrue(mainPage.validateElementH5ExistOnThePage());
    }
}
