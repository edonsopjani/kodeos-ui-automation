package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.pages.Audit;
import pageobjects.pages.PageObjectUtils;

import java.util.List;

public class AuditStepDefs extends CommonStepObjects {

    @When("^User Click on Audit button$")
    public void clickAudit() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.auditButton.getBy(), 15);
        Thread.sleep(2000);
        Audit.auditButton.getElement().click();
    }

    @Then("^Check if Audit page appears$")
    public void checkIfAuditPageAppears() throws Throwable {
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("//*[contains(text(), 'No templates have been created')]")).isDisplayed();
        } catch (Exception e) {
            List<WebElement> templates = driver.findElements(By.xpath("//*[contains(text(), 'VAV Template')]"));
            if(templates.isEmpty()){
                driver.findElement(By.xpath("//*[contains(text(), 'Global Template')]")).isDisplayed();
            }
        }
    }

    @When("^User click Add Audit template$")
    public void addAuditTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.addTemplate.getBy(), 15);
        Audit.addTemplate.getElement().click();
    }

    @And("^User click next button$")
    public void clickNextButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.next.getBy(), 15);
        Audit.next.getElement().click();
    }

    @And("^User select (.*) type and select (.*) and (.*)$")
    public void selectTypeAndPoints(String type, String point1, String point2) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, type);
        Thread.sleep(1000);
        PageObjectUtils.ContainsText(driver, type).click();
        Thread.sleep(1000);

        PageObjectUtils.CheckContainsText(driver, point1);
        PageObjectUtils.ContainsText(driver, point1).click();

        PageObjectUtils.CheckContainsText(driver, point2);
        PageObjectUtils.ContainsText(driver, point2).click();


    }

    @And("^User Add (.*) as Template name$")
    public void addTemplateName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.addTemplateName.getBy(), 15);
        Audit.addTemplateName.getElement().click();
        Audit.addTemplateName.getElement().sendKeys(name);
    }


    @And("^User Add (.*) as Template description$")
    public void addTemplateDescription(String description) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.addTemplateDescription.getBy(), 15);
        Audit.addTemplateDescription.getElement().click();
        Audit.addTemplateDescription.getElement().sendKeys(description);
    }

    @And("^User click Add Template Button$")
    public void addTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.addTemplateButton.getBy(), 15);
        Thread.sleep(3000);
        Audit.addTemplateButton.getElement().click();
    }

    @And("^User Click All Buildings button$")
    public void clickAllBuildingsButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.allBuildings.getBy(), 15);
        Thread.sleep(1000);
        Audit.allBuildings.getElement().click();
    }

    @When("^User click on (.*) template$")
    public void clickVAVTemplate(String template) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, template);
        PageObjectUtils.ContainsText(driver, template).click();
    }

    @And("^User click apply button$")
    public void clickApplyButton() throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, Audit.applyButton.getBy(), 15);
        Thread.sleep(1000);
        Audit.applyButton.getElement().click();
    }

    @And("^User select (.*) filter$")
    public void selectAlarmFilter(String filter) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, filter);
        PageObjectUtils.ContainsText(driver, filter).click();
    }

    @And("^User click Save Filters button$")
    public void saveFilters() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.saveFilters.getBy(), 15);
        Audit.saveFilters.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User add (.*) as filter name$")
    public void addFilterName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.addFilterName.getBy(), 15);
        Audit.addFilterName.getElement().click();
        Audit.addFilterName.getElement().sendKeys(name);
    }

    @And("^User click Save button on filter$")
    public void saveFilterPopUp() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.saveFiltersButton.getBy(), 15);
        Audit.saveFiltersButton.getElement().click();
    }

    @And("^User click Edit Template Button$")
    public void editTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.editTemplate.getBy(), 15);
        Thread.sleep(3000);
        Audit.editTemplate.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User click Point Selection button$")
    public void pointSelectionButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.pointSelection.getBy(), 15);
        Audit.pointSelection.getElement().click();
    }

    @And("^User select (.*) point$")
    public void selectSpecificPoint(String point) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, point);
        PageObjectUtils.ContainsText(driver, point).click();
    }

    @And("^User change Template name to (.*)$")
    public void changeTempleteName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.addTemplateName.getBy(), 15);
        Audit.addTemplateName.getElement().click();
        Audit.addTemplateName.getElement().clear();
        Audit.addTemplateName.getElement().sendKeys(name);
    }

    @And("^User click Delete Template Button$")
    public void deleteTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.deleteTemplate.getBy(), 15);
        Thread.sleep(2000);
        Audit.deleteTemplate.getElement().click();
        Thread.sleep(1000);
    }

    @And("^User click yes button$")
    public void yesButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, Audit.yesButton.getBy(), 15);
        Audit.yesButton.getElement().click();
    }

    @Then("^Check if (.*) Template is deleted$")
    public void checkIfTemplateIsDeleted(String name) throws Throwable {
        Thread.sleep(1000);
        List<WebElement> templates = driver.findElements(By.xpath("//*[contains(text(), '"+name+"')]"));
        Assert.assertTrue(templates.isEmpty());
    }
}
