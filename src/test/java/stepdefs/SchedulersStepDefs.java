package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.Schedulers;

public class SchedulersStepDefs extends CommonStepObjects {

    @When("^User Click on Schedulers button$")
    public void clickSchedulers() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.schedulersButton.getBy(), 15);
        Thread.sleep(500);
        Schedulers.schedulersButton.getElement().click();
    }

    @When("^User select (.*) building$")
    public void selectBuilding(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
        Thread.sleep(1000);
        PageObjectUtils.ContainsText(driver, name).click();
    }

    @When("^User click Discovery button$")
    public void clickDiscoverSchedulers() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.discovery.getBy(), 15);
        Thread.sleep(500);
        Schedulers.discovery.getElement().click();
    }

    @Then("^Check if points with schedulers appears on list$")
    public void checkSchedulers() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'exactlogicschedule')]]"), 15);
        //Thread.sleep(500);
    }

    @And("^User click (.*) from the list$")
    public void clickScheduler(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
        PageObjectUtils.ContainsText(driver, name).click();
        Thread.sleep(500);
    }

    @And("^User click (.*) three dots menu$")
    public void clickSchedulerMenu(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.showSchedulerMenu.getBy(), 15);
        Schedulers.showSchedulerMenu.getElement().click();
    }


    @And("^User click add scheduler button$")
    public void addScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.addScheduler.getBy(), 15);
        Thread.sleep(500);
        Schedulers.addScheduler.getElement().click();
    }

    @And("^User click disabled Button$")
    public void disableButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.disableSchedulerPoint.getBy(), 15);
        Thread.sleep(500);
        Schedulers.disableSchedulerPoint.getElement().click();
    }

    @Then("^Check if Scheduler point is disabled$")
    public void checkPointIsDisabled() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.enableSchedulerPoint.getBy(), 15);
    }

    @And("^User click enable Button$")
    public void enableButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.enableSchedulerPoint.getBy(), 15);
        Thread.sleep(500);
        Schedulers.enableSchedulerPoint.getElement().click();
    }

    @Then("^Check if Scheduler point is enabled")
    public void checkPointIsEnable() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.disableSchedulerPoint.getBy(), 15);
    }

    @And("^User click add scheduler in list$")
    public void addSchedulerInList() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.addSchedulerInList.getBy(), 15);
        Thread.sleep(500);
        Schedulers.addSchedulerInList.getElement().click();
    }

    @And("^User click save scheduler button$")
    public void saveScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.saveButton.getBy(), 15);
        Schedulers.saveButton.getElement().click();
    }

    @And("^User go to calendar$")
    public void goToCalendar() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.calendar.getBy(), 15);
        Thread.sleep(500);
        Schedulers.calendar.getElement().click();
    }

    @Then("^Check if (.*) Scheduler appears on calendar$")
    public void checkSchedulerIsAdded(String scheduler) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'"+scheduler+"')]]"), 15);
    }

    @Then("^Check if (.*) Scheduler disappears on calendar$")
    public void checkSchedulerDisappears(String scheduler) throws Throwable {
        PageObjectUtils.ElementIsNotVisible(driver, By.xpath("//*[text()[contains(.,'"+scheduler+"')]]"), 15);
    }

    @And("^User click existing scheduler$")
    public void clickExistingScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//tr[@class='mat-row ng-tns-c54-161 ng-star-inserted']"), 15);
    }

    @And("^User change date to (.*)$")
    public void changeSchedulerDate(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.selectDay.getBy(), 15);
        Schedulers.selectDay.getElement().click();
        PageObjectUtils.CheckContainsText(driver, name);
        PageObjectUtils.ContainsText(driver, name).click();
        Thread.sleep(500);
    }

    @And("^Close date dropdown$")
    public void closePopup() throws Throwable {
        Schedulers.closeDropdown.getElement().click();
    }

    @And("^User clicks delete scheduler button$")
    public void deleteScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.removeScheduler.getBy(), 15);
        Schedulers.removeScheduler.getElement().click();
        Thread.sleep(500);
    }

    @And("^User select existing Time-Period")
    public void selectTimePeriod() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.selectPeriod.getBy(), 15);
        Schedulers.selectPeriod.getElement().click();
        Thread.sleep(500);
    }

    @When("^Check if Schedulers page appears$")
    public void checkSchedulerPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.discovery.getBy(), 15);
    }
}
