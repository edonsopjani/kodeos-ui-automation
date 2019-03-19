package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum UnitsPanel implements PageObjects {

    addCategory(PageObjectUtils.LocatorType.XPATH, "//*[@class='add-category-button ng-star-inserted']"),
    addUnit(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Add Unit')]]"),
    editCategory(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Category')]]"),
    openCategoryMenu(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_vert')]]"),
    deleteCategory(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete Category')]]"),
    saveCategory(PageObjectUtils.LocatorType.XPATH, "//div[@class='actions-container']//*[text()[contains(.,' Add ')]]"),
    addCategoryName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='name']"),
    addUnitName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='_id']"),
    addUnitSymbol(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='symbol']"),
    addUnitCOV(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='covTolerance']"),
    addUnitKeywords(PageObjectUtils.LocatorType.XPATH, "//input[@placeholder='Add Keywords']"),
    choosePrecision(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Choose precision')]]"),
    zeroPrecision(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' O Decimals ')]]"),
    saveUnit(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Add ')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Yes ')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save')]]"),
    deleteUnit(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete')]]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    UnitsPanel(PageObjectUtils.LocatorType locator, String id) {
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
