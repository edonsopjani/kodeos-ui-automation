package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum DashboardPanel implements PageObjects {

    DevicesButton(PageObjectUtils.LocatorType.XPATH, "//div[@class='navigation-item devices-container']"),
    PointsButton(PageObjectUtils.LocatorType.CSS, " .navigation-item.points-container"),
    ExpandButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'keyboard_arrow_down')]]"),
    CheckFloorList(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Search for Areas']"),
    AddWidget(PageObjectUtils.LocatorType.XPATH, "//*[@name='search']"),
    RemoveSummaryWidget(PageObjectUtils.LocatorType.XPATH, "//*[@class='building-summary-widget-header drag-handler']//*[contains(text(), 'remove_circle_outline')]"),
    RemoveNavigationWidget(PageObjectUtils.LocatorType.XPATH, "//*[@class='building-navigation-widget-header drag-handler']//*[contains(text(), 'remove_circle_outline')]"),
    HideMenu(PageObjectUtils.LocatorType.CSS, ".material-icons.toggle-icon.ng-star-inserted"),
    EditSummaryWidget(PageObjectUtils.LocatorType.XPATH, "//*[@class='building-summary-widget-header drag-handler']//*[contains(text(), 'Edit')]"),
    EditNavigationWidget(PageObjectUtils.LocatorType.XPATH, "//*[@class='building-navigation-widget-header drag-handler']//*[contains(text(), 'Edit')]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'save_alt')]]"),
    FloorsButton(PageObjectUtils.LocatorType.XPATH, "//div[@class='navigation-item floors-container']"),
    EditDashboard(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Dashboard')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    DashboardPanel(PageObjectUtils.LocatorType locator, String id) {
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
