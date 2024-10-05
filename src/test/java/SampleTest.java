import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

    private IOSDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        var options = new BaseOptions()
                .amend("platformName", "iOS")
                .amend("appium:udid", "D01C27B5-B82F-431E-A572-5D2279579A95")
                .amend("appium:automationName", "XCUITest")
                .amend("appium:includeSafariInWebviews", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @Test
    public void sampleTest() {
        // Find the input element and interact with it
        WebElement inputField = driver.findElement (new By.ById( "Activity Search"));

        inputField.click ();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
