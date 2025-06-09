package org.knight.automation.tests.ios.hub;

import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.HubRequirementsPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubRequirementsPageTests extends BaseTest {

    @Test
    public void testAccessToHubRequirementsPage_shouldSuccessfullyAccessHubRequirementsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubRequirementsPage hubRequirementsPage = new HubRequirementsPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getRequirementsButton().click();
        Assert.assertTrue(hubRequirementsPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubRequirementsPage.getRequirementsLabel().isDisplayed());
        Assert.assertTrue(hubRequirementsPage.getRequirementsSearchButton().isDisplayed());

        hubRequirementsPage.getTeamButton().click();

        hubRequirementsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().getText().matches("My hub"));
    }
}
