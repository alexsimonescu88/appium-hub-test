package org.knight.automation.drivers;

import io.appium.java_client.safari.SafariDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDriverManager implements DriverManager {
    @Override
    public WebDriver createDriver() {
        SafariOptions options = new SafariOptions();
        // No executable path is required for SafariDriver
        // Safari WebDriver is included with Safari, and you don't need to set a driver path.
        // However, Safari must be enabled for WebDriver use on your machine:
        //
        // Open Safari.
        // Go to Preferences > Advanced and enable "Show Develop menu in menu bar."
        // From the Develop menu, select "Allow Remote Automation."

        return new SafariDriver(options);
    }
}
