package org.knight.automation.tests.ios.hub;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.HubActivitiesPage;
import org.knight.automation.pages.ios.HubActivitiesSearchPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.knight.automation.tests.utils.Scrollable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubActivitiesSearchPageTests extends BaseTest implements Scrollable {

    @Test
    public void testAccessToHubActivitiesSearchPage_shouldSuccessfullyAccessHubActivitySearchPAge() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubActivitiesPage hubActivitiesPage = new HubActivitiesPage(driver);
        HubActivitiesSearchPage hubActivitiesSearchPage = new HubActivitiesSearchPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getActivitiesButton().click();
        Assert.assertTrue(hubActivitiesPage.getActivitiesLabel().getText().matches("Activities"));
        Assert.assertTrue(hubActivitiesPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubActivitiesPage.getActivitiesSearchButton().isDisplayed());

        hubActivitiesPage.getActivitiesSearchButton().click();
        Assert.assertTrue(hubActivitiesSearchPage.getActivitiesSearchLabel().getText().matches("Search"));
        Assert.assertTrue(hubActivitiesSearchPage.getActivitiesButton().isDisplayed());

        String searchInput = "London";
        hubActivitiesSearchPage.getSearchField().sendKeys(searchInput);
        hubActivitiesSearchPage.getTeamButton().click();
        hubActivitiesSearchPage.getAllButton().click();

        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        scroll("up", hubActivitiesSearchPage.getVerticalScrollView(), appiumDriver);
        scroll("down", hubActivitiesSearchPage.getVerticalScrollView(), appiumDriver);

        hubActivitiesSearchPage.getClearSearchButton().click();
        hubActivitiesSearchPage.getActivitiesButton().click();
        Assert.assertTrue(hubActivitiesPage.getActivitiesLabel().isDisplayed());

        hubActivitiesPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
