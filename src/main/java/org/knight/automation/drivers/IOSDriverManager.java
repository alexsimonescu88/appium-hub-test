package org.knight.automation.drivers;

import io.appium.java_client.ios.IOSDriver;
import org.knight.automation.config.Config;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class IOSDriverManager implements DriverManager {
    public WebDriver createDriver() {

        // Simulator local
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


        // Simulator BrowserStack
//        MutableCapabilities caps = new MutableCapabilities();
//
//        // Core W3C Capabilities
//        caps.setCapability("platformName", "iOS");
//        caps.setCapability("appium:deviceName", "iPhone 16");
//        caps.setCapability("appium:platformVersion", "18");
//        caps.setCapability("appium:app", "bs://fe71955187c3ce255736c51f33b031e66f689d49");
//
//        // BrowserStack Capabilities - Use `bstack:options`
//        MutableCapabilities browserstackOptions = new MutableCapabilities();
//        browserstackOptions.setCapability("userName", "simonescualexand_JDoEC6");
//        browserstackOptions.setCapability("accessKey", "B6iQkKHbVGo4JTh8XERv");
//
//        caps.setCapability("bstack:options", browserstackOptions);
//
//        try {
//            return new IOSDriver(
//                    new URL("https://hub-cloud.browserstack.com/wd/hub"),
//                    caps
//            );
//        } catch (MalformedURLException e) {
//            throw new RuntimeException("Invalid Appium URL", e);
//        }
    }
}
