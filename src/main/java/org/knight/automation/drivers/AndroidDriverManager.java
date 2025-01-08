package org.knight.automation.drivers;

import io.appium.java_client.android.AndroidDriver;
import org.knight.automation.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;

public class AndroidDriverManager implements DriverManager {

    @Override
    public WebDriver createDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", Config.getProperty("android.platformName"));
        caps.setCapability("deviceName", Config.getProperty("android.deviceName"));
        caps.setCapability("automationName", Config.getProperty("android.automationName"));
        caps.setCapability("app", Config.getProperty("android.appPath"));

        try {
            return new AndroidDriver(URI.create(Config.getProperty("appium.url")).toURL(), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium URL", e);
        }
    }
}
