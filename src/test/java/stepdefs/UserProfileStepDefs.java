package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.UserProfilePanel;

public class UserProfileStepDefs extends CommonStepObjects {

    @When("^Go to User Profile$")
    public void goToUserProfile() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 10);
        UserProfilePanel.goToUserProfile.getElement().click();
    }

    @Then("^Check If user is at User Profile")
    public void checkUserIsAtUserProfile() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsAtProfilePage.getBy(), 15);
    }

    @When("^User is at User Profile, click change password$")
    public void changePassword() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickChangePassword.getBy(), 10);
        UserProfilePanel.clickChangePassword.getElement().click();
    }

    @Then("^Check if password is changed successful$")
    public void checkPasswordIsUpdated() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsAtProfilePage.getBy(), 15);
    }

    @And("^User add existing password then user add new password and click save$")
    public void addNewPassword() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.enterOldPassword.getBy(), 10);
        UserProfilePanel.enterOldPassword.getElement().sendKeys("123456");
        Thread.sleep(1000);
        UserProfilePanel.enterNewPassword.getElement().sendKeys("123456");
        Thread.sleep(1000);
        UserProfilePanel.confirmNewPassword.getElement().sendKeys("123456");
        Thread.sleep(1000);

        UserProfilePanel.updateButton.getElement().click();
    }

    @When("^User Click logout button$")
    public void clickLogout() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickLogout.getBy(), 10);
        UserProfilePanel.clickLogout.getElement().click();
    }

    @Then("^Check if user is logged out$")
    public void checkUserIsLoggedOut() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 10);
    }

    @When("^User Click Terminate Session$")
    public void clickTerminateSession() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickTerminateSession.getBy(), 10);
        UserProfilePanel.clickTerminateSession.getElement().click();
        Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.confirmButton.getBy(), 10);
        UserProfilePanel.confirmButton.getElement().click();
    }

    @Then("^Check if User session is terminated$")
    public void checkUserSessionIsTerminated() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 10);
    }
}
