package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Tenant implements PageObjects {

    afterHoursHVAC(PageObjectUtils.LocatorType.XPATH, "//a[text()[contains(.,'After hours HVAC')]]"),
    tenantManagement(PageObjectUtils.LocatorType.XPATH, "//a[text()[contains(.,'Tenant Management')]]"),
    workOrders(PageObjectUtils.LocatorType.XPATH, "//a[text()[contains(.,'Work Orders')]]"),
    tenantControl(PageObjectUtils.LocatorType.XPATH, "//a[text()[contains(.,'Devices')]]"),
    afterHoursHVACCheck(PageObjectUtils.LocatorType.XPATH, "//h2[text()[contains(.,'After Hours HVAC')]]"),
    selectHVACOnList(PageObjectUtils.LocatorType.XPATH, "//div[@class='min-w-full flex-grow']//a"),
    clickOverlay(PageObjectUtils.LocatorType.XPATH, "//*[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']"),
    addButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'add')]]"),
    searchInput(PageObjectUtils.LocatorType.XPATH, "//input[@type='search']"),
    selectTenantFilterDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Tenants']"),
    checkCardView(PageObjectUtils.LocatorType.XPATH, "//h4[contains(text(), 'Goat Room')]"),
    checkMapView(PageObjectUtils.LocatorType.XPATH, "//label[contains(text(), 'Goat Room')]"),
    switchToMapView(PageObjectUtils.LocatorType.XPATH, "(//div[@class='flex items-center rounded overflow-hidden bg-white text-primary']//div)[2]"),
    editNameInputField(PageObjectUtils.LocatorType.TAGNAME, "input"),
    tenantControlEditDeviceButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'more_vert')]]"),
    selectBuildingsFilterDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Buildings']"),
    selectStatusesFilterDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Statuses']"),
    selectBuildingDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Building']"),
    selectTenantDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Choose Tenant']"),
    selectFloorDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Choose Floor']"),
    selectCategoryDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Category']"),
    sourceOfIssueDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='type']"),
    issueDescriptionTextArea(PageObjectUtils.LocatorType.XPATH, "//textarea"),
    inputPhotos(PageObjectUtils.LocatorType.XPATH, "//input[@type='file']"),
    selectFirstOption(PageObjectUtils.LocatorType.XPATH, "//mat-option"),
    selectStartDateInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Date Interval']"),
    selectStartTimeInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Start Time']"),
    selectEndTimeInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='End Time']"),
    selectEndDateInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='End Date']"),
    dailyCheckbox(PageObjectUtils.LocatorType.XPATH, "(//div[@class='mat-radio-label-content'])[2]"),
    weeklyCheckbox(PageObjectUtils.LocatorType.XPATH, "(//div[@class='mat-radio-label-content'])[3]"),
    selectTuesday(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Tue')]"),
    selectWen(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Wed')]"),
    selectThu(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Thu')]"),
    selectFri(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Fri')]"),
    selectSat(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Sat')]"),
    selectSun(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Sun')]"),
    selectMon(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Mon')]"),
    submitRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Submit Request')]"),
    submitButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Submit')]"),
    rejectRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Reject')]"),
    approveRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Approve')]"),
    approveTabButton(PageObjectUtils.LocatorType.XPATH, "//a[contains(text(), 'APPROVED')]"),
    completeRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Complete')]"),
    evaluateButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Evaluate')]"),
    rejectButton(PageObjectUtils.LocatorType.XPATH, "//label[contains(text(), 'reject')]"),
    categoryName(PageObjectUtils.LocatorType.ID, "category"),
    saveButton(PageObjectUtils.LocatorType.ID, "submit"),
    vendorCompanyName(PageObjectUtils.LocatorType.ID, "companyName"),
    vendorEmail(PageObjectUtils.LocatorType.ID, "companyEmail"),
    vendorServicesDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='services']"),
    deleteButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Delete')]"),
    categoryServices(PageObjectUtils.LocatorType.ID, "type"),
    tenantName(PageObjectUtils.LocatorType.ID, "tenantName"),
    loginButton(PageObjectUtils.LocatorType.ID, "loginBtn"),
    logoutButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'exit_to_app')]]"),
    myProfile(PageObjectUtils.LocatorType.XPATH, "//a[@routerlink='profile']"),
    username(PageObjectUtils.LocatorType.ID, "username"),
    password(PageObjectUtils.LocatorType.ID, "password"),
    tenantEmail(PageObjectUtils.LocatorType.ID, "tenantEmail"),
    userFirstName(PageObjectUtils.LocatorType.ID, "firstName"),
    userLastName(PageObjectUtils.LocatorType.ID, "lastName"),
    description(PageObjectUtils.LocatorType.ID, "description"),
    userEmail(PageObjectUtils.LocatorType.ID, "userEmail"),
    userNumber(PageObjectUtils.LocatorType.ID, "contactNumber"),
    userRole(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='role']"),
    hourlyRateInput(PageObjectUtils.LocatorType.XPATH, "//input[@type='number']"),
    saveChangesButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Save changes')]"),
    gotoLightsTab(PageObjectUtils.LocatorType.XPATH, "//a[contains(text(), 'LIGHTS')]"),
    assignMeButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Assign me')]"),
    markAsDoneButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Mark as Done')]"),
    addTenantUserButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[contains(text(), 'add')]"),
    selectAreasDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Areas']"),
    clickInactiveValueOnPoint(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Inactive')]"),
    tenantBuildingsDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='buildingIds']");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Tenant(PageObjectUtils.LocatorType locator, String id) {
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
