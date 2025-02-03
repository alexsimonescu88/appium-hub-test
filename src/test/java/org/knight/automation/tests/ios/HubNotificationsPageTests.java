package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubNotificationsPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubNotificationsPageTests extends BaseTest {

    @Test
    public void testAccessToHubNotificationsPage_shouldSuccessfullyAccessHubNotificationsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubNotificationsPage hubNotificationsPage = new HubNotificationsPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getNotificationsButton().click();
        Assert.assertTrue(hubNotificationsPage.getNotificationsLabel().getText().matches("Notifications"));
        Assert.assertTrue(hubNotificationsPage.getNotificationsFilterButton().isDisplayed());
        Assert.assertTrue(hubNotificationsPage.getHubButton().isDisplayed());

        hubNotificationsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
