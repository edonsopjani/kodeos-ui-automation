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
        Thread.sleep(2000);
        Schedulers.schedulersButton.getElement().click();
    }

    @When("^User click Discovery button$")
    public void clickDiscoverSchedulers() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.discovery.getBy(), 15);
        Thread.sleep(2000);
        Schedulers.discovery.getElement().click();
    }

    @Then("^Check if points with schedulers appears on list$")
    public void checkSchedulers() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'BR126_str')]]"), 15);
        Thread.sleep(1000);
    }

    @And("^User click (.*) from the list$")
    public void clickScheduler(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
        PageObjectUtils.ContainsText(driver, name).click();
        Thread.sleep(1000);
    }

    @And("^User click add scheduler button$")
    public void addScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.addScheduler.getBy(), 15);
        Thread.sleep(1000);
        Schedulers.addScheduler.getElement().click();
    }

    @And("^User click save scheduler button$")
    public void saveScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.saveButton.getBy(), 15);
        Schedulers.saveButton.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User go to calendar$")
    public void goToCalendar() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.calendar.getBy(), 15);
        Schedulers.calendar.getElement().click();
        Thread.sleep(1000);
    }

    @Then("^Check if Scheduler appears on calendar$")
    public void checkSchedulerIsAdded() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'BR126_str')]]"), 15);
    }

    @Then("^Check if Scheduler disappears on calendar$")
    public void checkSchedulerDisappears() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.ElementIsNotVisible(driver, By.xpath("//*[text()[contains(.,'BR126_str')]]"), 15);
    }

    @And("^User click existing scheduler$")
    public void clickExistingScheduler() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//tr[@class='mat-row ng-tns-c54-161 ng-star-inserted']"), 15);
    }

    @And("^User change date to Saturday$")
    public void changeSchedulerDate() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Schedulers.selectDay.getBy(), 15);
        Schedulers.selectDay.getElement().click();
        PageObjectUtils.IsElementVisible(driver, Schedulers.selectSaturday.getBy(), 15);
        Schedulers.selectSaturday.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User clicks delete scheduler button$")
    public void deleteScheduler() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.removeScheduler.getBy(), 15);
        Schedulers.removeScheduler.getElement().click();
        Thread.sleep(1000);
    }

    @When("^Check if Schedulers page appears$")
    public void checkSchedulerPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Schedulers.discovery.getBy(), 15);
        Thread.sleep(1000);
    }

}
