package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class WebDriverFactory {

    private String browserName, browserVersion;

    private WebDriverFactory() {
    }

    public WebDriver getWebDriver() {
        return driver;
    }


    private static WebDriverFactory ourInstance = new WebDriverFactory();

    public static WebDriverFactory getInstance() {
        return ourInstance;
    }

    private WebDriver driver = createWebDriver();


    private WebDriver createWebDriver() {
        WebDriver driver = null;
        char b;
        String browser = System.getProperty("websiteBrowser").toLowerCase();
        if (browser.equals("headless")) {
            b = 'h';
        } else {
            b = 'c';
        }
        switch (b) {
            case 'c': {
                if (System.getProperty("os.name").contains("Windows"))
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                else
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
                browserName = ((ChromeDriver) driver).getCapabilities().getBrowserName();
                browserVersion = ((ChromeDriver) driver).getCapabilities().getVersion();
                break;
            }
            case 'h': {
                if (System.getProperty("os.name").contains("Windows"))
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                else
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriverlinux");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
                driver = new ChromeDriver(options);
                browserName = ((ChromeDriver) driver).getCapabilities().getBrowserName();
                browserVersion = ((ChromeDriver) driver).getCapabilities().getVersion();
            }
            break;
        }

        assert driver != null;
        driver.manage().timeouts().setScriptTimeout(10, SECONDS);
        System.out.println("Using browser with version: " + browserName + " " + browserVersion);
        return driver;
    }
}