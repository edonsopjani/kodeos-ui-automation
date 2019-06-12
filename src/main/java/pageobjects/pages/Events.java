package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Events implements PageObjects {

    events(PageObjectUtils.LocatorType.XPATH, "//div[@class='admin-menu-item ng-star-inserted']//*[text()[contains(.,'Events')]]"),
    addButton(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'add')]]"),
    selectElement(PageObjectUtils.LocatorType.XPATH, "//li[@class='table-list-item ng-star-inserted' and contains(.,'Automation')]"),
    openThreeDotMenu(PageObjectUtils.LocatorType.XPATH, "//li[@class='table-list-item ng-star-inserted' and contains(.,'Automation')]//*[text()[contains(.,'more_vert')]]"),
    addName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='name']"),
    addDescription(PageObjectUtils.LocatorType.XPATH, "//*[@formcontrolname='description']"),
    selectSuperAdmin(PageObjectUtils.LocatorType.XPATH, "//mat-option[@class='mat-option mat-option-multiple ng-star-inserted mat-active']"),
    editButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Edit')]]"),
    typesTab(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'Types')]]"),
    deleteButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Delete')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Yes')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Events(PageObjectUtils.LocatorType locator, String id) {
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
