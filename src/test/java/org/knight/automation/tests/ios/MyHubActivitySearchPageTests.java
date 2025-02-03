package org.knight.automation.tests.ios;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.MyHubActivitySearchPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MyHubActivitySearchPageTests extends BaseTest {

    @Test
    public void testActivitySearch_ShouldSuccessfullySearchAnActivity() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubActivitySearchPage myHubActivitySearchPage = new MyHubActivitySearchPage(driver);

        myHubPage.getActivitySearchButton().click();
        Assert.assertTrue(myHubActivitySearchPage.getSearchLabel().isDisplayed());

        myHubActivitySearchPage.getAllButton().click();
        Assert.assertTrue(myHubActivitySearchPage.getAllButton().isEnabled());

        String emptySearch = myHubActivitySearchPage.getSearchField().getText();
        Assert.assertTrue(myHubActivitySearchPage.getSearchField().getText().isEmpty());

        myHubActivitySearchPage.getSearchField().sendKeys("London");

        String londonSearch = myHubActivitySearchPage.getSearchField().getText();

        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();

        scrollParams.put("direction", "up");
        scrollParams.put("element", myHubActivitySearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        scrollParams.put("direction", "down");
        scrollParams.put("element", myHubActivitySearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        Assert.assertEquals(myHubActivitySearchPage.getSearchField().getText(), londonSearch);

        myHubActivitySearchPage.getClearTextButton().click();
        Assert.assertEquals(myHubActivitySearchPage.getSearchField().getText(), emptySearch);

//        activitySearchPage.getMyHubButton().click();
//        Assert.assertTrue(activitySearchPage.getMyHubButton().isEnabled());

        myHubActivitySearchPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

}
