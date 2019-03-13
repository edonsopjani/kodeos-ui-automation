package pageobjects.pages;

import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;
import org.openqa.selenium.By;

public enum SitesPanel implements PageObjects {

    Search(PageObjectUtils.LocatorType.XPATH, "//*[@name='search']"),
    ClickMapMarker(PageObjectUtils.LocatorType.XPATH, "//*[@class='leaflet-marker-icon building-cicle leaflet-zoom-animated leaflet-interactive selected']"),
    EditButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit')]]");

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
