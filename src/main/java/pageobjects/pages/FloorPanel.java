package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum FloorPanel implements PageObjects {

    ShowHideNames(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Names')]]"),
    ShowHideZones(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Zones')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    YesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]"),
    OpenInsideMenu(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_vert')]]"),
    ResetButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Reset')]]"),
    ListView(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' List View ')]]"),
    DragDeviceHere(PageObjectUtils.LocatorType.XPATH, "//div[@class='device-container']"),
    DragPointHere(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Drop Points Here ')]]"),
    CatchDevice(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'BR126')]]"),
    CatchPoint(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'DEV277126_systemStatus')]]"),
    EditFloor(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' edit')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    FloorPanel(PageObjectUtils.LocatorType locator, String id) {
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
