package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum PointsPanel implements PageObjects {

    ChooseUnit(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Choose unit']"),
    AddTagEditPoints(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Add tags']"),
    EditName(PageObjectUtils.LocatorType.XPATH, "//*[@formcontrolname='name']"),
    ConnectPointsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Connect Points')]]"),
    AddTag(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Add tags to append']"),
    ThreedotMenu(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_horiz')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    SaveConnectedPointsButton(PageObjectUtils.LocatorType.XPATH, "//*[@class='action-buttons-container ng-star-inserted']//*[text()[contains(.,'Save')]]"),
    PointsBatchUpdate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Points - Batch Update')]]"),
    RemoveTag(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Add tags to remove']"),
    SearchField(PageObjectUtils.LocatorType.CLASSNAME, "search-input"),
    ConfirmButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Confirm')]]"),
    EditPointsButton(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'Edit Points')]]"),
    ClickCheckBox(PageObjectUtils.LocatorType.CSS, ".mat-checkbox-inner-container.mat-checkbox-inner-container-no-side-margin");

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
