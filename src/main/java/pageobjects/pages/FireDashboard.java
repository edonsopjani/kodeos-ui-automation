package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum FireDashboard implements PageObjects {

    fireDashboard(PageObjectUtils.LocatorType.XPATH, "//*[@class='fire-dashboard-label options-label']"),
    switchButton(PageObjectUtils.LocatorType.XPATH, "//a[@mattooltip='Switch Board']"),
    threeDots(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'more_vert')]]"),
    addSpecificNote(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Add Note')]]"),
    addGlobalNote(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'Add New')]]"),
    hover(PageObjectUtils.LocatorType.XPATH, "//div[@class='content']"),
    sites(PageObjectUtils.LocatorType.ID, "buildings"),
    messageInput(PageObjectUtils.LocatorType.XPATH, "//textarea[@formcontrolname='message']"),
    deleteButton(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'delete_outline')]]"),
    editButton(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'edit')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Save')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    FireDashboard(PageObjectUtils.LocatorType locator, String id) {
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
