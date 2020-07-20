package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.pages.BuildingPanel;
import pageobjects.pages.Discovery;
import pageobjects.pages.PageObjectUtils;

import java.util.List;

public class DiscoveryStepDefs extends CommonStepObjects {

    @And("^User click Device Discovery button$")
    public void discoveryDevices() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.DiscoverDevicesButton.getBy(), 15);
        Discovery.DiscoverDevicesButton.getElement().click();
    }

    @And("^User select all Edge Devices$")
    public void selectAllEdgeDevices() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.CheckBox.getBy(), 15);
        BuildingPanel.CheckBox.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.NextButton.getBy(), 15);
        Discovery.NextButton.getElement().click();
    }

    @And("^User Click New Discover button$")
    public void clickNewDiscover() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.NewDiscovery.getBy(), 15);
        Discovery.NewDiscovery.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.DiscoverButton.getBy(), 15);
        Discovery.DiscoverButton.getElement().click();
    }

    @Then("^Check if Devices appears on the list$")
    public void checkDeviceAppears() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "BR129");
    }

    @Then("^Check if devices are discovered successfully$")
    public void checkDiscovery() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.DiscoverSuccessfulMessage.getBy(), 40);
    }

    @Then("^Check if (.*) device appears on the list$")
    public void checkDeviceAppearsOnList(String device) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + device + "')]]"), 15);
    }

    @When("^User delete (.*) device from list$")
    public void deleteDeviceFromList(String device) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.BR129ThreeDotButton.getBy(), 5);
        Thread.sleep(1000);
        Discovery.BR129ThreeDotButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.DeleteButton.getBy(), 5);
        Thread.sleep(1000);
        Discovery.DeleteButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.YesButton.getBy(), 5);
        Discovery.YesButton.getElement().click();
    }

    @And("^User Click Update Discover button$")
    public void clickUpdateDiscover() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.UpdateDiscovery.getBy(), 15);
        Discovery.UpdateDiscovery.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.DiscoverButton.getBy(), 15);
        Discovery.DiscoverButton.getElement().click();
    }

    @And("^User click add BR129 device from discover results$")
    public void addDeviceFromDiscover() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.ThreeDot.getBy(), 15);
        Discovery.ThreeDot.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.AddDevice.getBy(), 15);
        Thread.sleep(1000);
        Discovery.AddDevice.getElement().click();
    }

    @And("^User remove points from device and let only one$")
    public void removePoints() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.RemovePoints.getBy(), 15);
        List<WebElement> Points = Discovery.RemovePoints.getElements();

        int i = 0;
        for (WebElement Point : Points) {
            if (i < Points.size() - 1) {
                Point.click();
                Thread.sleep(500);
                i++;
            }
        }
    }

    @Then("^Check if point appears on device details$")
    public void checkPointAppears() throws Throwable {
        Thread.sleep(1000);
        List<WebElement> points = driver.findElements(By.xpath("//label[@class='point-name']"));

        Assert.assertEquals(points.size(), 1);
    }

    @And("^User click save changes after discover$")
    public void userClickSaveChangesAfterDiscover() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.SaveButton.getBy(), 5);
        Discovery.SaveButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.OKButton.getBy(), 5);
        Discovery.OKButton.getElement().click();
    }

    @And("^User click save changes and click finish$")
    public void userClickSaveChangesAndClickFinish() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Discovery.SaveButton.getBy(), 15);
        Discovery.SaveButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.FinishButton.getBy(), 15);
        Thread.sleep(1500);
        Discovery.FinishButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Discovery.OKButton.getBy(), 5);
        Discovery.OKButton.getElement().click();
    }
}