package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum BuildingPanel implements PageObjects {

    AreasTab(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Areas')]]"),
    UsersTab(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Users')]]"),
    ConnectorsMenu(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'edit')]]"),
    Edit(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit')]]"),
    AddConnector(PageObjectUtils.LocatorType.XPATH, "//i[text()[contains(.,'add')]]"),
    ContainerForUserTab(PageObjectUtils.LocatorType.XPATH, "//mat-dialog-container[@tabindex='-1']"),
    OpenMenu(PageObjectUtils.LocatorType.CSS, ".fab-toggler.mat-fab.mat-accent"),
    GoToUserTab(PageObjectUtils.LocatorType.CSS, ".admin-buildings-tabs-container__tabs.tab-users"),
    GoToConnectorTab(PageObjectUtils.LocatorType.CSS, ".admin-buildings-tabs-container__tabs.tab-connectors"),
    ThreedotMenu(PageObjectUtils.LocatorType.XPATH, "//mat-icon[@aria-label='More']"),
    SaveButton(PageObjectUtils.LocatorType.XPATH, "//i[contains(text(), 'save')]"),
    DeleteAreas(PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper' and contains(text(), 'Delete')]"),
    AddMultipleFloor(PageObjectUtils.LocatorType.XPATH, "//i[contains(text(), 'playlist_add')]"),
    AddFloor(PageObjectUtils.LocatorType.XPATH, "//i[contains(text(), 'exposure_plus_1')]"),
    AssignUsers(PageObjectUtils.LocatorType.XPATH, "//i[contains(text(), 'group_add')]"),
    RemoveUsers(PageObjectUtils.LocatorType.XPATH, "//i[contains(text(), 'delete_outline')]"),
    AddFloorOverlay(PageObjectUtils.LocatorType.XPATH, "//input[@type='file' and @accept='.svg']"),
    CheckFloorOverlay(PageObjectUtils.LocatorType.XPATH, "//*[@class='leaflet-zoom-animated']"),
    CheckBuildingImage(PageObjectUtils.LocatorType.XPATH, "//div[@class='content leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']"),
    AddImage(PageObjectUtils.LocatorType.XPATH, "//input[@type='file' and @accept='.jpg, .jpeg, .png']"),
    AddBuildingImage(PageObjectUtils.LocatorType.XPATH, "//input[@type='file']"),
    AddNewBuildingButton(PageObjectUtils.LocatorType.CSS, ".material-icons.add-icon"),
    SearchField(PageObjectUtils.LocatorType.CLASSNAME, "search-input"),
    SecondSearchField(PageObjectUtils.LocatorType.XPATH, "//input[@name='search']"),
    CheckBox(PageObjectUtils.LocatorType.CSS, ".mat-checkbox.mat-accent"),
    Name(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='name']"),
    UserName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='username']"),
    Password(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='password']"),
    Protocol(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='protocol']"),
    AreaConnectors(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='area']"),
    Port(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='port']"),
    Model(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='model']"),
    IP(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='ip']"),
    SelectHTTP(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'http')]]"),
    SelectArea(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'TEST')]]"),
    Description(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='description']"),
    From(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='from']"),
    To(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='to']"),
    Address1(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='address1']"),
    Address2(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='address2']"),
    ZipCode(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='zip']"),
    City(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='city']"),
    State(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='state']"),
    ClickDeactivate(PageObjectUtils.LocatorType.XPATH, "//i[@ng-reflect-message='Deactivate']"),
    ClickCreateAccountButton(PageObjectUtils.LocatorType.XPATH, "//i[@ng-reflect-message='Create Account']"),
    ClickUpdateEmail(PageObjectUtils.LocatorType.XPATH, "//i[@ng-reflect-message='Update User Email']"),
    ClickChangePassword(PageObjectUtils.LocatorType.XPATH, "//i[@ng-reflect-message='Change Password']"),
    ClickUpdateRole(PageObjectUtils.LocatorType.XPATH, "//i[@ng-reflect-message='Update User Role']"),
    AdminPanel(PageObjectUtils.LocatorType.ID, "admin_panel"),
    Country(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='country']"),
    EnterFirstName(PageObjectUtils.LocatorType.XPATH, "//*[@formcontrolname='firstName']"),
    EnterLastName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='lastName']"),
    EnterEmail(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='email']"),
    EnterPhone(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='phone']"),
    EnterPosition(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='position']"),
    EnterRole(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='role']"),
    ClickCreateAccount(PageObjectUtils.LocatorType.CLASSNAME, "mat-slide-toggle-thumb"),
    EnterPassword(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='password']"),
    Latitude(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='lat']"),
    Longitude(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='lng']"),
    Year(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='yearBuild']"),
    Area(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='value']"),
    Save(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Save ')]]"),
    CheckConnection(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'cached')]]"),
    FirstName(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'First Name')]]"),
    AddNewUser(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'person_add')]]"),
    LastName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='lastName']"),
    OpenBuilding(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Auto Test Building')]]"),
    OpenBuildingTab(PageObjectUtils.LocatorType.XPATH, "//*[@class='tab-text' and contains(text(), 'Buildings')]"),
    DeleteAssignBuildings(PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper']//*[contains(text(), 'edit')]"),
    CheckEditButton(PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper']//*[contains(text(), 'edit')]"),
    DeleteButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete')]]"),
    ConfirmationYesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]"),
    CheckIsRemoved(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]"),
    EditButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    BuildingPanel(PageObjectUtils.LocatorType locator, String id) {
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
