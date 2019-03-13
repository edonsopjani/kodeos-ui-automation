package stepdefs.websitesteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.pages.BuildingPanel;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.SearchPanel;
import selenium.WebDriverFactory;
import stepdefs.CommonStepObjects;

import java.util.List;

public class SearchStepDefs extends CommonStepObjects {

    @When("^User clicks on Search button$")
    public void theNextStepThatGetsRepeatedBeforeEveryTest() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SearchPanel.Search.getBy(), 5);
        SearchPanel.Search.getElement().click();
    }

    @And("^search for (.*)$")
    public void Searchfields(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, SearchPanel.SearchField.getBy(), 5);
        Thread.sleep(1000);
        SearchPanel.SearchField.getElement().sendKeys(test);
    }

    @Then("^Check if by default there appears the list of Building, Floors and Devices")
    public void openBuilding() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.ID, "search-overlay-input", 5);
        PageObjectUtils.CheckContainsText(driver, "BUILDINGS");
        PageObjectUtils.CheckContainsText(driver, "AREAS");
        PageObjectUtils.CheckContainsText(driver, "DEVICES");
    }

    @And("^User click on View all button for Buildings$")
    public void openAreaTab() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "View All");
        List<WebElement> viewall = driver.findElements(SearchPanel.ViewAll.getBy());
        Thread.sleep(1000);
        viewall.get(0).click();

    }

    @Then("^Check if All buildings appears on the list$")
    public void openMenuTab() throws Throwable {
        Thread.sleep(2000);
        List<WebElement> areas = driver.findElements(SearchPanel.AreasName.getBy());
        List<WebElement> devices = driver.findElements(SearchPanel.DevicesName.getBy());
        Assert.assertTrue("View all button is not working", areas.isEmpty());
        Assert.assertTrue("View all button is not working", devices.isEmpty());
    }

    @And("^User click on View all button for Floors$")
    public void AreaTabSaveButton() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "View All");
        List<WebElement> viewall = driver.findElements(SearchPanel.ViewAll.getBy());
        Thread.sleep(1000);
        viewall.get(1).click();
    }

    @Then("^Check if All Floors appears on the list$")
    public void SaveButton() throws Throwable {
        Thread.sleep(2000);
        List<WebElement> buildings = driver.findElements(SearchPanel.BuildingsName.getBy());
        List<WebElement> devices = driver.findElements(SearchPanel.DevicesName.getBy());
        Assert.assertTrue("View all button is not working", buildings.isEmpty());
        Assert.assertTrue("View all button is not working", devices.isEmpty());
    }

    @And("^User click on View all button for Devices")
    public void DeleteButton() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "View All");
        List<WebElement> viewall = driver.findElements(SearchPanel.ViewAll.getBy());
        Thread.sleep(1000);
        viewall.get(2).click();

    }

    @Then("^Check if All Devices appears on the list")
    public void AssignUsersButton() throws Throwable {
        Thread.sleep(2000);
        List<WebElement> buildings = driver.findElements(SearchPanel.BuildingsName.getBy());
        List<WebElement> areas = driver.findElements(SearchPanel.AreasName.getBy());
        Assert.assertTrue("View all button is not working", buildings.isEmpty());
        Assert.assertTrue("View all button is not working", areas.isEmpty());
    }

    @Then("^Search results shows the Building with (.*) search keyword, also shows the Floors and Devices for that Building")
    public void seeresults(String text) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='search-building-item-title' and contains(text(), '" + text + "')]", 5);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='search-area-item-building' and contains(text(), '" + text + "')]", 5);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='search-device-item-building' and contains(text(), '" + text + "')]", 5);
    }

    @Then("^Search results shows all floors with (.*) search keyword, and all devices that are assign to that floor")
    public void EnterSVG(String text) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='search-area-item-title' and contains(text(), '" + text + "')]", 5);
    }

    @Then("^Search results shows all devices with (.*) search keyword$")
    public void addfloorfield(String text) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='search-device-item-title' and contains(text(), '" + text + "')]", 5);
    }

}
