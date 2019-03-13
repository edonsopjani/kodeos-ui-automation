package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum DevicePanel implements PageObjects {

    FiltersButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'filter_list')]]"),
    ConnectorsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'device_hub')]]"),
    ThreedotMenu(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_horiz')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    DiscoverDevices(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Discover Devices')]]"),
    DeviceBatchUpdate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Devices - Batch Update')]]"),
    PointsBatchUpdate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Points - Apply Template')]]"),
    DeviceDetailsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Device Details')]]"),
    SearchField(PageObjectUtils.LocatorType.CLASSNAME, "search-input"),
    SearchForConnectors(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Search for Connectors']"),
    Type(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='type']"),
    Tag(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Add tags']"),
    AppendTag(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Add tags']"),
    AddPointGroupButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Add New Group')]]"),
    PointToDrag(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'DEV277127_systemStatus')]]"),
    DragPointHere(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Drop Points Here')]]"),
    RemovePointFromTemplate(PageObjectUtils.LocatorType.XPATH, "//*[@class='ungrouped']"),
    UpdatePointButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Update Points')]]"),
    DeleteGroupButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete Group')]]"),
    EditPointsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Points')]]"),
    EditGroupButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Groups')]]"),
    EditDeviceButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Device')]]"),
    EditButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit')]]"),
    CheckDiscover(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Discovery completed successfully.')]]"),
    ContinueButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Continue ')]]"),
    DeviceDetailsPopUp(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'info')]]"),
    SelectFCUFilter(PageObjectUtils.LocatorType.XPATH, "//label[@class='filters-list-item__name' and contains(text(),'FCU')]"),
    SelectBasementFilter(PageObjectUtils.LocatorType.XPATH, "//label[@class='filters-list-item__name' and contains(text(),'Basement')]"),
    ApplyButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Apply')]]"),
    ClickCheckBox(PageObjectUtils.LocatorType.CSS, ".mat-checkbox-inner-container.mat-checkbox-inner-container-no-side-margin");

    public PageObjectUtils.LocatorType locator;
    public String id;

    DevicePanel(PageObjectUtils.LocatorType locator, String id) {
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
