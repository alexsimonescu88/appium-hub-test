/*
package org.example;

import io.appium.java_client.ios.IOSDriver;

import java.net.URL;
// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client
import io.appium.java_client.remote.options.BaseOptions;
import junit.framework.T

public class SampleTest {

    private IOSDriver driver;

    @Before
    public void setUp() {
        var options = new BaseOptions()
                .amend("platformName", "iOS")
                .amend("appium:udid", "D01C27B5-B82F-431E-A572-5D2279579A95")
                .amend("appium:automationName", "XCUITest")
                .amend("appium:includeSafariInWebviews", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        driver = new IOSDriver(this.getUrl(), options);
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
*/
