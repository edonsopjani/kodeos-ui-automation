package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.PointsPanel;

import java.util.List;

public class PointsStepDefs extends CommonStepObjects {

    @When("^add Tag (.*) and update point$")
    public void addTag(String tag) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.AddTag.getBy(), 15);
        PointsPanel.AddTag.getElement().click();
        PointsPanel.AddTag.getElement().sendKeys(tag);
        //Thread.sleep(1000);
        PointsPanel.AddTag.getElement().sendKeys(Keys.ENTER);
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 15);
        PointsPanel.SaveButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConfirmButton.getBy(), 15);
        PointsPanel.ConfirmButton.getElement().click();
        //Thread.sleep(1000);
    }

    @When("^remove Tag (.*) and update point$")
    public void removeTag(String tag) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.RemoveTag.getBy(), 15);
        PointsPanel.RemoveTag.getElement().click();
        PointsPanel.RemoveTag.getElement().sendKeys(tag);
        //Thread.sleep(1000);
        PointsPanel.RemoveTag.getElement().sendKeys(Keys.ENTER);
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 15);
        PointsPanel.SaveButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConfirmButton.getBy(), 15);
        PointsPanel.ConfirmButton.getElement().click();
        //Thread.sleep(1000);
    }

    @And("^Click Point batch update button$")
    public void pointBatchUpdate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.PointsBatchUpdate.getBy(), 15);
        PointsPanel.PointsBatchUpdate.getElement().click();
    }

    @And("^User Click edit Points button$")
    public void editPointButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.EditPointsButton.getBy(), 15);
        Thread.sleep(500);
        PointsPanel.EditPointsButton.getElement().click();
    }

    @And("^Select Point with name (.*)$")
    public void selectPoint(String point) throws Throwable {
        //Thread.sleep(2000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point + "')]]"), 15);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + point + "')]]")).click();
    }

    @Then("^Check if point name is changed to (.*)$")
    public void checkPoint(String point) throws Throwable {
        Thread.sleep(500);
        List<WebElement> points = driver.findElements(By.xpath("//label[text()[contains(.,'" + point + "')]]"));
        Assert.assertFalse(points.isEmpty());
    }

    @And("^Change point name to (.*)$")
    public void changePointName(String point) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.EditName.getBy(), 15);
        Thread.sleep(150);
        PointsPanel.EditName.getElement().clear();
        Thread.sleep(500);
        PointsPanel.EditName.getElement().sendKeys(point);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 15);
        PointsPanel.SaveButton.getElement().click();
    }

    @And("^User click connect points button$")
    public void connectPointsButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConnectPointsButton.getBy(), 15);
        Thread.sleep(500);
        PointsPanel.ConnectPointsButton.getElement().click();
    }

    @And("^User click (.*) point write button$")
    public void clickWritePoint(String point) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.WritePoint.getBy(), 15);
        Thread.sleep(500);
        PointsPanel.WritePoint.getElement().click();
    }

    @And("^User add (.*) as reason$")
    public void addReason(String reason) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.AddReason.getBy(), 15);
        //Thread.sleep(1000);
        PointsPanel.AddReason.getElement().sendKeys(reason);
        //Thread.sleep(1000);
    }

    @And("^User turn on point and click save$")
    public void turnOnPoint() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.TurnOn.getBy(), 15);
        //Thread.sleep(1000);
        PointsPanel.TurnOn.getElement().click();
        //Thread.sleep(1000);
        PointsPanel.SaveChanges.getElement().click();
    }

    @And("^User click save changes$")
    public void saveChanges() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.TurnOn.getBy(), 15);
        //Thread.sleep(1000);
        PointsPanel.TurnOn.getElement().click();
        //Thread.sleep(1000);
        PointsPanel.SaveChanges.getElement().click();
    }

    @And("^User turn off point and click save$")
    public void turnOffPoint() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.TurnOff.getBy(), 15);
        //Thread.sleep(1000);
        PointsPanel.TurnOff.getElement().click();
        //Thread.sleep(1000);
        PointsPanel.SaveChanges.getElement().click();
    }

    @Then("^Check if write point is saved successfully$")
    public void checkPointIsUpdated() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SavedSuccessfully.getBy(), 15);
    }

    @And("^User connect point (.*) with (.*)$")
    public void connectTwoPoints(String point1, String point2) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point1 + "')]]"), 15);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + point1 + "')]]")).click();
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point2 + "')]]"), 15);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + point2 + "')]]")).click();
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveConnectedPointsButton.getBy(), 15);
        PointsPanel.SaveConnectedPointsButton.getElement().click();
    }

    @Then("^Check if points are connected$")
    public void checkPointsConnected() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConnectPointsButton.getBy(), 15);
        //Thread.sleep(1000);
    }

    @Then("^Check if Point is updated$")
    public void CheckPointUpdated() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.AddTag.getBy(), 15);
        //Thread.sleep(1000);
    }
}
