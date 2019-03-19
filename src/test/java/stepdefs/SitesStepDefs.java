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
        PageObjectUtils.IsElementVisible(driver, SitesPanel.Search.getBy(), 5);
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
        Thread.sleep(1000);
        PageObjectUtils.ContainsText(driver, building).click();
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
