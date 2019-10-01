package pageobjects.pages;

import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;
import org.openqa.selenium.By;

public enum SitesPanel implements PageObjects {

    Search(PageObjectUtils.LocatorType.XPATH, "//*[@name='search']"),
    ClickMapMarker(PageObjectUtils.LocatorType.XPATH, "//*[@class='leaflet-marker-icon building-cicle leaflet-zoom-animated leaflet-interactive selected']"),
    sortButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'filter_list')]]"),
    clickSortButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Apply Sort')]]"),
    sortIsApplied(PageObjectUtils.LocatorType.XPATH, "//div[@class='filter-option selected']"),
    sortByEvents(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'arrow_upward')]]"),
    sortByDownDevices(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'arrow_downward')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    SitesPanel(PageObjectUtils.LocatorType locator, String id) {
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
