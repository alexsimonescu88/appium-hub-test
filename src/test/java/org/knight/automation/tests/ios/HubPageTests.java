package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubPageTests extends BaseTest {

    @Test
    public void testPresenceOfAllElementsOnHubPage_ShouldSuccessfullyIdentifyThePresenceOfAllElementsOnHubPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        myHubPage.getHubButton().click();

        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));
        Assert.assertTrue(hubPage.getMyHubButton().isDisplayed());
        Assert.assertTrue(hubPage.getContactsButton().isDisplayed());
        Assert.assertTrue(hubPage.getCompaniesButton().isDisplayed());
        Assert.assertTrue(hubPage.getPropertiesButton().isDisplayed());
        Assert.assertTrue(hubPage.getActivitiesButton().isDisplayed());
        Assert.assertTrue(hubPage.getRequirementsButton().isDisplayed());
        Assert.assertTrue(hubPage.getConnexionsButton().isDisplayed());
        Assert.assertTrue(hubPage.getCalendarButton().isDisplayed());
        Assert.assertTrue(hubPage.getNotificationsButton().isDisplayed());
        Assert.assertTrue(hubPage.getCallbacksButton().isDisplayed());
        Assert.assertTrue(hubPage.getHubButton().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().getText().matches("My hub"));
    }
}
