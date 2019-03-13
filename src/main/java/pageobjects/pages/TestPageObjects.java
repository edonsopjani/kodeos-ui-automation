package pageobjects.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestPageObjects {
    public static WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "building-list-header-search-bar")
    public static WebElement list;

    @FindBy(how = How.XPATH, using =  "//*[text()[contains(.,'Chrysler House')]]")
    public static WebElement name;


}
