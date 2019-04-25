package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageobjects.pages.*;

public class UserProfileStepDefs extends CommonStepObjects {

    @When("^Go to User Profile$")
    public void goToUserProfile() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 15);
        UserProfilePanel.goToUserProfile.getElement().click();
    }

    @Then("^Check If user is at User Profile")
    public void checkUserIsAtUserProfile() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsAtProfilePage.getBy(), 15);
    }

    @Then("^Check If user is at Login Page")
    public void checkUserIsAtLoginPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[@formcontrolname='email']"), 15);
    }

    @When("^User is at User Profile, click change password$")
    public void changePassword() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickChangePassword.getBy(), 15);
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
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 15);
    }

    @Then("^Check if Admin Panel button do not appear$")
    public void checkAdminPanelIsNotVisible() throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, UserProfilePanel.adminPanel.getBy(), 15);
    }

    @Then("^Check if user can't add new Units$")
    public void checkAddUnitIsInvisible() throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, UnitsPanel.addCategory.getBy(), 15);
    }

    @Then("^Check if user can't add new Tags$")
    public void checkAddTagsIsInvisible() throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, TagsPanel.addTag.getBy(), 15);
    }

    @Then("^Check if Template page do not appear$")
    public void checkTemplatesIsNotVisible() throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, UserProfilePanel.templatesPage.getBy(), 15);
    }

    @Then("^Check if Chrysler House Building do not appear at Buildings list$")
    public void checkUnassignedBuildings() throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, UserProfilePanel.chryslerBuilding.getBy(), 15);
    }

    @Then("^Check if Edit Dashboard button is not visible$")
    public void checkEditDashboardButton() throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, DashboardPanel.EditDashboard.getBy(), 15);
    }

    @When("^User Click Terminate Session$")
    public void clickTerminateSession() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickTerminateSession.getBy(), 15);
        UserProfilePanel.clickTerminateSession.getElement().click();

        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.confirmButton.getBy(), 15);
        UserProfilePanel.confirmButton.getElement().click();
    }

    @Then("^Check if User session is terminated$")
    public void checkUserSessionIsTerminated() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 15);
    }

    @When("^User Enter (.*) as username and (.*) as password and click Login$")
    public void loginAs(String username, String password) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[@formcontrolname='email']"), 15);

        driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(password);

        Thread.sleep(1000);
        driver.findElement((By.xpath("//*[contains(text(),'Login')]"))).click();
    }

    @Then("^Check if user role is (.*)$")
    public void checkUserRole(String role) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, role);
    }
}