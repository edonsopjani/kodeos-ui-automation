package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Schedulers implements PageObjects {

    discovery(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Discovery')]]"),
    schedulersButton(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,' Schedulers')]]"),
    calendar(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Calendar')]]"),
    addScheduler(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'add')]]"),
    removeScheduler(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'remove_circle')]]"),
    selectDay(PageObjectUtils.LocatorType.XPATH, "//mat-select[@placeholder='Day']"),
    selectSaturday(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Saturday')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Schedulers(PageObjectUtils.LocatorType locator, String id) {
        this.locator = locator;
        this.id = id;
    }

    public void initializeMap() {
    }

    public WebElement getElement() {
        return PageObjectUtils.locateElement(driver, locator, id);
    }

    public By getBy() {
        return PageObjectUtils.locateBy(locator, id);
    }

    public static String getWebsiteUrl() {
        return PageElementIds.LoginPageIds.WEBSITE_URL.getUrl();
    }
}
