package org.knight.automation.drivers;

import io.appium.java_client.ios.IOSDriver;
import org.knight.automation.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;

public class IOSDriverManager implements DriverManager {
    public WebDriver createDriver() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", Config.getProperty("ios.platformName"));
        caps.setCapability("appium:automationName", Config.getProperty("ios.automationName"));
        caps.setCapability("appium:includeSafariInWebviews", true);
        caps.setCapability("appium:newCommandTimeout", 3600);
        caps.setCapability("appium:connectHardwareKeyboard", true);
        caps.setCapability("appium:udid", Config.getProperty("ios.udid"));

        try {
            return new IOSDriver(URI.create(Config.getProperty("appium.url")).toURL(), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium URL", e);
        }
    }
}
