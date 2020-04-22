package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum UserProfilePanel implements PageObjects {

    goToUserProfile(PageObjectUtils.LocatorType.XPATH, "//*[@routerlink='/profile']"),
    clickLogout(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Logout')]]"),
    adminPanel(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Admin')]]"),
    templatesPage(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Templates')]]"),
    chryslerBuilding(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Chrysler House')]]"),
    checkUserIsAtProfilePage(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'User Super')]]"),
    checkUserIsLoggedOut(PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Log in to your account')]]"),
    clickChangePassword(PageObjectUtils.LocatorType.XPATH, "//i[@mattooltip='Change Password']"),
    clickTerminateSession(PageObjectUtils.LocatorType.XPATH, "//i[@mattooltip='Terminate Session']"),
    enterOldPassword(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='oldPassword']"),
    enterNewPassword(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='password']"),
    confirmNewPassword(PageObjectUtils.LocatorType.XPATH, "//input[@formcontrolname='confirmPassword']"),
    updateButton(PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper' and contains(text(), 'Update')]"),
    confirmButton(PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper' and contains(text(), 'Confirm')]");

    public PageObjectUtils.LocatorType locator;
    public String id;

    UserProfilePanel(PageObjectUtils.LocatorType locator, String id) {
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
