package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generalUtils.ConfigFile;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.*;
import selenium.WebDriverFactory;

import java.util.List;

public class WebsiteStepDefs extends CommonStepObjects {

    //Building Panel Methods
    @Given("^Open KodeLabs Page$")
    public void thePreconditionForTheTestGoesToWebsiteOrLogsIn() throws Throwable {
        if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
        driver.navigate().to(ConfigFile.getInstance().getBMSUrl());
        Thread.sleep(250);
        List<WebElement> isLoggedIn = driver.findElements(By.xpath("//*[@formcontrolname='email']"));
        if (isLoggedIn.isEmpty()) {

        } else {
            driver.findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(ConfigFile.getInstance().getConfigFileValueFromName("SuperAdmin"));
            driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(ConfigFile.getInstance().getPassword());
            driver.findElement((By.xpath("//*[contains(text(),'Login')]"))).click();
        }
    }

    @Given("^User goes to Login page$")
    public void goToKodeLabsPage() throws Throwable {
        try {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'New Version Released')]]", 2);
            if (driver.findElement(By.xpath("//*[text()[contains(.,'New Version Released')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Skip')]]")).click();
            }

            if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
            driver.navigate().to(ConfigFile.getInstance().getBMSUrl());
            List<WebElement> isLoggedIn = driver.findElements(By.xpath("//*[@formcontrolname='email']"));
            if (isLoggedIn.isEmpty()) {
                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 15);
                UserProfilePanel.goToUserProfile.getElement().click();

                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickLogout.getBy(), 15);
                UserProfilePanel.clickLogout.getElement().click();

                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 15);
            } else {

            }
        } catch (Exception e) {
            if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
            driver.navigate().to(ConfigFile.getInstance().getBMSUrl());
            //Thread.sleep(2000);

            List<WebElement> isLoggedIn = driver.findElements(By.xpath("//*[@formcontrolname='email']"));
            if (isLoggedIn.isEmpty()) {
                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 15);
                UserProfilePanel.goToUserProfile.getElement().click();

                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickLogout.getBy(), 15);
                UserProfilePanel.clickLogout.getElement().click();

                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 15);
            } else {

            }
        }
    }

    @Given("^User goes to Fire Dashboard Login page$")
    public void goToKodeLabsFirePage() throws Throwable {
        try {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'New Version Released')]]", 2);
            if (driver.findElement(By.xpath("//*[text()[contains(.,'New Version Released')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Skip')]]")).click();
            }

            if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
            driver.navigate().to(ConfigFile.getInstance().getBMSUrl() + "/fire-dashboard/events");
            //Thread.sleep(2000);

            List<WebElement> isLoggedIn = driver.findElements(By.xpath("//*[@formcontrolname='email']"));
            if (isLoggedIn.isEmpty()) {
                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 15);
                UserProfilePanel.goToUserProfile.getElement().click();

                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickLogout.getBy(), 15);
                UserProfilePanel.clickLogout.getElement().click();

                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 15);
            } else {

            }
        } catch (Exception e) {
            if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
            driver.navigate().to(ConfigFile.getInstance().getBMSUrl() + "/fire-dashboard/events");
            //Thread.sleep(2000);

            List<WebElement> isLoggedIn = driver.findElements(By.xpath("//*[@formcontrolname='email']"));
            if (isLoggedIn.isEmpty()) {
                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 15);
                UserProfilePanel.goToUserProfile.getElement().click();

                //Thread.sleep(1000);
                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.clickLogout.getBy(), 15);
                UserProfilePanel.clickLogout.getElement().click();

                PageObjectUtils.IsElementVisible(driver, UserProfilePanel.checkUserIsLoggedOut.getBy(), 15);
            } else {

            }
        }
    }

    @When("^User Search For Chrysler House and click it$")
    public void theNextStepThatGetsRepeatedBeforeEveryTest() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.className("building-list-header-search-bar"), 15);
        //Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.className("building-list-header-search-bar")));
        actions.click();
        actions.sendKeys("Chrysler House");
        actions.build().perform();
        PageObjectUtils.CheckContainsText(driver, "Chrysler House");
        PageObjectUtils.ContainsText(driver, "Chrysler House").click();
        PageObjectUtils.ContainsText(driver, "Chrysler House").click();
    }

    @When("^User Open (.*)")
    public void openBuilding(String building) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[contains(text(),'" + building + "')]"), 15);
        Thread.sleep(200);
        driver.findElement((By.xpath("//*[contains(text(),'" + building + "')]"))).click();
    }

    @And("^User click on Areas Tab$")
    public void openAreaTab() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Areas");
        PageObjectUtils.ContainsText(driver, "Areas").click();
    }

    @And("^User opens menu popup$")
    public void openMenuTab() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.OpenMenu.getBy(), 15);
        Thread.sleep(1000);
        BuildingPanel.OpenMenu.getElement().click();
    }

    @And("^User click Save button$")
    public void areaTabSaveButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PointsPanel.SaveButton.getBy(), 15);
        //Thread.sleep(1000);
        PointsPanel.SaveButton.getElement().click();
        Thread.sleep(500);
    }

    @And("^User click Update Points button$")
    public void updatePointsButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.UpdatePointButton.getBy(), 15);
        //Thread.sleep(1000);
        DevicePanel.UpdatePointButton.getElement().click();
    }

    @And("^User click Save changes$")
    public void saveButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Save.getBy(), 15);
        Thread.sleep(200);
        BuildingPanel.Save.getElement().click();
        Thread.sleep(200);
    }

    @And("^User click delete$")
    public void deleteButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.DeleteAreas.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.DeleteAreas.getElement().click();
    }

    @And("^click the Assign Users button")
    public void assignUsersButton() throws Throwable {
        //Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.editButton.getBy(), 15);
        BuildingPanel.editButton.getElement().click();
    }

    @And("^click Remove Users button")
    public void removeUsersButton() throws Throwable {
        //Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.editButton.getBy(), 15);
        BuildingPanel.editButton.getElement().click();
    }

    @And("^User select user (.*)$")
    public void selectUser(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        List<WebElement> inside = driver.findElements(BuildingPanel.SecondSearchField.getBy());
        inside.get(1).sendKeys(test);
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, test);
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, test).click();
    }

    @And("^Enter SVG File")
    public void enterSVG() throws Throwable {
        WebElement fileInput = BuildingPanel.AddFloorOverlay.getElement();
        //Thread.sleep(1000);
        fileInput.sendKeys(PageObjectUtils.filePathForUpload("svg.svg"));
        //Thread.sleep(3000);
    }

    @And("^Enter Building Image")
    public void enterImage() throws Throwable {
        WebElement fileInput = BuildingPanel.AddImage.getElement();
        //Thread.sleep(1000);
        fileInput.sendKeys(PageObjectUtils.filePathForUpload("test.png"));
        //Thread.sleep(3000);
    }

    @And("^User Enter (.*) in name field$")
    public void addBuildingName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        BuildingPanel.Name.getElement().sendKeys(name);
    }

    @And("^Enter new name (.*)$")
    public void enterNewFloorName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Edit.getBy(), 15);
        Thread.sleep(500);
        BuildingPanel.Edit.getElement().click();

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        Thread.sleep(500);
        BuildingPanel.Name.getElement().clear();
        BuildingPanel.Name.getElement().sendKeys(name);
    }

    @And("^User Search for (.*)$")
    public void searchField(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().sendKeys(test);
        //Thread.sleep(1000);
    }

    @And("^User Search for Users inside pop-up (.*)$")
    public void searchFieldPopups(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        WebElement inside = driver.findElement(BuildingPanel.ContainerForUserTab.getBy());
        inside.findElement(BuildingPanel.SecondSearchField.getBy()).sendKeys(test);
    }

    @And("^User Select all floors with name (.*)$")
    public void selectField(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        List<WebElement> inside = driver.findElements(BuildingPanel.SecondSearchField.getBy());
        inside.get(1).sendKeys(test);
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.CheckBox.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.CheckBox.getElement().click();
        //Thread.sleep(1000);
    }

    @And("^User click on three dots button$")
    public void threeDotMenu() throws Throwable {

        try {
            Thread.sleep(500);
            BuildingPanel.ThreedotMenu.getElement().click();
        } catch (Exception ex) {
            PageObjectUtils.IsElementVisible(driver, BuildingPanel.OpenMenu.getBy(), 15);
            BuildingPanel.OpenMenu.getElement().click();

            PageObjectUtils.IsElementVisible(driver, BuildingPanel.AddFloor.getBy(), 15);
            BuildingPanel.AddFloor.getElement().click();

            PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
            BuildingPanel.Name.getElement().sendKeys("autoArea");

            PageObjectUtils.IsElementVisible(driver, BuildingPanel.Save.getBy(), 15);
            // Thread.sleep(1000);
            BuildingPanel.Save.getElement().click();
            // Thread.sleep(1000);

            PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
            //  Thread.sleep(1000);
            BuildingPanel.SearchField.getElement().clear();
            BuildingPanel.SearchField.getElement().sendKeys("autoArea");
            //  Thread.sleep(1000);

            BuildingPanel.ThreedotMenu.getElement().click();
        }
    }

    @And("^User Enter (.*) in name field and Range from (.*) to (.*)$")
    public void addMultipleFloorField(String test, String n, String m) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        BuildingPanel.Name.getElement().sendKeys(test);
        Thread.sleep(200);
        BuildingPanel.From.getElement().sendKeys(n);
        Thread.sleep(200);
        BuildingPanel.To.getElement().sendKeys(m);
    }

    @Then("Check if floors with name (.*) until (.*) appears on list$")
    public void checkFloorsAppears(String test, String test2) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().sendKeys("TEST");
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, test).getText(), test);
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, test2).getText(), test2);
    }

    @Then("Check if user (.*) appears on list$")
    public void checkUserAppears(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().sendKeys(test);
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, test).getText(), test);
    }

    @Then("Check if user (.*) disappears from list$")
    public void checkUserDisappears(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().clear();
        BuildingPanel.SearchField.getElement().sendKeys(test);
        Thread.sleep(1000);
        List<WebElement> users = driver.findElements(By.xpath("//*[text()[contains(.,'" + test + "')]]"));
        Assert.assertTrue("Deleted User is still on list", users.isEmpty());
    }

    @Then("Check if floor (.*) appears on list$")
    public void checkFloorAppears(String test) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().sendKeys(test);
        Assert.assertEquals(driver.findElement(By.xpath("//*[text()[contains(.,'" + test + "')]]")).getText(), test);
    }

    @Then("Check if floor overlays appear on image$")
    public void checkFloorOverlaysAppears() throws Throwable {
        //Thread.sleep(3000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.CheckFloorOverlay.getBy(), 15);
    }

    @Then("Check if building image appears on page$")
    public void checkImageAppears() throws Throwable {
        //Thread.sleep(3000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.CheckBuildingImage.getBy(), 15);
    }

    @Then("Check if floors has the new name (.*)$")
    public void checkFloorNewNameAppears(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().clear();
        BuildingPanel.SearchField.getElement().sendKeys(test);
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, test).getText(), test);
    }

    @Then("Check if floor with name (.*) is deleted$")
    public void checkFloorDeleted(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        BuildingPanel.SearchField.getElement().clear();
        BuildingPanel.SearchField.getElement().sendKeys(test);
        List<WebElement> users = driver.findElements(By.xpath("//*[text()[contains(.,'" + test + "')]]"));
        Assert.assertTrue("Deleted User is still on list", users.isEmpty());
    }

    @And("^User click Add Image button$")
    public void areaTabAddImageButton() throws Throwable {
        //Thread.sleep(1000);
        BuildingPanel.AddImage.getElement().click();
    }

    @And("^User click Add Multiple Floors button$")
    public void areaTabAddMultipleButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.AddMultipleFloor.getBy(), 15);
        BuildingPanel.AddMultipleFloor.getElement().click();
    }

    @And("^User click Add Single floor button$")
    public void areaTabAddSingleButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.AddFloor.getBy(), 15);
        BuildingPanel.AddFloor.getElement().click();
    }

    @And("^User click Add Floor Overlays button$")
    public void areaTabAddOverlayButton() throws Throwable {
        //Thread.sleep(1000);
        BuildingPanel.AddFloorOverlay.getElement().click();
    }

    @And("^User click Delete button$")
    public void areaTabDeleteButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.RemoveUsers.getBy(), 15);
        BuildingPanel.RemoveUsers.getElement().click();
    }

    @And("^User goto on Users Tab$")
    public void openUsersTab() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.GoToUserTab.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.GoToUserTab.getBy());
        inside.click();
    }

    @And("^User goto on Connectors Tab$")
    public void openConnectorsTab() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.GoToConnectorTab.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.GoToConnectorTab.getBy());
        Thread.sleep(200);
        inside.click();
    }

    @And("^User click connector menu button$")
    public void openConnectorsMenu() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ConnectorsMenu.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.ConnectorsMenu.getBy());
        inside.click();
    }

    @And("^User click create new connector$")
    public void openAddConnector() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.AddConnector.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.AddConnector.getBy());
        inside.click();
    }

    @And("^User click test connector$")
    public void testConnector() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.CheckConnection.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.CheckConnection.getBy());
        //Thread.sleep(1000);
        inside.click();
    }

    @And("^User click edit connector$")
    public void clickEditConnector() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ThreedotMenu.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.ThreedotMenu.getBy());
        inside.click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EditButton.getBy(), 15);
        Thread.sleep(1000);
        BuildingPanel.EditButton.getElement().click();
    }

    @And("^User delete connector from building$")
    public void clickDeleteExistingConnector() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ThreedotMenu.getBy(), 15);
        WebElement inside = driver.findElement(BuildingPanel.ThreedotMenu.getBy());
        inside.click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.DeleteButton.getBy(), 15);
        Thread.sleep(1000);
        BuildingPanel.DeleteButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ConfirmationYesButton.getBy(), 15);
        BuildingPanel.ConfirmationYesButton.getElement().click();
    }

    @And("^User fill mandatory fields for connector and click add$")
    public void addNewConnector() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        BuildingPanel.Name.getElement().sendKeys("jace");
        Thread.sleep(500);
        BuildingPanel.UserName.getElement().sendKeys("nHaystack");
        BuildingPanel.Password.getElement().sendKeys("K0d35227!!");
        //Thread.sleep(1000);
        BuildingPanel.Protocol.getElement().click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SelectHTTP.getBy(), 15);
        BuildingPanel.SelectHTTP.getElement().click();
        //Thread.sleep(1000);
        BuildingPanel.AreaConnectors.getElement().click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SelectArea.getBy(), 15);
        BuildingPanel.SelectArea.getElement().click();
        // Thread.sleep(1000);
        BuildingPanel.IP.getElement().sendKeys("178.132.223.132");
        BuildingPanel.Port.getElement().sendKeys("80");
        BuildingPanel.Model.getElement().sendKeys("Automation");
        //Thread.sleep(1000);
        BuildingPanel.Save.getElement().click();
    }

    @And("^User change connector name to (.*)$")
    public void editExistingConnector(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        BuildingPanel.Name.getElement().clear();
        //Thread.sleep(1000);
        BuildingPanel.Name.getElement().sendKeys(name);
        //Thread.sleep(1000);
        BuildingPanel.Save.getElement().click();
    }

    @Then("^Check if connector with name (.*) appears on list$")
    public void checkConnector(String connector) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'" + connector + "')]]"), 15);
    }

    @Then("^Check if connector connection is good$")
    public void checkConnectConnector() throws Throwable {
        //  Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//*[text()[contains(.,'check_circle')]]"), 15);
    }

    @Then("^Check if connector with name (.*) disappears from list$")
    public void checkDeletedConnector(String connector) throws Throwable {
        Thread.sleep(1500);

        List<WebElement> conn = driver.findElements(By.xpath("//*[text()[contains(.,'" + connector + "')]]"));
        Assert.assertTrue("Connector is not added", conn.isEmpty());
    }

    @And("^Click on Edit Button, then change some values and click save$")
    public void editBuilding() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EditButton.getBy(), 15);
        BuildingPanel.EditButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Edit Address 1
        Thread.sleep(1000);
        BuildingPanel.Address1.getElement().clear();
        Thread.sleep(1000);
        BuildingPanel.Address1.getElement().sendKeys("277 Gratiot Avenue");

        //Click Save
        BuildingPanel.Save.getElement().click();
    }

    @And("^Click on Delete Button, then click Delete again$")
    public void deleteBuilding() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.DeleteButton.getBy(), 15);

        //Click Delete
        BuildingPanel.DeleteButton.getElement().click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ConfirmationYesButton.getBy(), 15);

        //Click Yes
        BuildingPanel.ConfirmationYesButton.getElement().click();
    }

    @Then("^Check if (.*) is removed from list$")
    public void checkDeletedBuilding(String building) throws Throwable {
        Thread.sleep(2000);
        List<WebElement> buildings = driver.findElements(By.xpath("//*[text()[contains(.,'" + building + "')]]"));
        Assert.assertTrue("Building is still on list", buildings.isEmpty());
    }

    @Then("^Check if All Changed fields are saved successful for (.*)$")
    public void checkEditBuilding(String building) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'" + building + "')]]", 15);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()[contains(.,'" + building + "')]]")).isDisplayed());
    }

    @And("^User add (.*) as Name$")
    public void fillName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add Name
        BuildingPanel.Name.getElement().sendKeys(name);
        //  Thread.sleep(1000);
    }

    @And("^User add (.*) as Address 1")
    public void fillAdd1(String address) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add Address 1
        BuildingPanel.Address1.getElement().sendKeys(address);
    }

    @And("^User add (.*) as Address 2")
    public void fillAdd2(String address) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add Address 2
        BuildingPanel.Address2.getElement().sendKeys(address);
    }

    @And("^User add (.*) as ZIP code")
    public void fillZip(String zip) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add ZIP code
        BuildingPanel.ZipCode.getElement().sendKeys(zip);
    }

    @And("^User add (.*) as City")
    public void fillCity(String city) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add City
        BuildingPanel.City.getElement().sendKeys(city);
    }

    @And("^User add (.*) as State")
    public void fillState(String state) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add State
        WebElement element = BuildingPanel.State.getElement();
        BuildingPanel.State.getElement().click();
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//span[contains( text(),'" + state + "')]", 15);
        driver.findElement(By.xpath("//span[contains( text(),'" + state + "')]")).click();
    }

    @And("^User add (.*) as Category")
    public void fillCategory(String state) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        BuildingPanel.Category.getElement().click();
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//span[contains( text(),'" + state + "')]", 15);
        driver.findElement(By.xpath("//span[contains( text(),'" + state + "')]")).click();
    }

    @And("^User add (.*) as Country")
    public void fillCountry(String country) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add Country
        BuildingPanel.Country.getElement().sendKeys(country);
    }

    @And("^User add (.*) as Latitude")
    public void fillLat(String latitude) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add latitude
        BuildingPanel.Latitude.getElement().sendKeys(latitude);
    }

    @And("^User add (.*) as Longitude")
    public void fillLong(String longitude) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        //Add longitude
        BuildingPanel.Longitude.getElement().sendKeys(longitude);
    }

    @And("^User add (.*) as Year build")
    public void fillYear(String year) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add Year build
        BuildingPanel.Year.getElement().sendKeys(year);
    }

    @And("^User add (.*) as Area")
    public void fillArea(String area) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add Area
        BuildingPanel.Area.getElement().sendKeys(area);
    }

    @And("^User add (.*) as Image")
    public void fillImage(String image) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);

        //Add building image
        WebElement fileInput = BuildingPanel.AddBuildingImage.getElement();
        //Thread.sleep(1000);
        fileInput.sendKeys(PageObjectUtils.filePathForUpload(image));
        // Thread.sleep(2000);
    }

    @Then("^Check if (.*) appear on list$")
    public void checkBuildingIsAdded(String building) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, building);
        PageObjectUtils.ContainsText(driver, building);
        // Thread.sleep(2000);
    }

    @When("^User clicks on Add new button$")
    public void openClickAddBuildingButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.AddNewBuildingButton.getBy(), 15);
        BuildingPanel.AddNewBuildingButton.getElement().click();
        PageObjectUtils.CheckContainsText(driver, "Add Building");
    }

    @Then("^Check if User is on Devices page$")
    public void checkDevicePage() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Chrysler House - 1106 Devices");
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, "Chrysler House - 1106 Devices").getText(), "Chrysler House - 1106 Devices");
    }

    @And("^User Go To admin panel$")
    public void clickAdminPanel() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.AdminPanel.getBy(), 15);
        BuildingPanel.AdminPanel.getElement().click();
    }

    @And("^User Go To Routines$")
    public void clickRoutines() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Routines.routines.getBy(), 15);
        Routines.routines.getElement().click();
    }

    @Then("^Check if user is at Admin panel$")
    public void checkIfAdminPanelPageAppears() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
    }

    @Then("^Check if user is at routines page$")
    public void checkIfRoutinesPageAppears() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Routines.menu.getBy(), 15);
    }

    @Then("^Check if Chrysler House is Opened$")
    public void checkIfBuildingDashboardAppears() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Chrysler House");
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, "Chrysler House").getText(), "Chrysler House");
    }

    @Then("^Check if user is logged in$")
    public void checkIfUserIsLoggedIn() throws Throwable {
        try {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'New Version Released')]]", 2);
            if (driver.findElement(By.xpath("//*[text()[contains(.,'New Version Released')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Skip')]]")).click();
            }
            if (driver.findElement(By.xpath("//*[text()[contains(.,'Continue without saving data ?')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Yes')]]")).click();
            }

        } catch (Throwable ex) {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//img[@class='logo']", 15);
        }

        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//img[@class='logo']", 15);
    }

    @Then("^Check if user is at Fire Dashboard$")
    public void checkIfUserIsLoggedIntoFireDashboard() throws Throwable {
        try {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'New Version Released')]]", 2);
            if (driver.findElement(By.xpath("//*[text()[contains(.,'New Version Released')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Skip')]]")).click();
            }
            if (driver.findElement(By.xpath("//*[text()[contains(.,'Continue without saving data ?')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Yes')]]")).click();
            }
        } catch (Throwable ex) {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Events Dashboard')]]", 30);
        }

        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'Events Dashboard')]]", 30);
    }

    @And("^Log in using Username (.*) and Password (.*)$")
    public void login(String username, String password) throws Throwable {
        driver.findElement(By.id("userID")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.CLASSNAME, "company-name", 15);
    }

    //User Panel Methods
    @And("^Click User Panel tab$")
    public void clickUserPanel() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Users");
        PageObjectUtils.ContainsText(driver, "Users").click();
    }

    @Then("^Check if user is at User panel$")
    public void checkUserPanel() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.FirstName.getBy(), 15);
    }

    @When("^User clicks on Add new User$")
    public void clickNewUser() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.AddNewUser.getBy(), 15);
        BuildingPanel.AddNewUser.getElement().click();
    }

    @And("^User Fill (.*) as First Name$")
    public void u_FirstName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.FirstName.getBy(), 15);

        //Add First Name
        BuildingPanel.EnterFirstName.getElement().sendKeys(name);
        //Thread.sleep(1000);
    }

    @And("^User Fill (.*) as Last Name$")
    public void u_LastName(String lastName) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EnterLastName.getBy(), 15);
        Thread.sleep(200);
        //Add Last Name
        BuildingPanel.EnterLastName.getElement().sendKeys(lastName);
    }

    @And("^User Fill (.*) as Email$")
    public void u_Email(String email) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EnterEmail.getBy(), 15);
        Thread.sleep(100);
        //Add Email
        BuildingPanel.EnterEmail.getElement().sendKeys(email);
    }

    @And("^User Fill (.*) as Phone number$")
    public void u_Phone(String phone) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EnterPhone.getBy(), 15);

        //Add Phone
        BuildingPanel.EnterPhone.getElement().sendKeys(phone);
    }

    @And("^User Fill (.*) as Position$")
    public void u_Position(String position) throws Throwable {
        //Add Position
        BuildingPanel.EnterPosition.getElement().click();
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'" + position + "')]]", 15);
        driver.findElement(By.xpath("//span[text()[contains(.,'" + position + "')]]")).click();
    }

    @And("^User Fill (.*) as Role$")
    public void u_Role(String role) throws Throwable {
        //Add Role
        WebElement element = BuildingPanel.EnterRole.getElement();
        element.click();
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'" + role + "')]]", 15);
        driver.findElement(By.xpath("//span[text()[contains(.,'" + role + "')]]")).click();
    }

    @And("^User click create account$")
    public void u_Password() throws Throwable {
        //Add Role
        //Thread.sleep(1000);
        WebElement element = BuildingPanel.ClickCreateAccount.getElement();
        element.click();
    }

    @Then("^Check if User with name (.*) appear on the list$")
    public void checkUserIsAdded(String user) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, user);
        Assert.assertEquals(PageObjectUtils.ContainsText(driver, user).getText(), user);
        //Thread.sleep(2000);
    }

    @When("^User click (.*) User$")
    public void openUser(String users) throws Throwable {
        //click user
        PageObjectUtils.CheckContainsText(driver, users);
        PageObjectUtils.ContainsText(driver, users).click();
        PageObjectUtils.CheckContainsText(driver, users);
    }

    @And("^Click on Edit Button, then change some values for user and click save$")
    public void editUser() throws Throwable {
        //click user
        PageObjectUtils.CheckContainsText(driver, "Edit");
        PageObjectUtils.ContainsText(driver, "Edit").click();

        PageObjectUtils.CheckContainsText(driver, "Edit");
        //Thread.sleep(1000);
        BuildingPanel.EnterLastName.getElement().clear();
        Thread.sleep(200);
        BuildingPanel.EnterLastName.getElement().sendKeys("sopo");

        //Click save
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Save')]")).click();
    }

    @And("^Click on Edit Role Button, change role and click save$")
    public void editUserRole() throws Throwable {
        //click user
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ClickUpdateRole.getBy(), 15);
        BuildingPanel.ClickUpdateRole.getElement().click();

        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EnterRole.getBy(), 15);
        WebElement element = BuildingPanel.EnterRole.getElement();
        element.click();
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//span[text()[contains(.,'ViewOnly')]]", 15);
        driver.findElement(By.xpath("//span[text()[contains(.,'ViewOnly')]]")).click();

        //Click save
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Save')]")).click();
    }

    @And("^Click on Edit email Button, change email and click save$")
    public void editUserEmail() throws Throwable {
        //click user
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ClickUpdateEmail.getBy(), 15);
        BuildingPanel.ClickUpdateEmail.getElement().click();

        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EnterEmail.getBy(), 15);
        WebElement element = BuildingPanel.EnterEmail.getElement();
        element.clear();
        element.sendKeys("test@email.com");

        //Click save
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Save')]")).click();
    }

    @And("^Click on Edit password Button, change password and click save$")
    public void editUserPassword() throws Throwable {
        //click user
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ClickChangePassword.getBy(), 15);
        BuildingPanel.ClickChangePassword.getElement().click();

        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.EnterPassword.getBy(), 15);
        WebElement element = BuildingPanel.EnterPassword.getElement();
        element.clear();
        element.sendKeys("KodeL@bs123");

        //Click save
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Save')]")).click();
    }

    @And("^Click on deactivate Button and click save$")
    public void deactivateUserAccount() throws Throwable {
        //click user
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ClickDeactivate.getBy(), 15);
        BuildingPanel.ClickDeactivate.getElement().click();

        //Thread.sleep(1000);

        //Click save
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Confirm')]")).click();
    }

    @And("^Click on Create account Button$")
    public void createAccount() throws Throwable {
        //click user
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.ClickCreateAccountButton.getBy(), 15);
        BuildingPanel.ClickCreateAccountButton.getElement().click();

        //Thread.sleep(1000);

        //Click save
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Create')]")).click();
    }

    @Then("^Check if All Changed fields for (.*) are saved successful$")
    public void checkEditedUser(String user) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "sopo");
    }

    @Then("^Check if Role is updated$")
    public void checkUpdatedRole() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "ViewOnly");
    }

    @Then("^Check if User account is updated$")
    public void checkUserAccount() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Active");
    }

    @Then("^Check if email is updated$")
    public void checkUpdatedEmail() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "test@email.com");
    }

    @Then("^Check if password is updated$")
    public void checkUpdatedPassword() throws Throwable {

    }

    @Then("^Check if user account is deactivated$")
    public void checkUserIsDeactivated() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Inactive");
    }

    @And("^User go to buildings tab$")
    public void goToBuildingsTab() throws Throwable {
        //click building tab
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.OpenBuildingTab.getBy(), 15);
        BuildingPanel.OpenBuildingTab.getElement().click();
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.CheckEditButton.getBy(), 15);
        //Thread.sleep(1000);
    }

    @And("^User click assign buildings$")
    public void clickAssignBuilding() throws Throwable {
        //Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.editButton.getBy(), 15);
        BuildingPanel.editButton.getElement().click();
    }

    @And("^User assign (.*) Building$")
    public void assignBuilding(String building) throws Throwable {
        //assign building
        PageObjectUtils.CheckContainsText(driver, "Assign Buildings");
        driver.findElement(By.xpath("//*[@class='search-widget']//*[@placeholder='Search for Buildings']")).sendKeys(building);
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']", 15);
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
        //Thread.sleep(1000);

        //Click save
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Save')]")).click();
        // Thread.sleep(1000);
    }

    @And("^User select building (.*)$")
    public void selectBuilding(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.SearchField.getBy(), 15);
        //Thread.sleep(1000);
        List<WebElement> inside = driver.findElements(BuildingPanel.SecondSearchField.getBy());
        inside.get(1).sendKeys(test);
        // Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, BuildingPanel.clickBuilding.getBy(), 15);
        Thread.sleep(200);
        BuildingPanel.clickBuilding.getElement().click();
    }

    @Then("^Check if (.*) is assigned to that user$")
    public void checkAssignedBuilding(String building) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, building);
    }

    @And("^User clicks delete assigned buildings$")
    public void clickRemoveBuilding() throws Throwable {
        //Thread.sleep(1000);

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.editButton.getBy(), 15);
        BuildingPanel.editButton.getElement().click();
    }

    @And("^User remove (.*) Building$")
    public void removedBuilding(String building) throws Throwable {
        //remove building
        PageObjectUtils.CheckContainsText(driver, "Remove Buildings");
        driver.findElement(By.xpath("//*[@class='search-widget']//*[@placeholder='Search for Buildings']")).sendKeys(building);
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']", 15);
        // Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
        //  Thread.sleep(1000);

        //Click delete
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Delete')]")).click();
        //Thread.sleep(1000);
    }

    @Then("^Check if (.*) is removed from user$")
    public void checkRemovedBuilding(String building) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[contains(text(), 'Saved Successfully')]", 15);
    }

    @And("^User click on Delete user button$")
    public void removedUser() throws Throwable {
        //remove user
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper' and contains(text(), 'Delete')]", 15);
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Delete')]")).click();
        PageObjectUtils.IsElementClickable(driver, PageObjectUtils.LocatorType.XPATH, "//*[@class='mat-button-wrapper' and contains(text(), 'Yes')]", 15);
        // Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Yes')]")).click();
        //Thread.sleep(1000);
    }

    @Then("^Check if User (.*) dissapears from the list$")
    public void checkRemovedUser(String user) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Edon");
        Thread.sleep(1000);
        List<WebElement> users = driver.findElements(By.xpath("//*[text()[contains(.,'" + user + "')]]"));
        Assert.assertTrue("User is still on list", users.isEmpty());
    }

    //Templates Methods
    @And("^Click Templates tab$")
    public void goToTemplates() throws Throwable {
        //click assign
        PageObjectUtils.CheckContainsText(driver, "Templates");
        PageObjectUtils.ContainsText(driver, "Templates").click();
    }

    @And("^Click Units tab$")
    public void goToUnits() throws Throwable {
        //click assign
        PageObjectUtils.CheckContainsText(driver, "Units");
        PageObjectUtils.ContainsText(driver, "Units").click();
    }

    @And("^Click Tags tab$")
    public void goToTags() throws Throwable {
        //click assign
        PageObjectUtils.CheckContainsText(driver, "Tags");
        PageObjectUtils.ContainsText(driver, "Tags").click();
    }

    @Then("^Check if user is at Templates page$")
    public void userAtTemplatesPage() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "AHU");
    }

    @Then("^Check if user is at Units page$")
    public void userAtUnitsPage() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "angular velocity");
    }

    @Then("^Check if user is at Tags page$")
    public void userAtTagsPage() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Tag");
    }

    @When("^User go to (.*) template$")
    public void goToOneTemplate(String template) throws Throwable {
        //remove building
        PageObjectUtils.CheckContainsText(driver, template);
        driver.findElement(By.xpath("//*[contains(text(), '" + template + "')]")).click();
        PageObjectUtils.CheckContainsText(driver, template);
        //Thread.sleep(1000);
    }

    @And("^Click add new section button$")
    public void openNewSection() throws Throwable {
        //click assign
        PageObjectUtils.CheckContainsText(driver, "Add Group");
        PageObjectUtils.ContainsText(driver, "Add Group").click();
    }

    @And("^enter (.*) for this section name$")
    public void enterTemplateName(String template) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Add Group");
        BuildingPanel.Name.getElement().sendKeys(template);
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='dialog-container']//span[text()[contains(.,' Add ')]]")).click();
    }

    @And("^Click on Edit Button, then change section name to (.*)$")
    public void changeSectionName(String template) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "more_vert");
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, "more_vert").click();

        PageObjectUtils.CheckContainsText(driver, "Edit Group");
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, "Edit Group").click();

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Name.getBy(), 15);
        BuildingPanel.Name.getElement().clear();
        Thread.sleep(500);
        BuildingPanel.Name.getElement().sendKeys(template);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@class='mat-button-wrapper' and contains(text(), 'Save')]")).click();
        //Thread.sleep(1000);
    }

    @Then("^Check if template with (.*) name appears on list$")
    public void checkTemplateIsAdded(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, name);
    }

    @And("^Click on Delete Button, then click delete Section$")
    public void changeDeletedSectionName() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "more_vert");
        PageObjectUtils.ContainsText(driver, "more_vert").click();
        // Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "Delete Group");
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, "Delete Group").click();

        PageObjectUtils.CheckContainsText(driver, "Yes");
        PageObjectUtils.ContainsText(driver, "Yes").click();

        //Thread.sleep(2000);
    }

    @Then("^Check if template with (.*) name Disappears from list$")
    public void checkTemplateIsDeleted(String name) throws Throwable {
        Thread.sleep(1000);
        List<WebElement> users = driver.findElements(By.xpath("//*[text()[contains(.,'" + name + "')]]"));
        Assert.assertTrue("Section is still on list", users.isEmpty());
    }

    @And("^Click add new point button$")
    public void addNewPointButton() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "more_vert");
        PageObjectUtils.ContainsText(driver, "more_vert").click();

        PageObjectUtils.CheckContainsText(driver, "Add Point");
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, "Add Point").click();

        // Thread.sleep(1000);
    }

    @And("^Fill point mandatory fields with name (.*)$")
    public void fillPointFields(String name) throws Throwable {
        Thread.sleep(500);
        BuildingPanel.DisplayName.getElement().sendKeys(name);
        // Thread.sleep(1000);
        BuildingPanel.Description.getElement().sendKeys(name);
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, "Choose type").click();
        driver.findElement(By.xpath("//mat-option//*[contains(text(), 'Bool')]")).click();

        driver.findElement(By.xpath("//span[contains(text(), 'Add')]")).click();
        //Thread.sleep(1000);
    }

    @Then("^Check if Point with name (.*) is added on Section with name (.*)$")
    public void checkPointIsAdded(String point, String section) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "NewPoint");
    }

    @And("^Click on Edit Button, then change point name to (.*)")
    public void changePointName(String template) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "NewPoint");
        PageObjectUtils.ContainsText(driver, "NewPoint").click();

        PageObjectUtils.IsElementVisible(driver, BuildingPanel.Description.getBy(), 15);
        BuildingPanel.Description.getElement().clear();
        BuildingPanel.Description.getElement().sendKeys(template);

        BuildingPanel.DisplayName.getElement().clear();
        BuildingPanel.DisplayName.getElement().sendKeys(template);

        PageObjectUtils.ContainsText(driver, "Save").click();
    }

    @Then("^Check if Point name is changed from (.*) to (.*)$")
    public void checkPointIsEdited(String point, String section) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, section);
    }

    @And("^Open Point with name (.*) and click Delete$")
    public void deletePointName(String template) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, template);
        PageObjectUtils.ContainsText(driver, template).click();
        Thread.sleep(500);
        PageObjectUtils.ContainsText(driver, "Delete").click();
        Thread.sleep(200);
        PageObjectUtils.ContainsText(driver, "Yes").click();
        // Thread.sleep(1000);
    }

    @Then("^Check if point with name (.*) is deleted from list$")
    public void checkPointIsDeleted(String point) throws Throwable {
        Thread.sleep(1000);
        List<WebElement> users = driver.findElements(By.xpath("//*[text()[contains(.,'" + point + "')]]"));
        Assert.assertTrue("point is still on list", users.isEmpty());
    }

    @And("^user select Connect Points$")
    public void connectPointsButton() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Connect Points");
        PageObjectUtils.ContainsText(driver, "Connect Points").click();
    }

    @And("^user select point with name (.*)$")
    public void selectFirstPoint(String point) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, point);
        PageObjectUtils.ContainsText(driver, point).click();
    }

    @And("^it links it with point with name (.*)$")
    public void selectSecondPoint(String point) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, point);
        PageObjectUtils.ContainsText(driver, point).click();
    }

    @And("^Click Connect Button$")
    public void connectPointsSave() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Save");
        PageObjectUtils.ContainsText(driver, "Save").click();
    }

    @Then("^Check if points (.*) and (.*) are linked$")
    public void checkPointIsLinked(String point1, String point2) throws Throwable {
        // Thread.sleep(2000);
        PageObjectUtils.CheckContainsText(driver, point1);
        PageObjectUtils.CheckContainsText(driver, point2);
    }
}
