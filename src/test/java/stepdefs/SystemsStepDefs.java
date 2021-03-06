package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.DevicePanel;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.Systems;

public class SystemsStepDefs extends CommonStepObjects {


    @When("^User Click on Systems button$")
    public void clickSystems() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.systemsButton.getBy(), 15);
        Thread.sleep(500);
        Systems.systemsButton.getElement().click();
    }

    @When("^User click Add new System button$")
    public void addSystem() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.addSystemButton.getBy(), 15);
        Thread.sleep(500);
        Systems.addSystemButton.getElement().click();
        Thread.sleep(500);
    }

    @And("^User fill mandatory fields for System and click add$")
    public void fillMandatory() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.systemName.getBy(), 15);
        Systems.systemName.getElement().sendKeys("Automation System");
        Systems.selectType.getElement().click();
        Thread.sleep(500);
        Systems.selectChillerWaterPlant.getElement().click();
        Thread.sleep(500);
        Systems.addTag.getElement().click();
        Systems.addTag.getElement().sendKeys("Systems");
        Systems.addTag.getElement().sendKeys(Keys.ENTER);
        Thread.sleep(500);
        Systems.systemName.getElement().click();
        Systems.createButton.getElement().click();
        Thread.sleep(500);
    }

    @And("^User add Device with Linked points$")
    public void addDeviceWithPoint() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.linkOffButton.getBy(), 15);
        Systems.linkOffButton.getElement().click();
        Thread.sleep(500);
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("//*[text()[contains(.,'BR126')]]")), Systems.dragDevicesHere.getElement());
        Thread.sleep(500);
    }

    @And("^User Drag Device to the list$")
    public void dragDevice() throws Throwable {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("//*[text()[contains(.,'BR127')]]")), Systems.dragDevicesHere.getElement()).build().perform();
    }

    @And("^User Drag point to device$")
    public void dragPoint() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Systems.dragPoint.getBy(), 15);
        Actions action = new Actions(driver);
        action.dragAndDrop(Systems.dragPoint.getElement(), Systems.dropPoint.getElement()).build().perform();
        Thread.sleep(500);
    }

    @And("^User Save changes for System$")
    public void saveChanges() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.saveButton.getBy(), 15);
        Systems.saveButton.getElement().click();
        Thread.sleep(500);
    }

    @Then("^Check if Changes Appears on System$")
    public void checkChanges() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'BO1')]]"), 15);
    }

    @Then("^Check if Systems page appears$")
    public void checkSystemIsAdded() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.addSystemButton.getBy(), 15);
    }

    @Then("^Check if (.*) is created$")
    public void checkSystem(String sys) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, sys);
    }

    @When("^User clicks (.*) from the list and go to Details page$")
    public void clickSystem(String system) throws Throwable {
        PageObjectUtils.ContainsText(driver, system).click();
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Systems.systemsDetails.getBy(), 15);
        Systems.systemsDetails.getElement().click();
        Thread.sleep(500);
    }

    @And("^User Click Edit System button$")
    public void editButton() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Systems.editSystem.getBy(), 15);
        Systems.editSystem.getElement().click();
        Thread.sleep(500);
    }

    @And("^User Click Edit Content button$")
    public void editContent() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, Systems.editContent.getBy(), 15);
        Systems.editContent.getElement().click();
        Thread.sleep(500);
    }

    @And("^User add (.*) as Tag$")
    public void addTag(String tag) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.addTag.getBy(), 15);
        Thread.sleep(500);
        Systems.addTag.getElement().click();
        Systems.addTag.getElement().sendKeys(tag);
        Systems.addTag.getElement().sendKeys(Keys.ENTER);
        Thread.sleep(500);
        Systems.systemName.getElement().click();
        Thread.sleep(500);
        Systems.saveChanges.getElement().click();
    }

    @Then("^Check if Changed are saved successful$")
    public void checkNewChanges() throws Throwable {

    }

    @And("^user click delete System Button$")
    public void deleteButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Systems.deleteSystem.getBy(), 15);
        Thread.sleep(500);
        Systems.deleteSystem.getElement().click();
        PageObjectUtils.IsElementVisible(driver, Systems.yesButton.getBy(), 15);
        Systems.yesButton.getElement().click();
        Thread.sleep(500);
    }

    @Then("^Check if System is Deleted$")
    public void openDeviceDetails() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeviceDetailsButton.getBy(), 15);
        DevicePanel.DeviceDetailsButton.getElement().click();
    }
}