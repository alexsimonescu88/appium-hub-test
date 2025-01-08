package org.knight.automation.drivers;

import org.knight.automation.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class EdgeDriverManager implements DriverManager {
    @Override
    public WebDriver createDriver() {
// Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", Config.getProperty("web.edgeDriverPath"));

        // Set up EdgeOptions (optional)
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        // Return the EdgeDriver instance
        return new EdgeDriver(options);
    }
}
