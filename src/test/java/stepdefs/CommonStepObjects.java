package stepdefs;

import generalUtils.Randomizer;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonStepObjects {

    protected static WebDriver driver;
    protected static AppiumDriver iosDriver;
    protected static WebDriverWait wait;

    protected String randomGenerated = Randomizer.getInstance().getRand();
    protected int numericRandomGenerated = Randomizer.getInstance().getNumericRand();

    public static void setIosDriver(AppiumDriver webDriver) {
        iosDriver = webDriver;
    }

    public static WebDriver setWebDriver(WebDriver webDriver) {
        driver = webDriver;
        return driver;
    }

    public static void closeIpadDriver() {
        if (iosDriver != null) {
            iosDriver.closeApp();
            iosDriver.quit();
        }
    }

    public static void removeIpadApplication() {
        iosDriver.removeApp("");
    }

    public static void installIpadApplication() {
        iosDriver.installApp("");

    }

    public static void setWebsiteDriver(WebDriver webDriver) {
        driver = webDriver;
    }


    public static void closeDriver() {
        driver.close();
    }
}