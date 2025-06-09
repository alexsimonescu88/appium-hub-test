package org.knight.automation.tests.ios.hub;

import org.knight.automation.pages.ios.HubActivitiesPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubActivitiesPageTests extends BaseTest {

    @Test
    public void testAccessToHubActivitiesPage_shouldSuccessfullyAccessHubActivitiesPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubActivitiesPage hubActivitiesPage = new HubActivitiesPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getActivitiesButton().click();
        Assert.assertTrue(hubActivitiesPage.getActivitiesLabel().isDisplayed());
        Assert.assertTrue(hubActivitiesPage.getActivitiesSearchButton().isDisplayed());
        Assert.assertTrue(hubActivitiesPage.getMyButton().isDisplayed());
        Assert.assertTrue(hubActivitiesPage.getTeamButton().isDisplayed());
        Assert.assertTrue(hubActivitiesPage.getHubButton().isDisplayed());

        hubActivitiesPage.getTeamButton().click();
        hubActivitiesPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
