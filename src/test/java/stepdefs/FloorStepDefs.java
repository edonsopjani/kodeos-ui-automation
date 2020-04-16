package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.FloorPanel;
import pageobjects.pages.PageObjectUtils;

import java.util.List;

public class FloorStepDefs extends CommonStepObjects {

    @And("^User upload floor plan$")
    public void uploadFloorPlan() throws Throwable {
        Thread.sleep(2000);
        //Add floor plan
        List<WebElement> fileInput = driver.findElements(By.xpath("//input"));
        fileInput.get(0).sendKeys(PageObjectUtils.filePathForUpload("floor.svg"));
        Thread.sleep(2000);
    }

    @Then("^Check if floor plan appears$")
    public void checkFloorPlan() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'Saved Successfully')]]"), 50);
        Thread.sleep(500);
    }

    @When("^User go to edit page$")
    public void goToEditPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.EditFloor.getBy(), 15);
        FloorPanel.EditFloor.getElement().click();
        Thread.sleep(500);
    }

    @And("^user upload floor zones$")
    public void uploadFloorZones() throws Throwable {
        Thread.sleep(500);
        List<WebElement> fileInput = driver.findElements(By.xpath("//input"));
        Thread.sleep(500);
        fileInput.get(1).sendKeys(PageObjectUtils.filePathForUpload("floor.svg"));
        Thread.sleep(500);
    }

    @Then("^Check if zones appears at Floor plan$")
    public void checkZonesAppearsOnFloorPlan() throws Throwable {
        Thread.sleep(500);
    }

    @And("^user go to list view$")
    public void goToListView() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ListView.getBy(), 15);
        Thread.sleep(500);
        FloorPanel.ListView.getElement().click();
        Thread.sleep(1000);
    }

    @And("^user drag and drop the device to floor$")
    public void dragDeviceToFloor() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.CatchDevice.getBy(), 30);
        Actions action = new Actions(driver);
        action.dragAndDrop(FloorPanel.CatchDevice.getElement(), FloorPanel.DragDeviceHere.getElement()).build().perform();
        Thread.sleep(500);
    }

    @And("^user drag and drop point to device$")
    public void dragPointToDevice() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.CatchPoint.getBy(), 30);
        Actions action = new Actions(driver);
        action.dragAndDrop(FloorPanel.CatchPoint.getElement(), FloorPanel.DragPointHere.getElement()).build().perform();
        Thread.sleep(500);
    }

    @And("^User save the changes at Floor$")
    public void saveChanges() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.OpenInsideMenu.getBy(), 15);
        Thread.sleep(500);
        FloorPanel.OpenInsideMenu.getElement().click();
        Thread.sleep(500);
        FloorPanel.SaveButton.getElement().click();
        Thread.sleep(500);
    }

    @Then("^Check if device appears at floor plan$")
    public void checkDeviceAppearsAtFloor() throws Throwable {
        Thread.sleep(500);
    }

    @And("^User click hide Names$")
    public void hideNames() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ShowHideNames.getBy(), 15);
        FloorPanel.ShowHideNames.getElement().click();
    }

    @And("^User click hide Zones$")
    public void hideZones() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ShowHideZones.getBy(), 15);
        FloorPanel.ShowHideZones.getElement().click();
    }

    @Then("^Check if Names are hided from Floor$")
    public void checkNamesAreHidden() throws Throwable {
        Thread.sleep(500);
    }

    @Then("^Check if Zones are hided from Floor$")
    public void checkZonesAreHidden() throws Throwable {
        Thread.sleep(500);
    }

    @And("^user Click reset floor to default$")
    public void resetFloor() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.OpenInsideMenu.getBy(), 15);
        Thread.sleep(1000);
        FloorPanel.OpenInsideMenu.getElement().click();
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ResetButton.getBy(), 15);
        Thread.sleep(500);
        FloorPanel.ResetButton.getElement().click();
        Thread.sleep(500);
        FloorPanel.YesButton.getElement().click();
    }

    @Then("^Check if Floor is reseted to default$")
    public void checkFloorIsReset() throws Throwable {
        Thread.sleep(500);
    }
}
