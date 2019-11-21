package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class PageObjectUtils {

    public static void waitLoadFinish(WebDriver drv) {
        WebDriverWait wait = new WebDriverWait(drv, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
    }

    public static void IsElementVisible(WebDriver driver, LocatorType locatorType, String value, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getElementByLocator(locatorType, value)));
    }

    public static void IsElementVisible(WebDriver driver, By by, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void ElementIsNotVisible(WebDriver driver, By by, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static WebElement ContainsText(WebDriver driver, String value) {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[contains(text(), '" + value + "')]"), 15);
        return driver.findElement(By.xpath("//*[contains(text(), '" + value + "')]"));
    }

    public static WebElement ContainsNumber(WebDriver driver, int value) {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[contains(text(), '" + value + "')]"), 15);
        return driver.findElement(By.xpath("//*[contains(text(), '" + value + "')]"));
    }

    public static void CheckContainsText(WebDriver driver, String value) {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[contains(text(), '" + value + "')]"), 51);
    }

    public static void IsElementClickable(WebDriver driver, LocatorType locatorType, String value, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(getElementByLocator(locatorType, value)));
    }


    public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex) {
            return false;
        }
    }

    public static By getElementByLocator(LocatorType locatorType, String id) {
        switch (locatorType) {
            case CLASSNAME:
                return By.className(id);
            case CSS:
                return By.cssSelector(id);
            case ID:
                return By.id(id);
            case LINK:
                return By.linkText(id);
            case NAME:
                return By.name(id);
            case TAGNAME:
                return By.tagName(id);
            case XPATH:
                return By.xpath(id);
        }
        return null;
    }

    public static WebElement locateElement(WebDriver webDriver, LocatorType type, String ref) {
        switch (type) {
            case ID:
                return webDriver.findElement(By.id(ref));
            case CLASSNAME:
                return webDriver.findElement(By.className(ref));
            case XPATH:
                return webDriver.findElement(By.xpath(ref));
            case CSS:
                return webDriver.findElement(By.cssSelector(ref));
            case LINK:
                return webDriver.findElement(By.linkText(ref));
            case NAME:
                return webDriver.findElement(By.name(ref));
            case TAGNAME:
                return webDriver.findElement(By.tagName(ref));
        }
        return null;
    }

    public static List<WebElement> locateElements(WebDriver webDriver, LocatorType type, String ref) {
        switch (type) {
            case ID:
                return webDriver.findElements(By.id(ref));
            case CLASSNAME:
                return webDriver.findElements(By.className(ref));
            case XPATH:
                return webDriver.findElements(By.xpath(ref));
            case CSS:
                return webDriver.findElements(By.cssSelector(ref));
            case LINK:
                return webDriver.findElements(By.linkText(ref));
            case NAME:
                return webDriver.findElements(By.name(ref));
            case TAGNAME:
                return webDriver.findElements(By.tagName(ref));
        }
        return null;
    }

    public static By locateBy(LocatorType type, String ref) {
        switch (type) {
            case ID:
                return By.id(ref);
            case CLASSNAME:
                return By.className(ref);
            case XPATH:
                return By.xpath(ref);
            case CSS:
                return By.cssSelector(ref);
            case LINK:
                return By.linkText(ref);
            case NAME:
                return By.name(ref);
            case TAGNAME:
                return By.tagName(ref);
        }
        return null;
    }

    public static String filePathForUpload(String fileName) {
        return new File("src/main/resources/fileContainer/" + fileName).getAbsolutePath();
    }

    public enum LocatorType {
        CLASSNAME, CSS, ID, LINK, NAME, TAGNAME, XPATH;
    }
}
