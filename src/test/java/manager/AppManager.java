package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AppManager {
    static WebDriver driver;

    public static void init() {
        driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void tearDown () {
        driver.quit();
    }

    public static WebDriver getDriver() {
//        if(driver == null) {
//            init();
//        }
        return driver;
    }
}
