package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

import java.util.List;

public enum Discovery implements PageObjects {

    DiscoverDevicesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Discover Devices')]]"),
    NextButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Next')]]"),
    NewDiscovery(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'New Discovery')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    OKButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Ok')]]"),
    BR129ThreeDotButton(PageObjectUtils.LocatorType.XPATH, "//label[contains(text(),'VAV_5')]/../..//mat-icon[@aria-label='More']"),
    DeleteButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete')]]"),
    YesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]"),
    UpdateDiscovery(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Update')]]"),
    DiscoverButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Discover')]]"),
    RemoveDevices(PageObjectUtils.LocatorType.XPATH, "//i[@mattooltip='Remove Device']"),
    RemovePoints(PageObjectUtils.LocatorType.XPATH, "//i[@mattooltip='Remove Point']"),
    DiscoverSuccessfulMessage(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Discovery completed successfully')]]"),
    ThreeDot(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_vert')]]"),
    AddDevice(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Add')]]"),
    FinishButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Finish')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Discovery(PageObjectUtils.LocatorType locator, String id) {
        this.locator = locator;
        this.id = id;
    }

    public void initializeMap() {}


    public WebElement getElement() {
        return PageObjectUtils.locateElement(driver, locator, id);
    }

    public List<WebElement> getElements() {
        return PageObjectUtils.locateElements(driver, locator, id);
    }

    public By getBy() {
        return PageObjectUtils.locateBy(locator, id);
    }

    public static String getWebsiteUrl() {
        return PageElementIds.LoginPageIds.WEBSITE_URL.getUrl();
    }
}
