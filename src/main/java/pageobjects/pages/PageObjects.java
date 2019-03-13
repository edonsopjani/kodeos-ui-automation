package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;


public interface PageObjects {
    WebDriver driver = WebDriverFactory.getInstance().getWebDriver();



    void initializeMap();

}
