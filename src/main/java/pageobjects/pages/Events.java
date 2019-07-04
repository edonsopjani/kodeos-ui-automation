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
    nextButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Next')]]"),
    selectDevice(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,' check_box_outline_blank')]]"),
    moveDevice(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'SELECT')]]"),
    removeDevice(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'REMOVE')]]"),
    dragPoint(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'BO1')]]"),
    dropPoint(PageObjectUtils.LocatorType.XPATH, "//div[text()[contains(.,'Drop Points Here')]]"),
    selectEventClass(PageObjectUtils.LocatorType.XPATH, "//mat-select[@placeholder='Select Event Class']"),
    selectFireClass(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Fire')]]"),
    checkConfigIsAdded(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Light is OFF')]]/../label[contains(.,'1')]"),
    checkConfigIsRemoved(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Light is OFF')]]/../label[contains(.,'0')]"),
    ackEventButton(PageObjectUtils.LocatorType.XPATH, "//button[@mattooltip='Select to Acknowledge']"),
    acknowledgeEvent(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,' Acknowledge ')]]"),
    stateDropDown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@placeholder='State']"),
    stateSelectNone(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'None')]]"),
    eventCreation(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'Create Event')]]"),
    disableConfig(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'toggle_on')]]"),
    enableConfig(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'toggle_off')]]"),
    waitForInactiveElement(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'BO1')]]/../label[text()[contains(.,'Inactive')]]/../../../../../../div[@class='summary-widget-device-header']/label[text()[contains(.,'BR127')]]"),
    waitForActiveElement(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'BO1')]]/../label[text()[contains(.,'Active')]]/../../../../../../div[@class='summary-widget-device-header']/label[text()[contains(.,'BR127')]]"),
    eventsDashboard(PageObjectUtils.LocatorType.ID, "alarms"),
    sites(PageObjectUtils.LocatorType.ID, "buildings"),
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
