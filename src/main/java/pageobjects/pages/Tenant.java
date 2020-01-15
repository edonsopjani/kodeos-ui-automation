package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Tenant implements PageObjects {

    afterHoursHVAC(PageObjectUtils.LocatorType.XPATH, "//a[text()[contains(.,'After Hours HVAC')]]"),
    afterHoursHVACCheck(PageObjectUtils.LocatorType.XPATH, "//h2[text()[contains(.,'After Hours HVAC')]]"),
    selectHVACOnList(PageObjectUtils.LocatorType.XPATH, "//div[@class='min-w-full flex-grow']//a"),
    addButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[text()[contains(.,'add')]]"),
    searchInput(PageObjectUtils.LocatorType.XPATH, "//input[@type='search']"),
    selectTenantFilterDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Tenants']"),
    selectBuildingsFilterDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Buildings']"),
    selectStatusesFilterDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Statuses']"),
    selectBuildingDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Building']"),
    selectTenantDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Choose Tenant']"),
    selectFloorDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Choose Floor']"),
    selectCategoryDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Category']"),
    issueDescriptionTextArea(PageObjectUtils.LocatorType.XPATH, "//textarea"),
    inputPhotos(PageObjectUtils.LocatorType.XPATH, "//input[@type='file']"),
    selectFirstOption(PageObjectUtils.LocatorType.XPATH, "//mat-option"),
    selectStartDateInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Date Interval']"),
    selectStartTimeInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Start Time']"),
    selectEndTimeInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='End Time']"),
    selectEndDateInput(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder=End Date']"),
    dailyCheckbox(PageObjectUtils.LocatorType.XPATH, "(//div[@class='mat-radio-label-content'])[2]"),
    weeklyCheckbox(PageObjectUtils.LocatorType.XPATH, "(//div[@class='mat-radio-label-content'])[3]"),
    selectTuesday(PageObjectUtils.LocatorType.XPATH, "//div[contains(text(), 'Tue')]"),
    submitRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Submit Request')]"),
    rejectRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Reject')]"),
    approveRequestButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Approve')]"),
    categoryName(PageObjectUtils.LocatorType.ID, "category"),
    saveButton(PageObjectUtils.LocatorType.ID, "submit"),
    vendorCompanyName(PageObjectUtils.LocatorType.ID, "companyName"),
    vendorEmail(PageObjectUtils.LocatorType.ID, "companyEmail"),
    vendorServicesDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='services']"),
    deleteButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Delete')]"),
    categoryServices(PageObjectUtils.LocatorType.ID, "type"),
    tenantName(PageObjectUtils.LocatorType.ID, "tenantName"),
    tenantEmail(PageObjectUtils.LocatorType.ID, "tenantEmail"),
    userFirstName(PageObjectUtils.LocatorType.ID, "firstName"),
    userLastName(PageObjectUtils.LocatorType.ID, "lastName"),
    userEmail(PageObjectUtils.LocatorType.ID, "userEmail"),
    userNumber(PageObjectUtils.LocatorType.ID, "contactNumber"),
    userRole(PageObjectUtils.LocatorType.XPATH, "//mat-select[@formcontrolname='role']"),
    hourlyRateInput(PageObjectUtils.LocatorType.XPATH, "//input[@type='number']"),
    saveChangesButton(PageObjectUtils.LocatorType.XPATH, "//span[contains(text(), 'Save changes')]"),
    addTenantUserButton(PageObjectUtils.LocatorType.XPATH, "//mat-icon[contains(text(), 'add')]"),
    selectAreasDropdown(PageObjectUtils.LocatorType.XPATH, "//mat-select[@aria-label='Select Areas']"),
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
