package org.knight.automation.tests.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public interface Scrollable {

    default void scroll(String direction, WebElement element, AppiumDriver appiumDriver) {
        Map<String, Object> scrollParams = new HashMap<>();
        scrollParams.put("direction", direction);
        scrollParams.put("element", element);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
    }
}
