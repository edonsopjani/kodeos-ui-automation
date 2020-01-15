package stepdefs;

import cucumber.api.java.en.When;
import pageobjects.pages.PageObjectUtils;
import pageobjects.pages.UserProfilePanel;

public class TenantStepDefs extends CommonStepObjects {

    @When("^Go to User Profiledd$")
    public void goToUserProfiledd() throws Throwable {
        PageObjectUtils.IsElementVisible(driver, UserProfilePanel.goToUserProfile.getBy(), 15);
        Thread.sleep(500);
        UserProfilePanel.goToUserProfile.getElement().click();
    }

}