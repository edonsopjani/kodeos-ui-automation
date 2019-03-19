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
        Thread.sleep(1000);
        //Add floor plan
        List<WebElement> fileInput = driver.findElements(By.xpath("//input"));
        Thread.sleep(1000);
        fileInput.get(0).sendKeys(PageObjectUtils.filePathForUpload("floor.svg"));
        Thread.sleep(2000);
    }

    @Then("^Check if floor plan appears$")
    public void checkFloorPlan() throws Throwable {
        Thread.sleep(1000);
    }

    @When("^User go to edit page$")
    public void goToEditPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.EditFloor.getBy(), 5);
        FloorPanel.EditFloor.getElement().click();
    }

    @And("^user upload floor zones$")
    public void uploadFloorZones() throws Throwable {
        //Add floor zones
        List<WebElement> fileInput = driver.findElements(By.xpath("//input"));
        Thread.sleep(1000);
        fileInput.get(1).sendKeys(PageObjectUtils.filePathForUpload("floor.svg"));
        Thread.sleep(2000);
    }

    @Then("^Check if zones appears at Floor plan$")
    public void checkZonesAppearsOnFloorPlan() throws Throwable {
        Thread.sleep(1000);
    }

    @And("^user go to list view$")
    public void goToListView() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ListView.getBy(), 5);
        Thread.sleep(1000);
        FloorPanel.ListView.getElement().click();
    }

    @And("^user drag and drop the device to floor$")
    public void dragDeviceToFloor() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.CatchDevice.getBy(), 5);
        Actions action = new Actions(driver);
        action.dragAndDrop(FloorPanel.CatchDevice.getElement(), FloorPanel.DragDeviceHere.getElement()).build().perform();
        Thread.sleep(1000);
    }

    @And("^user drag and drop point to device$")
    public void dragPointToDevice() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.CatchPoint.getBy(), 5);
        Actions action = new Actions(driver);
        action.dragAndDrop(FloorPanel.CatchPoint.getElement(), FloorPanel.DragPointHere.getElement()).build().perform();
        Thread.sleep(1000);
    }

    @And("^User save the changes at Floor$")
    public void saveChanges() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, FloorPanel.OpenInsideMenu.getBy(), 5);
        FloorPanel.OpenInsideMenu.getElement().click();
        Thread.sleep(1000);
        FloorPanel.SaveButton.getElement().click();
        Thread.sleep(2000);
    }

    @Then("^Check if device appears at floor plan$")
    public void checkDeviceAppearsAtFloor() throws Throwable {
        Thread.sleep(2000);
    }

    @And("^User click hide Names$")
    public void hideNames() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ShowHideNames.getBy(), 5);
        FloorPanel.ShowHideNames.getElement().click();
    }

    @And("^User click hide Zones$")
    public void hideZones() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, FloorPanel.ShowHideZones.getBy(), 5);
        FloorPanel.ShowHideZones.getElement().click();
    }

    @Then("^Check if Names are hided from Floor$")
    public void checkNamesAreHidden() throws Throwable {
        Thread.sleep(2000);
    }

    @Then("^Check if Zones are hided from Floor$")
    public void checkZonesAreHidden() throws Throwable {
        Thread.sleep(2000);
    }

    @And("^user Click reset floor to default$")
    public void resetFloor() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, FloorPanel.OpenInsideMenu.getBy(), 5);
        FloorPanel.OpenInsideMenu.getElement().click();
        Thread.sleep(1000);
        FloorPanel.ResetButton.getElement().click();
        Thread.sleep(1000);
        FloorPanel.YesButton.getElement().click();
    }

    @Then("^Check if Floor is reseted to default$")
    public void checkFloorIsReset() throws Throwable {
        Thread.sleep(2000);
    }

}
