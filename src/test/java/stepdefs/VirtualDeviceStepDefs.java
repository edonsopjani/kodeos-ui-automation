package stepdefs.websitesteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.DevicePanel;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.VirtualDevicePanel;
import stepdefs.CommonStepObjects;

import java.util.List;
import java.util.Random;

public class VirtualDeviceStepDefs extends CommonStepObjects {

    public static int n;

    @And("^User goes to Virtual Device Page$")
    public void goToFilters() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, VirtualDevicePanel.SetupVirtualDevicesButton.getBy(), 5);
        VirtualDevicePanel.SetupVirtualDevicesButton.getElement().click();
    }

    @Then("^Check if user is at Virtual Device page$")
    public void CheckType() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "ExactLogic");
    }

    @When("^User select (.*) Device$")
    public void Searchfield(String test) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, test);
        PageObjectUtils.ContainsText(driver, test).click();
    }

    @And("^User Click Add Virtual Device and add (.*) as name$")
    public void SearchConnectorfield(String name) throws Throwable {
        Random rand = new Random();
        n = rand.nextInt(50) + 1;

        PageObjectUtils.IsElementVisible(driver, VirtualDevicePanel.AddButton.getBy(), 5);
        VirtualDevicePanel.AddButton.getElement().click();
        Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, VirtualDevicePanel.VirtualDeviceName.getBy(), 5);
        VirtualDevicePanel.VirtualDeviceName.getElement().sendKeys(name + n);
        Thread.sleep(1000);
        VirtualDevicePanel.CreateVirtualDevice.getElement().click();
    }

    @Then("^Check if Virtual Device with name (.*) appears on list$")
    public void CheckDeviceisAppeared(String device) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, device + n);
    }

    @And("^User also select (.*) Device$")
    public void filterArea(String device) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, device);
        PageObjectUtils.ContainsText(driver, device).click();
    }

    @And("^User check all points and move to Virtual device$")
    public void CheckArea() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, VirtualDevicePanel.CheckBox.getBy(), 5);
        VirtualDevicePanel.CheckBox.getElement().click();
        Thread.sleep(1000);
        VirtualDevicePanel.MoveToVirtual.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User check all points and move to real device$")
    public void CheckAreas() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, VirtualDevicePanel.CheckBox.getBy(), 5);
        VirtualDevicePanel.CheckBox.getElement().click();
        Thread.sleep(1000);
        VirtualDevicePanel.MoveToDevice.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User save the changes$")
    public void filterConnector() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, VirtualDevicePanel.SaveButton.getBy(), 5);
        VirtualDevicePanel.SaveButton.getElement().click();
        Thread.sleep(1000);
    }

    @And("^Change Virtual device name to (.*) and click save$")
    public void hoss(String device) throws Throwable {
        Thread.sleep(20000);
    }

    @And("^Check if points are moved to Virtual Device$")
    public void clickCheckbox() throws Throwable {
        Thread.sleep(1000);
    }
}
