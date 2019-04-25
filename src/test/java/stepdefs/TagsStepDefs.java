package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.TagsPanel;

import java.util.List;

public class TagsStepDefs extends CommonStepObjects {

    @And("^user add (.*) as Tag Name and click Add$")
    public void addTag(String name) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, TagsPanel.addTagName.getBy(), 15);
        TagsPanel.addTagName.getElement().sendKeys(name);
        Thread.sleep(1000);
        TagsPanel.addTagDescription.getElement().sendKeys("automation");
        TagsPanel.saveTag.getElement().click();
        Thread.sleep(1000);
    }

    @Then("^Check if Tag with name (.*) appears on list$")
    public void checkTagIsAdded(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + name + "')]]"), 15);
    }

    @When("^User Click Add New Tag Button$")
    public void newTag() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, TagsPanel.addTag.getBy(), 15);
        TagsPanel.addTag.getElement().click();
    }

    @And("^At Tags page User Search for Tag with name (.*)$")
    public void searchTag(String name) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, TagsPanel.searchTag.getBy(), 15);
        Thread.sleep(1000);
        TagsPanel.searchTag.getElement().sendKeys(name);
        Thread.sleep(3000);
    }

    @Then("^Check if Tag with name (.*) disappears from list$")
    public void checkTagDeleted(String name) throws Throwable {
        Thread.sleep(3000);
        List<WebElement> tags = driver.findElements(By.xpath("//*[text()[contains(.,'" + name + "')]]"));
        Assert.assertTrue("Tag is not deleted", tags.isEmpty());
    }

    @And("^User hover at (.*) and click Edit Button$")
    public void editTag(String name) throws Throwable {
        Thread.sleep(1000);
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//*[text()[contains(.,'" + name + "')]]"))).build().perform();
        action.moveToElement(TagsPanel.openTagMenu.getElement()).click().build().perform();

        PageObjectUtils.IsElementVisible(driver, TagsPanel.editTag.getBy(), 15);
        Thread.sleep(1000);
        TagsPanel.editTag.getElement().click();
    }

    @And("^User hover at (.*) and click Delete Button$")
    public void deleteTag(String name) throws Throwable {
        Thread.sleep(1000);
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//*[text()[contains(.,'" + name + "')]]"))).build().perform();

        action.moveToElement(TagsPanel.openTagMenu.getElement()).click().build().perform();

        PageObjectUtils.IsElementVisible(driver, TagsPanel.deleteTag.getBy(), 15);
        Thread.sleep(1000);
        TagsPanel.deleteTag.getElement().click();

        PageObjectUtils.IsElementVisible(driver, TagsPanel.yesButton.getBy(), 15);
        TagsPanel.yesButton.getElement().click();
    }

    @And("^User Change tag name to (.*)$")
    public void changeTag(String name) throws Throwable {
        Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, TagsPanel.addTagName.getBy(), 15);
        TagsPanel.addTagName.getElement().clear();
        TagsPanel.addTagName.getElement().sendKeys(name);
        TagsPanel.saveButton.getElement().click();
    }

}
