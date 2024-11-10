package base;

import config.Config;
import drivers.AndroidDriverManager;
import drivers.DriverManager;
import drivers.IOSDriverManager;
import enums.PlatformType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    private DriverManager driverManager;

    @BeforeClass
    public void setUp() {
        PlatformType platform = PlatformType.valueOf(Config.getProperty("platform").toUpperCase());

        switch (platform) {
            case IOS -> driverManager = new IOSDriverManager();
            case ANDROID -> driverManager = new AndroidDriverManager();
        }

        driver = driverManager.createDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
