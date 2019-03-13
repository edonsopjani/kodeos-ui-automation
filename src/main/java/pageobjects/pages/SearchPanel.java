package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum SearchPanel implements PageObjects {

    Search(PageObjectUtils.LocatorType.ID, "search"),
    SearchField(PageObjectUtils.LocatorType.CLASSNAME, "search-overlay-input"),
    BuildingsName(PageObjectUtils.LocatorType.XPATH, "//*[contains(text(), 'View All')]"),
    AreasName(PageObjectUtils.LocatorType.XPATH, "//*[contains(text(), 'View All')]"),
    DevicesName(PageObjectUtils.LocatorType.XPATH, "//*[contains(text(), 'View All')]"),
    ViewAll(PageObjectUtils.LocatorType.XPATH, "//*[contains(text(), 'View All')]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    SearchPanel(PageObjectUtils.LocatorType locator, String id) {
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
