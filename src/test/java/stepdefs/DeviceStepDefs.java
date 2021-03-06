package stepdefs;

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

import java.util.List;

public class DeviceStepDefs extends CommonStepObjects {

    @When("^User clicks on Filters button$")
    public void goToFilters() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.FiltersButton.getBy(), 15);
        DevicePanel.FiltersButton.getElement().click();
    }

    @When("^User is Searching for (.*)$")
    public void searchField(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.SearchField.getBy(), 15);
        Thread.sleep(1000);
        DevicePanel.SearchField.getElement().sendKeys(test);
        Thread.sleep(1000);
    }

    @When("^User is Search connector (.*)$")
    public void searchConnectors(String test) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.SearchForConnectors.getBy(), 15);
        //Thread.sleep(1000);
        DevicePanel.SearchForConnectors.getElement().sendKeys(test);
        //Thread.sleep(1000);
    }

    @And("^Click Filter by (.*) type$")
    public void selectFilter(String filter) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.SelectFCUFilter.getBy(), 5);
        DevicePanel.SelectFCUFilter.getElement().click();
        DevicePanel.ApplyButton.getElement().click();
    }

    @Then("^Check if all Devices with (.*) type appears$")
    public void checkType(String Type) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, Type);
    }

    @Then("^Check if (.*) Device appears on list$")
    public void checkDeviceAppearsOnList(String device) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + device + "')]]"), 15);
    }

    @And("^Click Filter by (.*) area$")
    public void filterArea(String area) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.SelectBasementFilter.getBy(), 5);
        DevicePanel.SelectBasementFilter.getElement().click();
        DevicePanel.ApplyButton.getElement().click();
    }

    @Then("^Check if all Devices with (.*) area appears$")
    public void checkArea(String area) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, area);
    }

    @When("^User clicks on Connectors button$")
    public void connectorsButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ConnectorsButton.getBy(), 15);
        DevicePanel.ConnectorsButton.getElement().click();
    }

    @And("^Click checkbox$")
    public void clickCheckbox() throws Throwable {
        Thread.sleep(500);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ClickCheckBox.getBy(), 5);
        DevicePanel.ClickCheckBox.getElement().click();
    }

    @Then("^Check if all Devices with (.*) connector appears$")
    public void checkConnector(String connector) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, connector);
    }

    @When("^User Click on (.*) Device$")
    public void clickDevice(String device) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, device);
        PageObjectUtils.ContainsText(driver, device).click();
    }

    @Then("^Check if (.*) Device details page appears$")
    public void checkDeviceDetailsPage(String device) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, device);
    }

    @Then("^Check if (.*) popup appears$")
    public void checkPointPopup(String device) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + device + "')]]"), 15);
    }

    @And("^Click at Device details button$")
    public void openDeviceDetails() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeviceDetailsButton.getBy(), 15);
        Thread.sleep(200);
        DevicePanel.DeviceDetailsButton.getElement().click();
    }

    @When("^User click on threedots button$")
    public void openThreeDot() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ThreedotMenu.getBy(), 15);
        DevicePanel.ThreedotMenu.getElement().click();
    }

    @And("^Click Device batch update button$")
    public void batchDeviceUpdate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeviceBatchUpdate.getBy(), 15);
        DevicePanel.DeviceBatchUpdate.getElement().click();
    }

    @And("^Click Discover Devices button$")
    public void discoverDevices() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DiscoverDevices.getBy(), 5);
        DevicePanel.DiscoverDevices.getElement().click();

        PageObjectUtils.IsElementVisible(driver, DevicePanel.ContinueButton.getBy(), 5);
        DevicePanel.ContinueButton.getElement().click();
    }

    @And("^Click Apply Point template button$")
    public void applyPointTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.PointsBatchUpdate.getBy(), 15);
        Thread.sleep(1000);
        DevicePanel.PointsBatchUpdate.getElement().click();
    }

    @And("^Click Apply$")
    public void clickApply() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ApplyButton.getBy(), 5);
        DevicePanel.ApplyButton.getElement().click();
    }

    @And("^Select (.*) as Tag$")
    public void selectTag(String type) throws Throwable {
        //Thread.sleep(1000);

        //Add State
        WebElement element = DevicePanel.AppendTag.getElement();
        DevicePanel.AppendTag.getElement().click();
        //Thread.sleep(1000);
        DevicePanel.AppendTag.getElement().sendKeys(type);
        DevicePanel.AppendTag.getElement().sendKeys(Keys.ENTER);
        //Thread.sleep(1000);
    }

    @And("^Select (.*) as Tags$")
    public void selectMultipleTags(String type) throws Throwable {
        Thread.sleep(500);

        //Add State
        WebElement element = DevicePanel.Tag.getElement();
        DevicePanel.Tag.getElement().click();
        Thread.sleep(500);
        DevicePanel.Tag.getElement().sendKeys(type);
        DevicePanel.Tag.getElement().sendKeys(Keys.ENTER);
        Thread.sleep(500);
    }

    @And("^User close autofill popup$")
    public void closeSuggestFillTag() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ClickPopUp.getBy(), 15);
        DevicePanel.ClickPopUp.getElement().click();
    }

    @And("^Open Device Details Pop-up$")
    public void openDeviceDetailsPopUp() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeviceDetailsPopUp.getBy(), 15);
        DevicePanel.DeviceDetailsPopUp.getElement().click();
    }

    @And("^User click references button$")
    public void DeviceReferences() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeviceReferences.getBy(), 15);
        Thread.sleep(500);
        DevicePanel.DeviceReferences.getElement().click();
    }

    @And("^User click change details view to dashboard view$")
    public void changeToDashboardView() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ChangeView.getBy(), 15);
        DevicePanel.ChangeView.getElement().click();
    }

    @And("^User click change details view to default view$")
    public void changeToDefaultView() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ChangeView.getBy(), 15);
        DevicePanel.ChangeView.getElement().click();
    }

    @Then("^Check if device details view is changed to dashboard view$")
    public void checkDeviceViewIsChangedToDashboardView() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, " Other Points");
    }

    @Then("^Check if device details view is changed to default view$")
    public void checkDeviceViewIsChangedToDefaultView() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "INPUT");
    }

    @Then("^Check if Device references appears on list$")
    public void checkDeviceReferences() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "ExactLogic");
    }

    @Then("^Check if Device has tag (.*)$")
    public void checkTagIsAddedToDevice(String type) throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, type);
    }

    @Then("^Check if Device are Discover successfully$")
    public void checkDiscover() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.CheckDiscover.getBy(), 15);
    }

    @And("^User click open (.*) Device Page$")
    public void openDevicePage(String device) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, device);
        PageObjectUtils.ContainsText(driver, device).click();

        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeviceDetailsButton.getBy(), 15);
        Thread.sleep(500);
        DevicePanel.DeviceDetailsButton.getElement().click();
    }

    @And("^User click open (.*) Device from Point Page$")
    public void openDeviceFromPointPage(String device) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, device);
        PageObjectUtils.ContainsText(driver, device).click();
        //Thread.sleep(1000);
    }

    @And("^User click open (.*) point pop-up$")
    public void openPointPopUp(String device) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, By.xpath("//label[text()[contains(.,'" + device + "')]]"), 15);
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()[contains(.,'" + device + "')]]")).click();
        //Thread.sleep(1000);
    }

    @And("^User Click edit Device button$")
    public void openEditDevicePage() throws Throwable {
        //Thread.sleep(2000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.EditDeviceButton.getBy(), 15);
        DevicePanel.EditDeviceButton.getElement().click();
    }

    @And("^User click edit button$")
    public void clickEditButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.EditButton.getBy(), 15);
        Thread.sleep(500);
        DevicePanel.EditButton.getElement().click();
    }

    @And("^User Click edit groups button$")
    public void clickEditGroupButton() throws Throwable {
        //Thread.sleep(2000);
        PageObjectUtils.IsElementVisible(driver, DevicePanel.EditGroupButton.getBy(), 15);
        DevicePanel.EditGroupButton.getElement().click();
    }

    @And("^User Click Add new Points group button$")
    public void addGroupPoints() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.AddPointGroupButton.getBy(), 15);
        //Thread.sleep(1000);
        DevicePanel.AddPointGroupButton.getElement().click();
    }

    @And("^User Click delete group$")
    public void deleteGroupPoints() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.ThreedotMenu.getBy(), 15);
        //Thread.sleep(2000);
        DevicePanel.ThreedotMenu.getElement().click();
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeleteGroupButton.getBy(), 15);
        //Thread.sleep(1000);
        DevicePanel.DeleteGroupButton.getElement().click();
    }

    @And("^User Drag Point to New Point Group$")
    public void dragPointToGroup() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.PointToDrag.getBy(), 5);
        Actions action = new Actions(driver);
        action.dragAndDrop(DevicePanel.PointToDrag.getElement(), DevicePanel.DragPointHere.getElement()).build().perform();
    }

    @And("^Drag Point to Template$")
    public void dragPointToTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.PointToDrag.getBy(), 15);
        Actions action = new Actions(driver);
        action.dragAndDrop(DevicePanel.PointToDrag.getElement(), DevicePanel.DragPointHere.getElement()).build().perform();
    }

    @And("^Remove Point from Template$")
    public void removePointFromTemplate() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.PointToDrag.getBy(), 15);
        Actions action = new Actions(driver);
        action.dragAndDrop(DevicePanel.PointToDrag.getElement(), DevicePanel.RemovePointFromTemplate.getElement()).build().perform();
    }

    @Then("^Check if Point appears on Template$")
    public void checkPointAppearsOnTemplate() throws Throwable {
        Thread.sleep(1000);
        List<WebElement> groups = driver.findElements(By.xpath("//*[@class='template-item ng-star-inserted']//*[text()[contains(.,'systemStatus')]]"));
        Assert.assertFalse(groups.isEmpty());
    }

    @Then("^Check if Point disappears from Template$")
    public void checkPointDisappearsFromTemplate() throws Throwable {
        Thread.sleep(1000);
        List<WebElement> groups = driver.findElements(By.xpath("//*[@class='template-item ng-star-inserted']//*[text()[contains(.,' DEV277127_systemStatus')]]"));
        Assert.assertTrue(groups.isEmpty());
    }

    @Then("^Check if Point appears on new (.*)$")
    public void checkPointAppearsOnNewGroup(String group) throws Throwable {
        //Thread.sleep(2500);
    }

    @Then("^Checks if (.*) is deleted$")
    public void checkGroupIsDeleted(String group) throws Throwable {
        //Thread.sleep(1000);
        List<WebElement> groups = driver.findElements(By.xpath("//*[@ng-reflect-model='Group 1']"));
        Assert.assertTrue(groups.isEmpty());
    }

    @And("^User click Confirm button$")
    public void confirmButton() throws Throwable {
        //Thread.sleep(1000);
        PageObjectUtils.CheckContainsText(driver, "Confirm");
        PageObjectUtils.ContainsText(driver, "Confirm").click();
    }

    @And("^User click Attachment button$")
    public void userClickAttachmentButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.OpenAttachments.getBy(), 30);
        DevicePanel.OpenAttachments.getElement().click();
    }

    @And("^User upload image$")
    public void userUploadImage() throws Throwable {
        Thread.sleep(500);

        //Add image
        WebElement fileInput = DevicePanel.UploadImage.getElement();
        fileInput.sendKeys(PageObjectUtils.filePathForUpload("test1.jpg"));
        Thread.sleep(3500);
    }

    @And("^User upload document$")
    public void userUploadDocument() throws Throwable {
        Thread.sleep(500);

        //Add image
        WebElement fileInput = DevicePanel.UploadDocument.getElement();
        fileInput.sendKeys(PageObjectUtils.filePathForUpload("sample.pdf"));
        Thread.sleep(3000);
    }

    @Then("^Check if image is uploaded successfully$")
    public void checkIfImageIsUploadedSuccessfully() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "test1.jpg");
    }

    @Then("^Check if image name is updated successfully$")
    public void checkIfImageNameIsUpdatedSuccessfully() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "editedName");
    }

    @And("^User click edit image button$")
    public void userClickEditImageButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.HoverImage.getBy(), 15);

        Actions action = new Actions(driver);
        action.moveToElement(DevicePanel.HoverImage.getElement()).moveToElement(DevicePanel.ThreedotMenu.getElement()).click().build().perform();

        PageObjectUtils.CheckContainsText(driver, "Edit File");
    }

    @And("^User change name to (.*)$")
    public void userChangeNameToEditedName(String name) {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.EditNameInput.getBy(), 15);
        DevicePanel.EditNameInput.getElement().clear();
        DevicePanel.EditNameInput.getElement().sendKeys(name);

        PageObjectUtils.IsElementVisible(driver, DevicePanel.SaveButton.getBy(), 30);
        DevicePanel.SaveButton.getElement().click();
    }

    @And("^User click edit document button$")
    public void userClickEditDocumentButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.HoverDocuments.getBy(), 15);

        Actions action = new Actions(driver);
        action.moveToElement(DevicePanel.HoverDocuments.getElement()).moveToElement(DevicePanel.ThreedotMenu.getElement()).click().build().perform();

        PageObjectUtils.CheckContainsText(driver, "Edit File");
    }

    @Then("^Check if note name is updated successfully$")
    public void checkIfNoteNameIsUpdatedSuccessfully() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "editedName");
    }

    @And("^User click delete image button$")
    public void userClickDeleteImageButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeleteButton.getBy(), 15);
        DevicePanel.DeleteButton.getElement().click();
    }

    @Then("^Check if (.*) is deleted successfully$")
    public void checkIfImageIsDeletedSuccessfully(String name) throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "Deleted Successfully");
    }

    @Then("^Check if document is uploaded successfully$")
    public void checkIfDocumentIsUploadedSuccessfully() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "sample.pdf");
    }

    @Then("^Check if document name is updated successfully$")
    public void checkIfDocumentNameIsUpdatedSuccessfully() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "editedName");
    }

    @And("^User click delete document button$")
    public void userClickDeleteDocumentButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeleteButton.getBy(), 15);
        DevicePanel.DeleteButton.getElement().click();
    }

    @And("^User click delete note button$")
    public void userClickDeleteNoteButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.DeleteButton.getBy(), 15);
        DevicePanel.DeleteButton.getElement().click();
    }

    @And("^User click edit note button$")
    public void userClickEditNoteButton() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.HoverNotes.getBy(), 15);

        Actions action = new Actions(driver);
        action.moveToElement(DevicePanel.HoverNotes.getElement()).moveToElement(DevicePanel.ThreedotMenu.getElement()).click().build().perform();

        PageObjectUtils.CheckContainsText(driver, "Edit Note");
    }

    @And("^User create note$")
    public void userCreateNote() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.AddNoteButton.getBy(), 15);
        DevicePanel.AddNoteButton.getElement().click();

        PageObjectUtils.IsElementVisible(driver, DevicePanel.NoteInputField.getBy(), 15);
        DevicePanel.NoteInputField.getElement().sendKeys("AutomationNote");

        PageObjectUtils.IsElementVisible(driver, DevicePanel.SaveButton.getBy(), 15);
        DevicePanel.SaveButton.getElement().click();
    }

    @Then("^Check if note is uploaded successfully$")
    public void checkIfNoteIsUploadedSuccessfully() throws Throwable {
        PageObjectUtils.CheckContainsText(driver, "AutomationNote");
    }

    @And("^User change note name to (.*)$")
    public void userChangeNoteNameToEditedName(String name) throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.NoteInputField.getBy(), 15);
        DevicePanel.NoteInputField.getElement().clear();
        DevicePanel.NoteInputField.getElement().sendKeys(name);

        PageObjectUtils.IsElementVisible(driver, DevicePanel.SaveButton.getBy(), 15);
        DevicePanel.SaveButton.getElement().click();
    }

    @And("^User open Photos dialog$")
    public void userOpenPhotosDialog() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.OpenPhotosDialog.getBy(), 15);
        DevicePanel.OpenPhotosDialog.getElement().click();
    }

    @And("^User open Notes dialog$")
    public void userOpenNotesDialog() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.OpenNotesDialog.getBy(), 15);
        DevicePanel.OpenNotesDialog.getElement().click();
        Thread.sleep(500);
    }

    @And("^User open Documents dialog$")
    public void userOpenDocumentsDialog() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, DevicePanel.OpenDocumentsDialog.getBy(), 15);
        DevicePanel.OpenDocumentsDialog.getElement().click();
        Thread.sleep(500);
    }
}
