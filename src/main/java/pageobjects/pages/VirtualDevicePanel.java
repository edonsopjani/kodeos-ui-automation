package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum VirtualDevicePanel implements PageObjects {

    SetupVirtualDevicesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Virtual Devices')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'save')]]"),
    AddButton(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'add')]]"),
    VirtualDeviceName(PageObjectUtils.LocatorType.XPATH, "//input[@ng-reflect-placeholder='Device Name']"),
    CreateVirtualDevice(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Create')]]"),
    MoveToVirtual(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'MOVE')]]"),
    MoveToDevice(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'REMOVE POINTS')]]"),
    Confrim(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Confirm')]]"),
    CheckBox(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'check_box_outline_blank')]]"),
    CheckPointsAreMoved(PageObjectUtils.LocatorType.XPATH, "//*[@class='device-point-count' and contains(text(), '12')]"),
    DeleteVirtualDevice(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'delete')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    VirtualDevicePanel(PageObjectUtils.LocatorType locator, String id) {
        this.locator = locator;
        this.id = id;
    }

    public void initializeMap() {}


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
