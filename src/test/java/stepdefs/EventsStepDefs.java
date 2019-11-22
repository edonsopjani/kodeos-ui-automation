package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.Events;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.PointsPanel;
import pageobjects.pages.Schedulers;

import java.util.List;

public class EventsStepDefs extends CommonStepObjects {

    public int preNrEvents;
    public int afterNrEvents;

    @And("^Click Events tab$")
    public void eventsTab() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Events.events.getBy(), 15);
        Events.events.getElement().click();
    }

    @Then("^Check if user is at Events page$")
    public void checkEventsPageAppears() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Event Configs");
    }

    @And("^User click Add Event$")
    public void addEventPopUp() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Events.addButton.getBy(), 15);
        Events.addButton.getElement().click();
    }

    @Then("^Check if Event Class (.*) Appears on List$")
    public void checkEventClassAppearsOnList(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^User Fill mandatory fields for Event Class$")
    public void fillMandatoryFieldsClass() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Events.addName.getBy(), 15);
        Events.addName.getElement().sendKeys("Automation");
        Events.addDescription.getElement().sendKeys("Test Description");

        List<WebElement> roles = driver.findElements(By.xpath("//mat-select[@formcontrolname='roles']"));

        roles.get(0).click();
        Events.selectSuperAdmin.getElement().click();

        Schedulers.closeDropdown.getElement().click();
        Thread.sleep(500);

        roles.get(1).click();
        Events.selectSuperAdmin.getElement().click();

        Schedulers.closeDropdown.getElement().click();
        Thread.sleep(500);

        roles.get(2).click();
        Events.selectSuperAdmin.getElement().click();

        Schedulers.closeDropdown.getElement().click();
        Thread.sleep(500);

        Events.saveButton.getElement().click();
    }

    @And("^User Click edit button$")
    public void editButtonEvents() throws Throwable {
        Thread.sleep(500);

        Actions action = new Actions(driver);
        action.moveToElement(Events.selectElement.getElement()).click(Events.openThreeDotMenu.getElement()).build().perform();

        Thread.sleep(500);

        Events.editButton.getElement().click();
    }

    @And("^User Fill mandatory fields for Event Type$")
    public void typeFillMandatoryFields() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Events.addName.getBy(), 15);
        Events.addName.getElement().sendKeys("Automation");
        Thread.sleep(500);
        Events.addDescription.getElement().sendKeys("Test Description");
        Thread.sleep(500);
        Events.saveButton.getElement().click();
    }

    @And("^User change Event name to (.*)$")
    public void changeName(String name) throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Events.addName.getBy(), 15);
        Events.addName.getElement().clear();
        Events.addName.getElement().sendKeys(name);

        Events.saveButton.getElement().click();
    }

    @And("^User goto Types tab$")
    public void goToTypes() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.typesTab.getBy(), 15);
        Events.typesTab.getElement().click();
        Thread.sleep(500);
    }

    @And("^User Click delete button$")
    public void deleteButton() throws Throwable {
        Thread.sleep(500);

        Actions action = new Actions(driver);
        action.moveToElement(Events.selectElement.getElement()).click(Events.openThreeDotMenu.getElement()).build().perform();

        Thread.sleep(500);

        Events.deleteButton.getElement().click();
        Thread.sleep(500);
        Events.yesButton.getElement().click();
        Thread.sleep(500);
    }

    @Then("^Check if name is Changed to (.*)$")
    public void checkNameIsChanged(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @Then("^Check if Event Type (.*) Appears on List$")
    public void checkEventTypeAppearsOnList(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @Then("^Check if event with name (.*) is deleted$")
    public void checkEventIsDeleted(String name) throws Throwable {
        Thread.sleep(2000);
        List<WebElement> units = driver.findElements(By.xpath("//*[text()[contains(.,'" + name + "')]]"));
        Assert.assertTrue("event is not deleted", units.isEmpty());
    }

    @And("^User wait until event is created$")
    public void waitForEvent() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.waitForInactiveElement.getBy(), 50);
    }

    @And("^User wait until event is finished$")
    public void waitForEventIsFinished() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.waitForActiveElement.getBy(), 50);
    }

    @And("^Click (.*) Event$")
    public void clickEventOnList(String name) throws Throwable {
        PageObjectUtils.ContainsText(driver, name).click();
    }

    @And("^Click (.*) Routine$")
    public void clickRoutineOnList(String name) throws Throwable {
        PageObjectUtils.ContainsText(driver, name).click();
    }

    @Then("^Check if (.*) Event details page appear$")
    public void checkEventDetails(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^Change Filters to Events that are Unacknowledged$")
    public void changeFilterToUnacknowledged() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.stateDropDown.getBy(), 30);
        Events.stateDropDown.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.stateSelectNone.getBy(), 30);
        Events.stateSelectNone.getElement().click();
        Thread.sleep(500);
    }

    @And("^Click Ack button and then Click Acknowledge$")
    public void acknowledgeEvent() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.ackEventButton.getBy(), 15);
        Thread.sleep(1000);

        List<WebElement> events = driver.findElements(Events.ackEventButton.getBy());
        preNrEvents = events.size();

        Events.ackEventButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, Events.acknowledgeEvent.getBy(), 15);
        Events.acknowledgeEvent.getElement().click();
    }

    @Then("^Check if Event is Acknowledged$")
    public void checkEventIsAcknowledge() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.ackEventButton.getBy(), 15);
        Thread.sleep(1000);

        List<WebElement> events = driver.findElements(Events.ackEventButton.getBy());
        afterNrEvents = events.size();

        Assert.assertNotEquals("Event is not Acknowledged", afterNrEvents, preNrEvents);
    }

    @And("^User goes to Event Dashboard$")
    public void goToEventDashboard() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.eventsDashboard.getBy(), 15);
        Events.eventsDashboard.getElement().click();

    }

    @And("^Click create event configuration button$")
    public void createEventConfig() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.eventCreation.getBy(), 15);
        Events.eventCreation.getElement().click();

    }

    @And("^Click disable config button$")
    public void disableConfig() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.disableConfig.getBy(), 15);
        Thread.sleep(500);
        Events.disableConfig.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.yesButton.getBy(), 15);
        Thread.sleep(500);
        Events.yesButton.getElement().click();
    }

    @Then("^Check if config is disabled$")
    public void checkConfigIsDisabled() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.enableConfig.getBy(), 15);
    }

    @Then("^Check if config is enabled$")
    public void checkConfigIsEnabled() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.disableConfig.getBy(), 15);
    }

    @And("^Click enable config button$")
    public void enableConfig() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.enableConfig.getBy(), 15);
        Thread.sleep(500);
        Events.enableConfig.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.yesButton.getBy(), 15);
        Thread.sleep(500);
        Events.yesButton.getElement().click();
    }

    @And("^User make point value false and click save$")
    public void turnOffPoint() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.TurnOffAgain.getBy(), 15);
        Thread.sleep(500);
        PointsPanel.TurnOffAgain.getElement().click();
        Thread.sleep(500);
        PointsPanel.SaveChanges.getElement().click();
    }

    @Then("^Check if (.*) event appears on list$")
    public void checkEventAppearsOnDashboard(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @Then("^Check if (.*) event disappears on list$")
    public void checkEventDisappearsOnDashboard(String name) throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, By.xpath("//*[text()[contains(.,'" + name + "')]]"),50);
    }

    @And("^Click next button$")
    public void nextButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.nextButton.getBy(), 15);
        Events.nextButton.getElement().click();
    }

    @And("^Add device to list and drag point to config$")
    public void addPointToConfig() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.selectDevice.getBy(), 15);
        Events.selectDevice.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.moveDevice.getBy(), 15);
        Events.moveDevice.getElement().click();

        Actions act = new Actions(driver);
        Thread.sleep(500);
        act.dragAndDrop(Events.dragPoint.getElement(), Events.dropPoint.getElement()).build().perform();
    }

    @And("^Setup event class and click save button$")
    public void setupEventClassAndSaveConfig() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.selectEventClass.getBy(), 15);
        Thread.sleep(500);
        Events.selectEventClass.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.selectFireClass.getBy(), 15);
        Thread.sleep(500);

        Events.selectFireClass.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.saveButton.getBy(), 15);
        Thread.sleep(500);
        Events.saveButton.getElement().click();
        Thread.sleep(500);
    }

    @And("^Remove device from list$")
    public void removeConfig() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.selectDevice.getBy(), 15);
        Events.selectDevice.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Events.removeDevice.getBy(), 15);
        Events.removeDevice.getElement().click();

    }

    @Then("^Check if config is added$")
    public void checkIfConfigIsAdded() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.checkConfigIsAdded.getBy(), 15);
    }

    @Then("^Check if config is removed$")
    public void checkIfConfigIsRemoved() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.checkConfigIsRemoved.getBy(), 15);
    }
}
