package org.knight.automation.drivers;

import org.knight.automation.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager implements DriverManager {

    @Override
    public WebDriver createDriver() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", Config.getProperty("web.chromeDriverPath"));

        // Set up ChromeOptions (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        // Return the ChromeDriver instance
        return new ChromeDriver(options);
    }
}
