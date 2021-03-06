package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.SearchPanel;

import java.util.List;

public class SearchStepDefs extends CommonStepObjects {

    @When("^User clicks on Search button$")
    public void clickSearchButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SearchPanel.Search.getBy(), 15);
        SearchPanel.Search.getElement().click();
    }

    @And("^search for (.*)$")
    public void searchField(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SearchPanel.SearchField.getBy(), 15);
        Thread.sleep(500);
        SearchPanel.SearchField.getElement().sendKeys(test);
    }

    @Then("^Check if by default there appears the list of Building, Floors and Devices")
    public void checkButtonsAppearsOnList() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.ID, "search-overlay-input", 15);
        PageObjectUtils.CheckContainsText(driver, "Buildings");
        PageObjectUtils.CheckContainsText(driver, "Areas");
        PageObjectUtils.CheckContainsText(driver, "Devices");
        PageObjectUtils.CheckContainsText(driver, "Points");
    }

    @And("^User click on View all button for Buildings$")
    public void clickViewAll() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "View All");
        List<WebElement> viewall = driver.findElements(SearchPanel.ViewAll.getBy());
        Thread.sleep(500);
        viewall.get(0).click();

    }

    @Then("^Check if All buildings appears on the list$")
    public void checkBuildingsAppear() throws Throwable {
        Thread.sleep(1000);
        List<WebElement> areas = driver.findElements(SearchPanel.AreasName.getBy());
        List<WebElement> devices = driver.findElements(SearchPanel.DevicesName.getBy());
        Assert.assertTrue("View all button is not working", areas.isEmpty());
        Assert.assertTrue("View all button is not working", devices.isEmpty());
    }

    @And("^User click on View all button for Floors$")
    public void viewAllFloors() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "View All");
        List<WebElement> viewall = driver.findElements(SearchPanel.ViewAll.getBy());
        Thread.sleep(500);
        viewall.get(1).click();
    }

    @Then("^Check if All Floors appears on the list$")
    public void checkAllFloors() throws Throwable {
        Thread.sleep(1000);
        List<WebElement> buildings = driver.findElements(SearchPanel.BuildingsName.getBy());
        List<WebElement> devices = driver.findElements(SearchPanel.DevicesName.getBy());
        Assert.assertTrue("View all button is not working", buildings.isEmpty());
        Assert.assertTrue("View all button is not working", devices.isEmpty());
    }

    @And("^User click on View all button for Devices")
    public void viewAllDevices() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "View All");
        List<WebElement> viewall = driver.findElements(SearchPanel.ViewAll.getBy());
        Thread.sleep(500);
        viewall.get(2).click();

    }

    @Then("^Check if All Devices appears on the list")
    public void checkAllDevices() throws Throwable {
        Thread.sleep(1000);
        List<WebElement> buildings = driver.findElements(SearchPanel.BuildingsName.getBy());
        List<WebElement> areas = driver.findElements(SearchPanel.AreasName.getBy());
        Assert.assertTrue("View all button is not working", buildings.isEmpty());
        Assert.assertTrue("View all button is not working", areas.isEmpty());
    }

    @Then("^Search results shows the Building with (.*) search keyword, also shows the Floors and Devices for that Building")
    public void seeAllSearchResults(String text) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@id='buildingName' and contains(text(), '" + text + "')]", 15);
    }

    @Then("^Search results shows all floors with (.*) search keyword, and all devices that are assign to that floor")
    public void checkAllSearchResultsWithFloors(String text) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@id='areaName' and contains(text(), '" + text + "')]", 15);
    }

    @Then("^Search results shows all devices with (.*) search keyword$")
    public void checkAllResultsWithDevices(String text) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@id='deviceName' and contains(text(), '" + text + "')]", 15);
    }

    @Then("^Search results shows all points with (.*) search keyword$")
    public void checkAllResultsWithPoints(String text) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@id='pointName' and contains(text(), '" + text + "')]", 15);
    }

}
