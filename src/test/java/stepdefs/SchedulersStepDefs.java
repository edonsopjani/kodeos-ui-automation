package stepdefs.websitesteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.DevicePanel;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.Schedulers;
import pageobjects.pages.Systems;
import stepdefs.CommonStepObjects;

public class SchedulersStepDefs extends CommonStepObjects {

    @When("^User Click on Schedulers button$")
    public void clickSchedulers() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.schedulersButton.getBy(), 5);
        Thread.sleep(2000);
        Schedulers.schedulersButton.getElement().click();
    }

    @When("^User click Discovery button$")
    public void clickSystems() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.discovery.getBy(), 5);
        Thread.sleep(2000);
        Schedulers.discovery.getElement().click();
    }

    @Then("^Check if points with schedulers appears on list$")
    public void addSystem() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'BR126_str')]]"), 5);
        Thread.sleep(1000);
    }


    @And("^User click (.*) from the list$")
    public void addDeviceWithPoint(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
        PageObjectUtils.ContainsText(driver, name).click();
        Thread.sleep(1000);
    }

    @And("^User click add scheduler button$")
    public void dragDevice() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.addScheduler.getBy(), 5);
        Thread.sleep(1000);
        Schedulers.addScheduler.getElement().click();
    }

    @And("^User click save scheduler button$")
    public void dragPoint() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.saveButton.getBy(), 5);
        Schedulers.saveButton.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User go to calendar$")
    public void saveChanges() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.calendar.getBy(), 5);
        Schedulers.calendar.getElement().click();
        Thread.sleep(1000);
    }

    @Then("^Check if Scheduler appears on calendar$")
    public void checkChanges() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'BR126_str')]]"), 5);
    }

    @Then("^Check if Scheduler disappears on calendar$")
    public void checkDisappearChanges() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.ElementIsNotVisible(driver, By.xpath("//*[text()[contains(.,'BR126_str')]]"), 5);
    }

    @And("^User click existing scheduler$")
    public void checkSys() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//tr[@class='mat-row ng-tns-c54-161 ng-star-inserted']"), 5);
    }

    @And("^User change date to Saturday$")
    public void checkScheduler() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Schedulers.selectDay.getBy(), 5);
        Schedulers.selectDay.getElement().click();
        PageObjectUtils.IsElementVisible(driver, Schedulers.selectSaturday.getBy(), 5);
        Schedulers.selectSaturday.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User clicks delete scheduler button$")
    public void delete() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.removeScheduler.getBy(), 5);
        Schedulers.removeScheduler.getElement().click();
        Thread.sleep(1000);
    }

    @When("^Check if Schedulers page appears$")
    public void clickSystem() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.discovery.getBy(), 5);
        Thread.sleep(1000);
    }

}
