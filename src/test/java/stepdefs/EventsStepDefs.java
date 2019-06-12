package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.Events;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.Schedulers;

import java.util.List;

public class EventsStepDefs extends CommonStepObjects {

    @And("^Click Events tab$")
    public void eventsTab() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Events.events.getBy(), 15);
        Events.events.getElement().click();
    }

    @Then("^Check if user is at Events page$")
    public void checkEventsPageAppears() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Event Configs");
    }

    @And("^User click Add Event$")
    public void addEventPopUp() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Events.addButton.getBy(), 15);
        Events.addButton.getElement().click();
    }

    @Then("^Check if Event Class (.*) Appears on List$")
    public void checkEventClassAppearsOnList(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^User Fill mandatory fields for Event Class$")
    public void fillMandatoryFieldsClass() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Events.addName.getBy(), 15);
        Events.addName.getElement().sendKeys("Automation");
        Events.addDescription.getElement().sendKeys("Test Description");

        List<WebElement> roles = driver.findElements(By.xpath("//mat-select[@formcontrolname='roles']"));

        roles.get(0).click();
        Events.selectSuperAdmin.getElement().click();

        Schedulers.closeDropdown.getElement().click();
        Thread.sleep(1000);

        roles.get(1).click();
        Events.selectSuperAdmin.getElement().click();

        Schedulers.closeDropdown.getElement().click();
        Thread.sleep(1000);

        roles.get(2).click();
        Events.selectSuperAdmin.getElement().click();

        Schedulers.closeDropdown.getElement().click();
        Thread.sleep(1000);

        Events.saveButton.getElement().click();
    }

    @And("^User Click edit button$")
    public void editButtonEvents() throws Throwable {
        Thread.sleep(1000);

        Actions action = new Actions(driver);
        action.moveToElement(Events.selectElement.getElement()).click(Events.openThreeDotMenu.getElement()).build().perform();

        Thread.sleep(1000);

        Events.editButton.getElement().click();
    }

    @And("^User Fill mandatory fields for Event Type$")
    public void typeFillMandatoryFields() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Events.addName.getBy(), 15);
        Events.addName.getElement().sendKeys("Automation");
        Thread.sleep(1000);
        Events.addDescription.getElement().sendKeys("Test Description");

        Thread.sleep(1000);
        Events.saveButton.getElement().click();
    }

    @And("^User change Event name to (.*)$")
    public void changeName(String name) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Events.addName.getBy(), 15);
        Events.addName.getElement().clear();
        Events.addName.getElement().sendKeys(name);

        Events.saveButton.getElement().click();
    }

    @And("^User goto Types tab$")
    public void goToTypes() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Events.typesTab.getBy(), 15);
        Events.typesTab.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User Click delete button$")
    public void deleteButton() throws Throwable {
        Thread.sleep(1000);

        Actions action = new Actions(driver);
        action.moveToElement(Events.selectElement.getElement()).click(Events.openThreeDotMenu.getElement()).build().perform();

        Thread.sleep(1000);

        Events.deleteButton.getElement().click();

        Events.yesButton.getElement().click();
    }

    @Then("^Check if name is Changed to (.*)$")
    public void checkNameIsChanged(String name) throws Throwable {
        Thread.sleep(2000);
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @Then("^Check if Event Type (.*) Appears on List$")
    public void checkEventTypeAppearsOnList(String name) throws Throwable {
        Thread.sleep(2000);
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @Then("^Check if event with name (.*) is deleted$")
    public void checkEventIsDeleted(String name) throws Throwable {
        Thread.sleep(2000);
        List<WebElement> units = driver.findElements(By.xpath("//*[text()[contains(.,'" + name + "')]]"));
        Assert.assertTrue("event is not deleted", units.isEmpty());
    }

}
