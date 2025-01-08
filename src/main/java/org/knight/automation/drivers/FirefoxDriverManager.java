package org.knight.automation.drivers;

import org.knight.automation.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager implements DriverManager {
    @Override
    public WebDriver createDriver() {
        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", Config.getProperty("web.geckoDriverPath"));

        // Set up FirefoxOptions (optional)
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized"); // Firefox doesn't always obey this, but it's good practice
        options.addArguments("--disable-notifications");

        // Return the FirefoxDriver instance
        return new FirefoxDriver(options);
    }
}
