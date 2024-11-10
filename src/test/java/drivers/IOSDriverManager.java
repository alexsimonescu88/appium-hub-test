package drivers;

import config.Config;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class IOSDriverManager implements DriverManager {
    public WebDriver createDriver() {

        var caps = new BaseOptions()
                .amend("platformName", "iOS")
                .amend("appium:udid", "D01C27B5-B82F-431E-A572-5D2279579A95")
                .amend("appium:automationName", "XCUITest")
                .amend("appium:includeSafariInWebviews", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "iOS");
//        caps.setCapability("appium:deviceName", Config.getProperty("ios.deviceName"));
//        caps.setCapability("appium:udid", "D01C27B5-B82F-431E-A572-5D2279579A95");
//        caps.setCapability("appium:automationName", "XCUITest");
//        caps.setCapability("appium:includeSafariInWebviews", true);
//        caps.setCapability("appium:newCommandTimeout", 3600);
//        caps.setCapability("appium:connectHardwareKeyboard", true);

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", Config.getProperty("ios.platformName"));
//        caps.setCapability("deviceName", Config.getProperty("ios.deviceName"));
//        caps.setCapability("appium:automationName", Config.getProperty("ios.automationName"));
//        caps.setCapability("appium:newCommandTimeout", 3600);
//        caps.setCapability("appium:connectHardwareKeyboard", true);
//        caps.setCapability("appium:udid", Config.getProperty("ios.udid"));
//        caps.setCapability("app", Config.getProperty("ios.appPath"));

        try {
            return new IOSDriver(URI.create(Config.getProperty("appium.url")).toURL(), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium URL", e);
        }
    }
}
