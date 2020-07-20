package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Audit implements PageObjects {

    auditButton(PageObjectUtils.LocatorType.ID, "audit"),
    addTemplate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Add a template')]]"),
    allBuildings(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' All Buildings ')]]"),
    editTemplate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Template')]]"),
    deleteTemplate(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete Template')]]"),
    addTemplateButton(PageObjectUtils.LocatorType.XPATH, "//div[@class='menu-option ng-star-inserted']"),
    exportCSV(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Export CSV')]]"),
    saveAsNew(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save As New')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Save')]]"),
    pointSelection(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Point Selection ')]]"),
    saveFilters(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save Filters')]]"),
    applyButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Apply')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Yes')]]"),
    addTemplateName(PageObjectUtils.LocatorType.ID, "templateName"),
    addFilterName(PageObjectUtils.LocatorType.XPATH, "//div[@class='dialog-container']//input"),
    addTemplateDescription(PageObjectUtils.LocatorType.XPATH, "templateDescription"),
    next(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Next')]]"),
    saveFiltersButton(PageObjectUtils.LocatorType.XPATH, "//div[@class='dialog-container']//span[text()[contains(.,'Save')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    Audit(PageObjectUtils.LocatorType locator, String id) {
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
