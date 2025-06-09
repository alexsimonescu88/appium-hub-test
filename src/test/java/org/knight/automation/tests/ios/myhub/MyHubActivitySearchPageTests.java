package org.knight.automation.tests.ios.myhub;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.MyHubActivitySearchPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.knight.automation.tests.utils.Scrollable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyHubActivitySearchPageTests extends BaseTest implements Scrollable {

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

        scroll("up", myHubActivitySearchPage.getVerticalScrollView(), appiumDriver);
        scroll("down", myHubActivitySearchPage.getVerticalScrollView(), appiumDriver);

        Assert.assertEquals(myHubActivitySearchPage.getSearchField().getText(), londonSearch);

        myHubActivitySearchPage.getClearTextButton().click();
        Assert.assertEquals(myHubActivitySearchPage.getSearchField().getText(), emptySearch);

//        activitySearchPage.getMyHubButton().click();
//        Assert.assertTrue(activitySearchPage.getMyHubButton().isEnabled());

        myHubActivitySearchPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

}
