package org.knight.automation.tests;

import org.knight.automation.config.Config;
import org.knight.automation.drivers.*;
import org.knight.automation.enums.BrowserType;
import org.knight.automation.enums.PlatformType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    protected WebDriver driver;


    @BeforeClass
    public void setUp() {
        if (Config.getProperty("platform") != null) {

            PlatformType platform = PlatformType.valueOf(Config.getProperty("platform").toUpperCase());
            DriverManager driverManager = null;

            switch (platform) {
                case IOS -> driverManager = new IOSDriverManager();
                case ANDROID -> driverManager = new AndroidDriverManager();
                case WEB -> {
                    if (Config.getProperty("browser") != null) {
                        BrowserType browser = BrowserType.valueOf(Config.getProperty("browser").toUpperCase());
                        switch (browser) {
                            case CHROME -> driverManager = new ChromeDriverManager();
                            case FIREFOX -> driverManager = new FirefoxDriverManager();
                            case EDGE -> driverManager = new EdgeDriverManager();
                            case SAFARI -> driverManager = new SafariDriverManager();
                            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
                        }
                    }
                }
                default -> throw new IllegalArgumentException("Invalid platform: " + platform);
            }

            assert driverManager != null;
            driver = driverManager.createDriver();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
