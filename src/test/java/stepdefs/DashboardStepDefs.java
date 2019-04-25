package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.pages.DashboardPanel;
import pageobjects.pages.PageObjectUtils;

import java.util.List;

public class DashboardStepDefs extends CommonStepObjects {

    @When("^User clicks on (.*) building from the list$")
    public void goToBuilding(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.ExpandButton.getBy(), 15);
        Thread.sleep(1000);
        DashboardPanel.ExpandButton.getElement().click();
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, test);
        PageObjectUtils.ContainsText(driver, test).click();
    }

    @When("^User Click on floors button$")
    public void clickFloors() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.FloorsButton.getBy(), 15);
        Thread.sleep(1000);
        DashboardPanel.FloorsButton.getElement().click();
    }

    @When("^User Click on Devices button$")
    public void clickSystems() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.DevicesButton.getBy(), 15);
        Thread.sleep(1000);
        DashboardPanel.DevicesButton.getElement().click();
    }

    @When("^User Click on Points button$")
    public void clickPoint() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.PointsButton.getBy(), 5);
        Thread.sleep(1000);
        DashboardPanel.PointsButton.getElement().click();
    }

    @When("^User Click on Edit Dashboard$")
    public void clickEditDashboard() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.EditDashboard.getBy(), 15);
        DashboardPanel.EditDashboard.getElement().click();
    }

    @Then("^Check if list of floors appears")
    public void checkFloorPageAppears() throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue(DashboardPanel.CheckFloorList.getElement().isDisplayed());
    }

    @Then("^Check if all floors for that building appears on list")
    public void checkFloorsPageAppears() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "Floor 2");
    }

    @And("^User clicks on Expand button$")
    public void clickExpandButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.ExpandButton.getBy(), 15);
        DashboardPanel.ExpandButton.getElement().click();
        DashboardPanel.ExpandButton.getElement().click();
    }

    @Then("^Check if (.*) page is opened$")
    public void checkBuildingPageAppears(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "Names");
    }

    @And("^Clicks (.*) from the list$")
    public void clickBuildingFromList(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, building);
        PageObjectUtils.ContainsText(driver, building).click();
        Thread.sleep(1000);
    }

    //
    @And("^Click at (.*) Device$")
    public void clickDevice(String building) throws Throwable {
        PageObjectUtils.ContainsText(driver, building).click();
        PageObjectUtils.ContainsText(driver, building).click();
    }

    @And("^Click Save Dashboard$")
    public void saveClick() throws Throwable {
        DashboardPanel.SaveButton.getElement().click();
        Thread.sleep(1000);
    }

    @Then("^Check if the list of (.*) appears$")
    public void checkIfListOfPointsAppears(String point) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + point + "')]]"), 15);
    }

    @And("^Add (.*) and (.*) points for (.*) Device at Summary Widget$")
    public void addPointsToWidget(String point1, String point2, String device) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[@class='mat-row ng-star-inserted']"), 15);
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='mat-row ng-star-inserted']"));
        for (WebElement element : elements
        ) {
            String text = element.getText();
            if (text.contains(device)) {
                PageObjectUtils.IsElementVisible(driver, By.xpath("//tr[@class='mat-row ng-star-inserted']//*[contains(text(),'" + device + "')]"), 15);
                Thread.sleep(1000);
                driver.findElement(By.xpath("//tr[@class='mat-row ng-star-inserted']//*[contains(text(),'" + device + "')]")).click();
                break;
            }

        }
        Thread.sleep(1000);
        PageObjectUtils.ContainsText(driver, device).click();

        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[@class='points-list-element__container']//*[contains(text(),'" + point1 + "')]"), 15);
        driver.findElement(By.xpath("//*[@class='points-list-element__container']//*[contains(text(),'" + point1 + "')]")).click();
        driver.findElement(By.xpath("//*[@class='points-list-element__container']//*[contains(text(),'" + point2 + "')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@tabindex='-1']//span[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
    }

    @And("^Add (.*) Device at Widget$")
    public void addDeviceAtWidget(String device) throws Throwable {
        List<WebElement> exist = driver.findElements(By.xpath("//*[@class='selected-device-content ng-star-inserted']//*[contains(text(),'" + device + "')]"));
        if (exist.isEmpty()) {
            PageObjectUtils.ContainsText(driver, device).click();
            Thread.sleep(1000);
            PageObjectUtils.ContainsText(driver, "Save Widget").click();
        } else {
            PageObjectUtils.ContainsText(driver, device).click();
            Thread.sleep(1000);
            PageObjectUtils.ContainsText(driver, device).click();
            Thread.sleep(1000);
            PageObjectUtils.ContainsText(driver, "Save Widget").click();
        }
    }

    @And("^Click add for (.*) Widget$")
    public void clickAddButtonForWidget(String building) throws Throwable {
        List<WebElement> elements = driver.findElements(By.cssSelector(".inactive-widget-item.ng-star-inserted"));
        for (WebElement element : elements
        ) {
            String text = element.getText();
            if (text.contains(building)) {

                element.findElement(By.tagName("i")).click();
                break;
            }

        }
    }

    @And("^Click edit for (.*) Widget$")
    public void clickEditButtonForWidget(String building) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DashboardPanel.EditNavigationWidget.getBy(), 15);
        if (building.equals("Navigation")) {
            PageObjectUtils.IsElementVisible(driver, DashboardPanel.EditNavigationWidget.getBy(), 15);
            Thread.sleep(1000);
            DashboardPanel.EditNavigationWidget.getElement().click();
        } else {
            PageObjectUtils.IsElementVisible(driver, DashboardPanel.EditSummaryWidget.getBy(), 15);
            Thread.sleep(1000);
            DashboardPanel.EditSummaryWidget.getElement().click();
        }
    }

    @When("^User Click (.*) from Navigation Widget$")
    public void goToDeviceFromNavigationWidget(String device) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[@class='device-label' and contains(text(),'" + device + "')]"), 15);
        driver.findElement(By.xpath("//*[@class='device-label' and contains(text(),'" + device + "')]")).click();
    }

    @When("^User Click (.*) from Summary Widget$")
    public void goToDeviceFromSummaryWidget(String device) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[@class='device-title-label' and contains(text(),'" + device + "')]"), 15);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='device-title-label' and contains(text(),'" + device + "')]")).click();
    }

    @And("^Click remove for (.*) Widget$")
    public void removeWidget(String building) throws Throwable {

        Thread.sleep(2000);
        if (building.equals("Navigation")) {
            PageObjectUtils.IsElementVisible(driver, DashboardPanel.RemoveNavigationWidget.getBy(), 15);
            DashboardPanel.RemoveNavigationWidget.getElement().click();
            Thread.sleep(1000);
        } else {
            PageObjectUtils.IsElementVisible(driver, DashboardPanel.RemoveSummaryWidget.getBy(), 15);
            DashboardPanel.RemoveSummaryWidget.getElement().click();
            Thread.sleep(1000);
        }
    }

    @Then("^Check if (.*) Device pop-up appears$")
    public void checkDevicePopUpAppears(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, building);
    }

    @Then("^Check if (.*) Widget appears on Dashboard$")
    public void checkWidgetAdded(String building) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, building);
    }

    @Then("^Check if (.*) device appears on Navigation Widget$")
    public void checkWidgetUpdated(String device) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, device);
    }

    @Then("^Check if (.*) and (.*) points appears on Summary Widget$")
    public void checkPointIsUpdated(String point1, String point2) throws Throwable {
        Thread.sleep(2000);
        PageObjectUtils.CheckContainsText(driver, point1);
    }

    @Then("^Check if (.*) Widget disappears from Dashboard$")
    public void checkWidgetRemoved(String building) throws Throwable {
        Thread.sleep(1000);
        if (building.contains("Navigation")) {
            List<WebElement> element = driver.findElements(By.xpath("//*[text()[contains(.,'Navigation')]]"));
            Assert.assertFalse(element.isEmpty());
        } else {
            List<WebElement> element = driver.findElements(By.xpath("//*[text()[contains(.,'Summary')]]"));
            Assert.assertFalse(element.isEmpty());
        }
    }

    @Then("^Check if the Edit Dashboard page appears$")
    public void checkIfEditDashboardPageAppears() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "Save");
    }

}
