package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.Tenant;
import selenium.WebDriverFactory;

import java.util.List;

public class TenantStepDefs extends CommonStepObjects {

    @Given("^Open Tenant Page$")
    public void openTenantPage() throws Throwable {
        if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
        driver.navigate().to(System.getProperty("tenantUrl"));
        List<WebElement> isLoggedIn = driver.findElements(By.xpath("//*[@formcontrolname='email']"));
    }

    @Then("^Check if user is at Tenant login page$")
    public void checkIfUserIsAtTenantLoginPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.username.getBy(), 10);
        Thread.sleep(100);
    }

    @When("^User Enter (.*) as username and (.*) as password and click tenant Login$")
    public void loginAs(String username, String password) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.username.getBy(), 10);
        Thread.sleep(100);
        Tenant.username.getElement().sendKeys(username);
        Tenant.password.getElement().sendKeys(password);

        Tenant.loginButton.getElement().click();
    }

    @Then("^Check if user is logged in on Tenant app$")
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
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//img[@class='h-full']", 15);
        }

        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//img[@class='h-full']", 15);
    }

    @Then("^Check if tenant is logged in$")
    public void checkIfTenantIsLoggedIn() throws Throwable {
        try {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//*[text()[contains(.,'New Version Released')]]", 2);
            if (driver.findElement(By.xpath("//*[text()[contains(.,'New Version Released')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Skip')]]")).click();
            }
            if (driver.findElement(By.xpath("//*[text()[contains(.,'Continue without saving data ?')]]")).isDisplayed()) {
                driver.findElement(By.xpath("//*[text()[contains(.,'Yes')]]")).click();
            }

        } catch (Throwable ex) {
            PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//img[@class='w-6']", 15);
        }

        PageObjectUtils.IsElementVisible(driver, PageObjectUtils.LocatorType.XPATH, "//img[@class='w-6']", 15);
    }

    @And("^User goes to Tenant Management page$")
    public void userGoesToTenantManagementPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.tenantManagement.getBy(), 10);
        Tenant.tenantManagement.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.searchInput.getBy(), 10);
        Thread.sleep(200);
    }

    @And("^User click add button on tenant page$")
    public void userClickAddButtonOnTenantPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.addButton.getBy(), 10);
        Tenant.addButton.getElement().click();
    }

    @And("^User fill mandatory fields for tenant input page$")
    public void userFillMandatoryFieldsForTenantInputPage() throws Throwable {

    }

    @Then("^Check if Tenant is created successfully$")
    public void checkIfTenantIsCreatedSuccessfully() throws Throwable {

    }

    @And("^User open (.*) tenant page$")
    public void userOpenTenantNameTenantPage(String tenantName) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.searchInput.getBy(), 10);
        Thread.sleep(200);

        PageObjectUtils.IsElementVisible(driver, By.xpath("//h3[text()[contains(.,'" + tenantName + "')]]"), 10);
        driver.findElement(By.xpath("//h3[text()[contains(.,'" + tenantName + "')]]")).click();
    }

    @And("^User click add new tenant user$")
    public void userClickAddNewTenantUser() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.addTenantUserButton.getBy(), 10);
        Tenant.addTenantUserButton.getElement().click();
    }

    @And("^User fill mandatory fields for tenant user input$")
    public void userFillMandatoryFieldsForTenantUserInput() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.userFirstName.getBy(), 10);
        Thread.sleep(200);
        Tenant.userFirstName.getElement().sendKeys("Automation");

        PageObjectUtils.IsElementVisible(driver, Tenant.userLastName.getBy(), 10);
        Tenant.userLastName.getElement().sendKeys("Tenant");

        PageObjectUtils.IsElementVisible(driver, Tenant.userEmail.getBy(), 10);
        Tenant.userEmail.getElement().sendKeys("Automation@Tenant.com");

        PageObjectUtils.IsElementVisible(driver, Tenant.userNumber.getBy(), 10);
        Tenant.userNumber.getElement().sendKeys("3834529494");

        PageObjectUtils.IsElementVisible(driver, Tenant.userRole.getBy(), 10);
        Tenant.userRole.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.selectFirstOption.getBy(), 10);
        Thread.sleep(200);
        Tenant.selectFirstOption.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.saveButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.saveButton.getElement().click();
        Thread.sleep(200);
    }

    @Then("^Check if (.*) appears for that Tenant$")
    public void checkIfAutomationTenantAppearsForThatTenant(String tenant) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//span[text()[contains(.,'Saved Successfully')]]"), 20);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + tenant + "')]]"), 10);
    }

    @Then("^Check if (.*) disappears for that Tenant$")
    public void checkIfAutomationTenantDisappearsForThatTenant(String tenant) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//span[text()[contains(.,'Deleted Successfully')]]"), 20);
        PageObjectUtils.ElementIsNotVisible(driver, By.xpath("//label[text()[contains(.,'" + tenant + "')]]"), 10);
    }

    @And("^User logs out from (.*) role on tenant side$")
    public void userLogsOutFromSuperadminRoleOnTenantSide(String role) throws Throwable {
        if (role.equals("tenant")) {
            PageObjectUtils.IsElementVisible(driver, Tenant.myProfile.getBy(), 10);
            Thread.sleep(200);
            Tenant.myProfile.getElement().click();

            PageObjectUtils.IsElementVisible(driver, Tenant.logoutButton.getBy(), 10);
            Thread.sleep(200);
            Tenant.logoutButton.getElement().click();
        } else {
            PageObjectUtils.IsElementVisible(driver, Tenant.logoutButton.getBy(), 10);
            Thread.sleep(200);
            Tenant.logoutButton.getElement().click();
        }
    }


    @And("^User goes to After Hours HVAC page$")
    public void userGoesToAfterHoursHVACPage() {
        PageObjectUtils.IsElementVisible(driver, Tenant.afterHoursHVAC.getBy(), 10);
        Tenant.afterHoursHVAC.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.addButton.getBy(), 10);
    }

    @And("^User select floor$")
    public void userSelectFloor() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectFloorDropdown.getBy(), 10);
        Thread.sleep(200);
        Tenant.selectFloorDropdown.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.selectFirstOption.getBy(), 10);
        Tenant.selectFirstOption.getElement().click();

        Tenant.clickOverlay.getElement().click();
    }

    @And("^User select start date$")
    public void userSelectStartDate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectStartDateInput.getBy(), 10);
    }

    @And("^User select start time$")
    public void userSelectStartTime() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectStartTimeInput.getBy(), 10);
    }

    @And("^User select end time$")
    public void userSelectEndTime() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectEndTimeInput.getBy(), 10);
    }

    @And("^User select end date$")
    public void userSelectEndDate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectEndDateInput.getBy(), 10);
    }

    @And("^User select weekly repeat$")
    public void userSelectWeeklyRepeat() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.weeklyCheckbox.getBy(), 10);
        Thread.sleep(500);
        Tenant.weeklyCheckbox.getElement().click();

    }

    @And("^User select every Tuesday$")
    public void userSelectEveryTuesday() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectTuesday.getBy(), 10);
        Thread.sleep(500);
        Tenant.selectTuesday.getElement().click();
        Tenant.selectWen.getElement().click();
        Tenant.selectThu.getElement().click();
        Tenant.selectFri.getElement().click();
        Tenant.selectSun.getElement().click();
        Tenant.selectSat.getElement().click();
        Tenant.selectMon.getElement().click();
        Thread.sleep(5200);
    }

    @And("^User click submit request button$")
    public void userClickSubmitRequestButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.submitRequestButton.getBy(), 10);
        Thread.sleep(500);
        Tenant.submitRequestButton.getElement().click();
    }

    @Then("^Check if After Hours HVAC request is created successfully$")
    public void checkIfAfterHoursHVACRequestIsCreatedSuccessfully() {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'Tristan Thomson')]]"), 10);
    }

    @And("^User open request for After Hours request$")
    public void userOpenRequestForAfterHoursRequest() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'Tristan Thomson')]]"), 10);
        Thread.sleep(200);
        driver.findElement(By.xpath("//label[text()[contains(.,'Tristan Thomson')]]")).click();
    }

    @And("^User click reject button$")
    public void userClickRejectButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.rejectRequestButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.rejectRequestButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.description.getBy(), 10);
        Thread.sleep(200);
        Tenant.description.getElement().click();
        Tenant.description.getElement().sendKeys("automation");

        PageObjectUtils.IsElementVisible(driver, Tenant.saveButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.saveButton.getElement().click();
    }

    @Then("^Check if request status is changed to (.*)$")
    public void checkIfRequestStatusIsChangedToRejected(String status) throws Throwable {
        switch (status) {
            case "rejected":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//div[text()[contains(.,'automation')]]"), 10);
                Thread.sleep(200);
                break;
            case "approved":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//h2[text()[contains(.,'Request Details')]]"), 10);
                Thread.sleep(210);
                driver.findElement(By.xpath("//h2[text()[contains(.,'Request Details')]]")).click();
                break;
            case "completed":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//h2[text()[contains(.,'Request Details')]]"), 10);
                Thread.sleep(220);
                driver.findElement(By.xpath("//h2[text()[contains(.,'Request Details')]]")).click();
                break;
            case "In Progress":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//div[text()[contains(.,'In Progress')]]"), 10);
                Thread.sleep(220);
                break;
            case "Completed":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//div[text()[contains(.,'Completed')]]"), 10);
                Thread.sleep(220);
                break;
            case "Rejected":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//div[text()[contains(.,'Rejected')]]"), 10);
                Thread.sleep(220);
                break;
            case "Closed":
                PageObjectUtils.IsElementVisible(driver, By.xpath("//div[text()[contains(.,'Closed')]]"), 10);
                Thread.sleep(220);
                break;
        }
    }


    @And("^User click approve button$")
    public void userClickApproveButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.approveRequestButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.approveRequestButton.getElement().click();
    }

    @And("^User goes to approved tab$")
    public void userGoesToApprovedTab() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.approveTabButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.approveTabButton.getElement().click();
    }

    @And("^User click complete button$")
    public void userClickCompleteButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.completeRequestButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.completeRequestButton.getElement().click();
    }

    @And("^User goes to Work Orders page$")
    public void userGoesToWorkOrdersPage() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.workOrders.getBy(), 10);
        Thread.sleep(1000);
        Tenant.workOrders.getElement().click();
        Thread.sleep(250);
    }

    @And("^User select request category$")
    public void userSelectRequestCategory() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectCategoryDropdown.getBy(), 10);
        Thread.sleep(200);
        Tenant.selectCategoryDropdown.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.selectFirstOption.getBy(), 10);
        Tenant.selectFirstOption.getElement().click();
    }

    @And("^User add issue description$")
    public void userAddIssueDescription() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.issueDescriptionTextArea.getBy(), 10);
        Thread.sleep(200);
        Tenant.issueDescriptionTextArea.getElement().sendKeys("Automation Description");
    }

    @And("^User add issue images$")
    public void userAddIssueImages() throws Throwable {
        //Add building image
        WebElement fileInput = Tenant.inputPhotos.getElement();
        fileInput.sendKeys(PageObjectUtils.filePathForUpload("test1.jpg"));
        Thread.sleep(1000);
    }

    @Then("^Check if Work Order request is created successfully$")
    public void checkIfWorkOrderRequestIsCreatedSuccessfully() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//span[text()[contains(.,'Saved Successfully')]]"), 20);
        Thread.sleep(1000);
    }

    @And("^User open request for Work Order request$")
    public void userOpenRequestForWorkOrderRequest() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'Tristan Thomson')]]"), 13);
        Thread.sleep(700);
        driver.findElement(By.xpath("//label[text()[contains(.,'Tristan Thomson')]]")).click();
    }

    @And("^User open request for Work Order$")
    public void propertyManagerOpenRequestForWorkOrderRequest() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'KODE Labs')]]"), 13);
        Thread.sleep(700);
        driver.findElement(By.xpath("//label[text()[contains(.,'KODE Labs')]]")).click();
    }

    @And("^User click assign me button$")
    public void userClickAssignMeButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.assignMeButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.assignMeButton.getElement().click();
    }

    @And("^User click Mark as Done button$")
    public void userClickMarkAsDoneButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.markAsDoneButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.markAsDoneButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.sourceOfIssueDropdown.getBy(), 10);
        Thread.sleep(200);
        Tenant.sourceOfIssueDropdown.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.selectFirstOption.getBy(), 10);
        Thread.sleep(200);
        Tenant.selectFirstOption.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.issueDescriptionTextArea.getBy(), 10);
        Thread.sleep(200);
        Tenant.issueDescriptionTextArea.getElement().sendKeys("Automation");

        PageObjectUtils.IsElementVisible(driver, Tenant.submitButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.submitButton.getElement().click();
    }

    @And("^User click Evaluate button and reject work order$")
    public void userClickEvaluateButtonAndRejectWorkOrder() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.evaluateButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.evaluateButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.rejectButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.rejectButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.issueDescriptionTextArea.getBy(), 10);
        Thread.sleep(200);
        Tenant.issueDescriptionTextArea.getElement().sendKeys("Automation");

        PageObjectUtils.IsElementVisible(driver, Tenant.submitButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.submitButton.getElement().click();
    }

    @And("^User click Evaluate button$")
    public void userClickEvaluateButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.evaluateButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.evaluateButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.issueDescriptionTextArea.getBy(), 10);
        Thread.sleep(200);
        Tenant.issueDescriptionTextArea.getElement().sendKeys("Automation");

        PageObjectUtils.IsElementVisible(driver, Tenant.submitButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.submitButton.getElement().click();
    }

    @And("^User delete (.*) tenant user$")
    public void userDeleteTenantUser(String tenant) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + tenant + "')]]/.."), 10);
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + tenant + "')]]/..")).click();

        PageObjectUtils.IsElementVisible(driver, Tenant.deleteButton.getBy(), 10);
        Thread.sleep(200);
        Tenant.deleteButton.getElement().click();
    }

    @And("^User select tenant$")
    public void userSelectTenant() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Tenant.selectBuildingDropdown.getBy(), 10);
        Thread.sleep(200);
        Tenant.selectBuildingDropdown.getElement().click();

        PageObjectUtils.IsElementVisible(driver, Tenant.selectFirstOption.getBy(), 10);
        Thread.sleep(200);
        Tenant.selectFirstOption.getElement().click();
    }
}