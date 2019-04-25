package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum Routines implements PageObjects {

    menu(PageObjectUtils.LocatorType.CLASSNAME, "mat-button-wrapper"),
    routines(PageObjectUtils.LocatorType.ID, "routines"),
    addRoutineButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'warning')]]"),
    threeDotButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'more_vert')]]"),
    searchField(PageObjectUtils.LocatorType.CLASSNAME, "search-input"),
    editRoutine(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Edit Routine')]]"),
    deleteRoutine(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Delete Routine')]]"),
    routineName(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='name']"),
    routineDescription(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='description']"),
    alarmType(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='alarmType']"),
    offSetPoint(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'OffSetPoint')]]"),
    saveRoutine(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Save Routine')]]"),
    yesButton(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,' Yes ')]]"),
    saveButton(PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'Save')]]"),
    dragBooleanPoint(PageObjectUtils.LocatorType.ID, "Boolean Point"),
    dropPoint(PageObjectUtils.LocatorType.CSS, ".rete-background.default");


    public PageObjectUtils.LocatorType locator;
    public String id;

    Routines(PageObjectUtils.LocatorType locator, String id) {
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
