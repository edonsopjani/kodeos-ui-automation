package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageobjects.pages.Access;
import pageobjects.pages.PageObjectUtils;

import java.util.Calendar;
import java.util.TimeZone;

public class AccessStepDefs extends CommonStepObjects {

    @When("^User Click on Access button$")
    public void clickAccess() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Access.accessButton.getBy(), 15);
        Thread.sleep(2000);
        Access.accessButton.getElement().click();
    }

    @Then("^Check if Access page appears$")
    public void checkIfAccessPageAppears() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Access.createRequestButton.getBy(), 15);
    }

    @When("^User click create new request button$")
    public void addNewRequest() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Access.createRequestButton.getBy(), 15);
        Access.createRequestButton.getElement().click();
    }

    @And("^User select (.*) and select (.*) building for access$")
    public void selectUserAndBuilding(String user, String building) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Access.userInput.getBy(), 15);
        //Thread.sleep(1000);
        //Access.userInput.getElement().sendKeys("Access");
        Thread.sleep(2000);
        PageObjectUtils.ContainsText(driver, user).click();
        Thread.sleep(1000);
        PageObjectUtils.ContainsText(driver, "Request Access").click();

        PageObjectUtils.IsElementVisible(driver, Access.buildingInput.getBy(), 15);
        Access.allBuildings.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User select request from (.*) until (.*)$")
    public void selectStartAndEndDate(String startDay, String endDay) throws Throwable {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        String StartDay = String.valueOf(calendar.get(Calendar.DATE));
        String EndDay =  String.valueOf(calendar.get(Calendar.DATE) + 1);

        PageObjectUtils.IsElementVisible(driver, Access.startInput.getBy(), 15);
        Access.startInput.getElement().click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(), '" + StartDay + "')]")).click();
        Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, Access.endInput.getBy(), 15);
        Access.endInput.getElement().click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(), '" + EndDay + "')]")).click();
        Thread.sleep(1000);
    }

    @And("^User select shift and (.*) as reason and click save$")
    public void selectShiftAndReason(String reason) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Access.shiftInput.getBy(), 15);
        Access.shiftInput.getElement().click();
        Thread.sleep(1000);
        Access.shift.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Access.reasonInput.getBy(), 15);
        Access.reasonInput.getElement().sendKeys(reason);

        Thread.sleep(1000);
        Access.saveButton.getElement().click();
    }

    @Then("^Check if request appears on list with status (.*)$")
    public void checkRequestPrimaryStatus(String status) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[contains(text(), '" + status + "')]"), 15);
    }

    @And("^User Click request from (.*) and approves it$")
    public void userApprovesRequest(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
        PageObjectUtils.ContainsText(driver, name).click();

        PageObjectUtils.IsElementVisible(driver, Access.approveButton.getBy(), 15);
        Thread.sleep(1000);
        Access.approveButton.getElement().click();
        Thread.sleep(1000);
        Access.confirmButton.getElement().click();
    }

    @Then("^Check if request status changes to (.*)")
    public void checkIfRequestStatusIsChanged(String status) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[contains(text(), '" + status + "')]"), 15);
    }

    @And("^Check if (.*) building appears on list$")
    public void checkBuildingAppearsOnSitesPage(String building) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, building);
    }

    @When("^User Click request from (.*) and reject it with reason (.*)$")
    public void rejectAccess(String user, String reason) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, user);
        PageObjectUtils.ContainsText(driver, user).click();

        PageObjectUtils.IsElementVisible(driver, Access.rejectButton.getBy(), 15);
        Thread.sleep(1000);
        Access.rejectButton.getElement().click();
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Access.reasonInput.getBy(), 15);
        Access.reasonInput.getElement().sendKeys(reason);
        Thread.sleep(1000);
        Access.saveButton.getElement().click();
    }

    @And("^User Click request from (.*) and click delete$")
    public void deleteRequest(String user) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, user);
        PageObjectUtils.ContainsText(driver, user).click();

        PageObjectUtils.IsElementVisible(driver, Access.deleteButton.getBy(), 15);
        Thread.sleep(1000);
        Access.deleteButton.getElement().click();
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Access.yesButton.getBy(), 15);
        Access.yesButton.getElement().click();
    }

    @Then("^Check if request disappears from list$")
    public void checkRequestIsDeleted() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Access.deletedSuccessfully.getBy(), 15);
    }
}
