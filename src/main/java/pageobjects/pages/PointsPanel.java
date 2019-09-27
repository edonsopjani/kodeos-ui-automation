package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum PointsPanel implements PageObjects {

    WritePoint(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'BO1')]]/../../../div[@class='test-action-container']"),
    TurnOn(PageObjectUtils.LocatorType.XPATH, "//div[@class='selection-control' and text()[contains(.,'Active')]]"),
    TurnOff(PageObjectUtils.LocatorType.XPATH, "//div[@class='selection-control selected' and text()[contains(.,'Inactive')]]"),
    TurnOffAgain(PageObjectUtils.LocatorType.XPATH, "//div[@class='selection-control' and text()[contains(.,'Inactive')]]"),
    EditName(PageObjectUtils.LocatorType.XPATH, "//*[@formcontrolname='name']"),
    ConnectPointsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Connect Points')]]"),
    AddTag(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Add tags to append']"),
    SaveChanges(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,' Save Changes ')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    SaveConnectedPointsButton(PageObjectUtils.LocatorType.XPATH, "//*[@class='action-buttons-container ng-star-inserted']//*[text()[contains(.,'Save')]]"),
    PointsBatchUpdate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Points - Batch Update')]]"),
    RemoveTag(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Add tags to remove']"),
    SavedSuccessfully(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Saved Successfully')]]"),
    ConfirmButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Confirm')]]"),
    EditPointsButton(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='Edit Points']"),
    AddReason(PageObjectUtils.LocatorType.XPATH, "//textarea[@placeholder='Please specify']");

    public PageObjectUtils.LocatorType locator;
    public String id;

    PointsPanel(PageObjectUtils.LocatorType locator, String id) {
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
