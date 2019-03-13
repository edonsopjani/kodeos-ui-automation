package stepdefs.websitesteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.DevicePanel;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.PointsPanel;
import stepdefs.CommonStepObjects;

import java.util.List;

public class PointsStepDefs extends CommonStepObjects {

    @When("^add Tag (.*) and update point$")
    public void addTag(String tag) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.AddTag.getBy(), 5);
        PointsPanel.AddTag.getElement().click();
        PointsPanel.AddTag.getElement().sendKeys(tag);
        Thread.sleep(1000);
        PointsPanel.AddTag.getElement().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 5);
        PointsPanel.SaveButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConfirmButton.getBy(), 5);
        PointsPanel.ConfirmButton.getElement().click();
        Thread.sleep(1000);
    }

    @When("^remove Tag (.*) and update point$")
    public void removeTag(String tag) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.RemoveTag.getBy(), 5);
        PointsPanel.RemoveTag.getElement().click();
        PointsPanel.RemoveTag.getElement().sendKeys(tag);
        Thread.sleep(1000);
        PointsPanel.RemoveTag.getElement().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 5);
        PointsPanel.SaveButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConfirmButton.getBy(), 5);
        PointsPanel.ConfirmButton.getElement().click();
        Thread.sleep(1000);
    }

    @And("^Click Point batch update button$")
    public void pointBatchUpdate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.PointsBatchUpdate.getBy(), 5);
        PointsPanel.PointsBatchUpdate.getElement().click();
    }

    @And("^User Click edit Points button$")
    public void editPointButton() throws Throwable {
        Thread.sleep(2000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.EditPointsButton.getBy(), 5);
        PointsPanel.EditPointsButton.getElement().click();
    }

    @And("^Select Point with name (.*)$")
    public void selectPoint(String point) throws Throwable {
        Thread.sleep(2000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point + "')]]"), 5);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + point + "')]]")).click();
    }

    @Then("^Check if point name is changed to (.*)$")
    public void checkPoint(String point) throws Throwable {
        Thread.sleep(2000);
        List<WebElement> points = driver.findElements(By.xpath("//label[text()[contains(.,'" + point + "')]]"));
        Assert.assertFalse(points.isEmpty());
    }

    @And("^Change point name to (.*)$")
    public void changePointName(String point) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.EditName.getBy(), 5);
        Thread.sleep(1000);
        PointsPanel.EditName.getElement().clear();
        Thread.sleep(1000);
        PointsPanel.EditName.getElement().sendKeys(point);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 5);
        PointsPanel.SaveButton.getElement().click();
    }

    @And("^User click connect points button$")
    public void connectPointsButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConnectPointsButton.getBy(), 5);
        PointsPanel.ConnectPointsButton.getElement().click();
    }

    @And("^User connect point (.*) with (.*)$")
    public void connectTwoPoints(String point1, String point2) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point1 + "')]]"), 5);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + point1 + "')]]")).click();
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point2 + "')]]"), 5);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + point2 + "')]]")).click();
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveConnectedPointsButton.getBy(), 5);
        PointsPanel.SaveConnectedPointsButton.getElement().click();
    }

    @Then("^Check if points are connected$")
    public void checkPointsConnected() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.ConnectPointsButton.getBy(), 5);
        Thread.sleep(1000);
    }

    @Then("^Check if Point is updated$")
    public void CheckPointUpdated() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.AddTag.getBy(), 5);
        Thread.sleep(1000);
    }
}
