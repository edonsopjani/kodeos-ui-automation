package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Schedulers implements PageObjects {

    discovery(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Discovery')]]"),
    schedulersButton(PageObjectUtils.LocatorType.ID, "schedulers"),
    calendar(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Calendar')]]"),
    addScheduler(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'add')]]"),
    addSchedulerInList(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'add')]]"),
    removeScheduler(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'remove_circle')]]"),
    disableSchedulerPoint(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'visibility_off')]]"),
    enableSchedulerPoint(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'visibility')]]"),
    selectDay(PageObjectUtils.LocatorType.XPATH, "//mat-select[@placeholder='Day']"),
    selectPeriod(PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-row ng-tns-c29-18 ng-star-inserted']"),
    showSchedulerMenu(PageObjectUtils.LocatorType.XPATH, "//*[@class='more-icon mat-icon notranslate material-icons mat-icon-no-color']"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    closeDropdown(PageObjectUtils.LocatorType.XPATH, "//*[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']");

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
