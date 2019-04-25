package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.UnitsPanel;

import java.util.List;

public class UnitsStepDefs extends CommonStepObjects {

    @And("^user add (.*) as Category Name and click Add$")
    public void addCategory(String name) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.addCategoryName.getBy(), 15);
        UnitsPanel.addCategoryName.getElement().sendKeys(name);
        Thread.sleep(1000);
        UnitsPanel.saveCategory.getElement().click();
    }

    @Then("^Check if category with name (.*) appears on list$")
    public void checkCategoryIsAdded(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @When("^User Click Add Category Button$")
    public void addCategoryButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.addCategory.getBy(), 15);
        UnitsPanel.addCategory.getElement().click();
    }

    @And("^Click category options button$")
    public void categoryOptions() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.openCategoryMenu.getBy(), 15);
        UnitsPanel.openCategoryMenu.getElement().click();
    }

    @Then("^Check if unit with (.*) name appears on list$")
    public void checkUnitsAdded(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^Click Add new Unit$")
    public void addNewUnit() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.addUnit.getBy(), 15);
        Thread.sleep(1000);
        UnitsPanel.addUnit.getElement().click();
    }

    @And("^User fill mandatory fields and click add$")
    public void fillMandatoryFields() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.addUnitName.getBy(), 15);
        UnitsPanel.addUnitName.getElement().sendKeys("AutoUnit");
        UnitsPanel.addUnitSymbol.getElement().sendKeys("~!");
        UnitsPanel.addUnitCOV.getElement().sendKeys("0.1");
        UnitsPanel.addUnitKeywords.getElement().sendKeys("test");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        UnitsPanel.choosePrecision.getElement().click();
        UnitsPanel.zeroPrecision.getElement().click();
        Thread.sleep(1000);
        UnitsPanel.saveUnit.getElement().click();
        Thread.sleep(2000);
    }

    @And("^User click unit with name (.*)$")
    public void clickUnit(String unit) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, unit);
        PageObjectUtils.ContainsText(driver, unit).click();
    }

    @And("^Change symbol to (.*)$")
    public void changeSymbol(String name) throws Throwable {
        Thread.sleep(1000);
        UnitsPanel.addUnitSymbol.getElement().clear();
        UnitsPanel.addUnitSymbol.getElement().sendKeys(name);
        Thread.sleep(1000);
        UnitsPanel.saveButton.getElement().click();
        Thread.sleep(2000);
    }

    @Then("^Check if Unit symbol is changed to (.*)$")
    public void checkSymbol(String name) throws Throwable {
        Thread.sleep(2000);
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^user Click delete Unit button$")
    public void deleteButton() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.deleteUnit.getBy(), 15);
        UnitsPanel.deleteUnit.getElement().click();
    }

    @And("^User click Yes button to delete Unit$")
    public void yesButton() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.yesButton.getBy(), 15);
        UnitsPanel.yesButton.getElement().click();
    }

    @Then("^Check if Unit with name (.*) disappears from list$")
    public void checkUnitIsDeleted(String name) throws Throwable {
        Thread.sleep(2000);
        List<WebElement> units = driver.findElements(By.xpath("//*[text()[contains(.,'" + name + "')]]"));
        Assert.assertTrue("unit is not deleted", units.isEmpty());
    }

}
