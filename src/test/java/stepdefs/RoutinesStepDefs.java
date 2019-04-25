package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.Routines;
import pageobjects.pages.UnitsPanel;

public class RoutinesStepDefs extends CommonStepObjects {

    @And("^User Click Add New Routine button$")
    public void goToAddNewRoutinePage() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Routines.menu.getBy(), 15);
        Routines.menu.getElement().click();
        Thread.sleep(1000);
        Routines.addRoutineButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, Routines.dragBooleanPoint.getBy(), 15);
    }

    @And("^Drag Boolean point to rete editor$")
    public void dragBooleanPointToEditor() throws Throwable {
        Actions action = new Actions(driver);
        action.dragAndDrop(Routines.dragBooleanPoint.getElement(),Routines.dropPoint.getElement()).build().perform();
        Thread.sleep(1000);
        action.dragAndDrop(Routines.dragBooleanPoint.getElement(),Routines.dropPoint.getElement()).build().perform();
        action.dragAndDrop(Routines.dragBooleanPoint.getElement(),Routines.dropPoint.getElement()).build().perform();
    }

    @When("^User Click Add Category Buttonssa$")
    public void addCategoryButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.addCategory.getBy(), 15);
        UnitsPanel.addCategory.getElement().click();
    }

    @And("^Click category options buttonsas$")
    public void categoryOptions() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.openCategoryMenu.getBy(), 15);
        UnitsPanel.openCategoryMenu.getElement().click();
    }

    @Then("^Check if unit with (.*) name appears on listsasaas$")
    public void checkUnitsAdded(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^Click Add new Unitsaassa$")
    public void addNewUnit() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UnitsPanel.addUnit.getBy(), 15);
        Thread.sleep(1000);
        UnitsPanel.addUnit.getElement().click();
    }
}
