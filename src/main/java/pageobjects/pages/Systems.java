package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Systems implements PageObjects {

    systemsButton(PageObjectUtils.LocatorType.CSS, ".navigation-item.systems-container"),
    schedulersButton(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,' Schedulers')]]"),
    addSystemButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' add ')]]"),
    systemName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='name']"),
    addTag(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Add tags']"),
    selectType(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Select type')]]"),
    selectChillerWaterPlant(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Chilled Water Plant ')]]"),
    linkOffButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' link_off ')]]"),
    SearchField(PageObjectUtils.LocatorType.CLASSNAME, "search-input"),
    dragDevicesHere(PageObjectUtils.LocatorType.XPATH, "//*[@class='device-container']"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'save')]]"),
    saveChanges(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,' Save ')]]"),
    createButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,' Create ')]]"),
    dragPoint(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'BO1')]]"),
    dropPoint(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Drop Points Here ')]]"),
    editSystem(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit System')]]"),
    editContent(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Content')]]"),
    deleteSystem(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete System')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Yes ')]]"),
    systemsDetails(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'System Details')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Systems(PageObjectUtils.LocatorType locator, String id) {
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
