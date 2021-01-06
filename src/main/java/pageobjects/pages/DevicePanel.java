package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum DevicePanel implements PageObjects {

    FiltersButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'filter_list')]]"),
    ConnectorsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'device_hub')]]"),
    ThreedotMenu(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_horiz')]]"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    LocationField(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='location']"),
    DiscoverDevices(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Discover Devices')]]"),
    DeviceBatchUpdate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Devices - Batch Update')]]"),
    PointsBatchUpdate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Points - Apply Template')]]"),
    DeviceDetailsButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Device Details')]]"),
    SearchField(PageObjectUtils.LocatorType.CLASSNAME, "search-input"),
    SearchForConnectors(PageObjectUtils.LocatorType.XPATH, "//*[@placeholder='Search for Connectors']"),
    OpenAttachments(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='Attachments']"),
    AddNoteButton(PageObjectUtils.LocatorType.XPATH, "(//mat-icon[text()[contains(.,'add')]])[3]"),
    EditNameInput(PageObjectUtils.LocatorType.XPATH, "//div[@class='forms-container']//input"),
    ClickEventButton(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='Events']"),
    ShowPastEvents(PageObjectUtils.LocatorType.XPATH, "//label[text()[contains(.,'Show Inactive Events')]]"),
    NoteInputField(PageObjectUtils.LocatorType.XPATH, "//textarea"),
    UploadImage(PageObjectUtils.LocatorType.XPATH, "//input[@accept='image/*']"),
    UploadDocument(PageObjectUtils.LocatorType.XPATH, "(//input[@type='file'])[2]"),
    HoverImage(PageObjectUtils.LocatorType.XPATH, "//div[@class='image-container ng-star-inserted']"),
    HoverDocuments(PageObjectUtils.LocatorType.XPATH, "//div[@class='document-container ng-star-inserted']"),
    HoverNotes(PageObjectUtils.LocatorType.XPATH, "//div[@class='item-container document ng-star-inserted']"),
    DeleteButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Delete')]]"),
    OpenPhotosDialog(PageObjectUtils.LocatorType.XPATH, "//mat-panel-title[text()[contains(.,'Photos')]]"),
    OpenDocumentsDialog(PageObjectUtils.LocatorType.XPATH, "//mat-panel-title[text()[contains(.,'Documents')]]"),
    OpenNotesDialog(PageObjectUtils.LocatorType.XPATH, "//mat-panel-title[text()[contains(.,'Notes')]]"),
    Tag(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Add tags']"),
    AppendTag(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Add tags']"),
    AddPointGroupButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Add New Group')]]"),
    PointToDrag(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'systemStatus')]]"),
    DragPointHere(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Drop Points Here')]]"),
    RemovePointFromTemplate(PageObjectUtils.LocatorType.XPATH, "//*[@class='ungrouped']"),
    UpdatePointButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Update Points')]]"),
    DeleteGroupButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete Group')]]"),
    EditGroupButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Groups')]]"),
    EditDeviceButton(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='Edit Device']"),
    EditButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit')]]"),
    CheckDiscover(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Discovery completed successfully.')]]"),
    ContinueButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Continue ')]]"),
    DeviceDetailsPopUp(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='Device Details']"),
    EditPointsButton(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='Edit Points']"),
    DeviceReferences(PageObjectUtils.LocatorType.XPATH, "//div[@mattooltip='References']"),
    ChangeView(PageObjectUtils.LocatorType.XPATH, "//button[@class='menu-item bottom-aligned no-borders']"),
    ClickPopUp(PageObjectUtils.LocatorType.XPATH, "//span[@class='mat-option-text']"),
    SelectFCUFilter(PageObjectUtils.LocatorType.XPATH, "//label[@class='filters-list-item__name' and contains(text(),'FCU')]"),
    SelectBasementFilter(PageObjectUtils.LocatorType.XPATH, "//label[@class='filters-list-item__name' and contains(text(),'Basement')]"),
    ApplyButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Close')]]"),
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
