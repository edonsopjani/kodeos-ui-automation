package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.Access;
import pageobjects.pages.FireDashboard;
import pageobjects.pages.PageObjectUtils;

public class FireDashboardStepDefs extends CommonStepObjects {

    @And("^User switch to Fire Dashboard view$")
    public void switchButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.switchButton.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.switchButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, FireDashboard.fireDashboard.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.fireDashboard.getElement().click();
    }

    @And("^Click Sites button$")
    public void clickSitesButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.sites.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.sites.getElement().click();
    }

    @And("^User Click add new note$")
    public void addNewNote() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.addGlobalNote.getBy(), 15);
        FireDashboard.addGlobalNote.getElement().click();
    }

    @And("^User fill note message as (.*) and click add$")
    public void fillMandatoryNotes(String message) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.messageInput.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.messageInput.getElement().sendKeys(message);

        PageObjectUtils.IsElementVisible(driver, FireDashboard.saveButton.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.saveButton.getElement().click();
    }

    @Then("^Check if (.*) note appears on list$")
    public void checkNoteAppears(String message) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, message);
    }

    @And("^User Click add new specific note$")
    public void addNewSpecificNote() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.threeDots.getBy(), 15);
        FireDashboard.threeDots.getElement().click();
        Thread.sleep(1000);
        FireDashboard.addSpecificNote.getElement().click();
    }

    @And("^User Click edit note button$")
    public void clickEditButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.hover.getBy(), 15);
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(FireDashboard.hover.getElement()).click(FireDashboard.editButton.getElement()).build().perform();
    }

    @And("^User change note message to (.*) and click add$")
    public void editNoteMessage(String message) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.messageInput.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.messageInput.getElement().clear();
        FireDashboard.messageInput.getElement().sendKeys(message);

        PageObjectUtils.IsElementVisible(driver, FireDashboard.saveButton.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.saveButton.getElement().click();
    }

    @And("^User Click delete note button$")
    public void clickDeleteNote() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FireDashboard.hover.getBy(), 15);
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(FireDashboard.hover.getElement()).click(FireDashboard.deleteButton.getElement()).build().perform();

        PageObjectUtils.IsElementVisible(driver, FireDashboard.yesButton.getBy(), 15);
        Thread.sleep(1000);
        FireDashboard.yesButton.getElement().click();
    }

    @Then("^Check if note message (.*) is deleted$")
    public void checkNoteIsDeleted(String user) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Access.deletedSuccessfully.getBy(), 15);
    }
}
