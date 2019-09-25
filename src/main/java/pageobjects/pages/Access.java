package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Access implements PageObjects {

    accessButton(PageObjectUtils.LocatorType.ID, "access"),
    createRequestButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'post_add')]]"),
    userInput(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='user']"),
    buildingInput(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='buildings']"),
    startInput(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='from']"),
    shiftInput(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='shift']"),
    endInput(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='to']"),
    reasonInput(PageObjectUtils.LocatorType.XPATH, "//textarea[@formcontrolname='reason']"),
    deleteButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'delete_outline')]]"),
    rejectButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Reject ')]]"),
    approveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Approve ')]]"),
    shift(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'8:00')]]"),
    deletedSuccessfully(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Deleted Successfully')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Save')]]"),
    archiveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Archives')]]"),
    allBuildings(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'All Buildings')]]"),
    confirmButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Confirm ')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Access(PageObjectUtils.LocatorType locator, String id) {
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
