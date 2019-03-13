package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum TagsPanel implements PageObjects {

    addTag(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'add')]]"),
    editTag(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Tag')]]"),
    openTagMenu(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_vert')]]"),
    deleteTag(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete Tag')]]"),
    addTagName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='name']"),
    addTagType(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='type']"),
    addDeviceAsType(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' DEVICE')]]"),
    addTagDescription(PageObjectUtils.LocatorType.XPATH, "//textarea[@formcontrolname='description']"),
    searchTag(PageObjectUtils.LocatorType.XPATH, "//input[@name='search']"),
    saveTag(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Add ')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Yes ')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    TagsPanel(PageObjectUtils.LocatorType locator, String id) {
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
