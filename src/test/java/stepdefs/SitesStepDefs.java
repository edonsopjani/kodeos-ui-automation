package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.SitesPanel;

public class SitesStepDefs extends CommonStepObjects {

    @When("^User At Home page search for (.*)$")
    public void searchFields(String test) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, SitesPanel.Search.getBy(), 15);
        SitesPanel.Search.getElement().click();
        SitesPanel.Search.getElement().sendKeys(test);
    }

    @Then("^Check if (.*) appears on Search list")
    public void checkBuilding(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, building);
    }

    @And("^User click twice on (.*) building$")
    public void openBuilding(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.ContainsText(driver, building).click();
    }

    @And("^User click sort by down devices$")
    public void sortByDownDevice() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SitesPanel.sortButton.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.sortButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, SitesPanel.sortByDownDevices.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.sortByDownDevices.getElement().click();

        PageObjectUtils.IsElementVisible(driver, SitesPanel.clickSortButton.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.clickSortButton.getElement().click();
    }

    @And("^User click sort by active events$")
    public void sortByActiveEvents() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SitesPanel.sortButton.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.sortButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, SitesPanel.sortByEvents.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.sortByEvents.getElement().click();
        
        PageObjectUtils.IsElementVisible(driver, SitesPanel.clickSortButton.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.clickSortButton.getElement().click();
    }

    @Then("^Check if list of buildings is sorted by (.*)$")
    public void checkSortIsApplied(String sort) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SitesPanel.sortButton.getBy(), 15);
        Thread.sleep(1000);
        SitesPanel.sortButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, SitesPanel.sortIsApplied.getBy(), 15);
    }

    @Then("^Check if (.*) Dashboard appears$")
    public void checkDashboard(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, building);
    }

    @And("^Select (.*) from Map$")
    public void selectBuilding(String building) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, building);
        PageObjectUtils.ContainsText(driver, building).click();
        Thread.sleep(1000);
        SitesPanel.ClickMapMarker.getElement().click();
        PageObjectUtils.CheckContainsText(driver, building);
        PageObjectUtils.ContainsText(driver, "BUILDING DETAILS").click();
    }

}
