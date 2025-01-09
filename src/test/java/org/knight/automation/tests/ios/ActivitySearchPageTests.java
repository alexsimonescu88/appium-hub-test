package org.knight.automation.tests.ios;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.knight.automation.pages.ios.ActivitySearchPage;
import org.knight.automation.pages.ios.MyHubPage;

import java.util.HashMap;
import java.util.Map;

public class ActivitySearchPageTests extends BaseTest {

    @Test
    public void testActivitySearch_ShouldSuccessfullySearchAnActivity() {
        MyHubPage myHubPage = new MyHubPage(driver);
        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);

        myHubPage.getActivitySearchButton().click();
        Assert.assertTrue(activitySearchPage.getSearchLabel().isDisplayed());

        activitySearchPage.getAllButton().click();
        Assert.assertTrue(activitySearchPage.getAllButton().isEnabled());

        String emptySearch = activitySearchPage.getSearchField().getText();
        Assert.assertTrue(activitySearchPage.getSearchField().getText().isEmpty());

        activitySearchPage.getSearchField().sendKeys("London");

        String londonSearch = activitySearchPage.getSearchField().getText();

        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();

        scrollParams.put("direction", "up");
        scrollParams.put("element", activitySearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        scrollParams.put("direction", "down");
        scrollParams.put("element", activitySearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        Assert.assertEquals(activitySearchPage.getSearchField().getText(), londonSearch);

        activitySearchPage.getClearTextButton().click();
        Assert.assertEquals(activitySearchPage.getSearchField().getText(), emptySearch);

//        activitySearchPage.getMyHubButton().click();
//        Assert.assertTrue(activitySearchPage.getMyHubButton().isEnabled());

        activitySearchPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

}
