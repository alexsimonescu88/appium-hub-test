package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubCallbacksPage;
import org.knight.automation.pages.ios.HubCallbacksViewAllPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubCallbacksViewAllPageTests extends BaseTest {

    @Test
    public void testAccessToHubCallbacksViewAllPage_shouldSuccessfullyAccessHubCallbacksViewAllPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);
        HubCallbacksViewAllPage hubCallbacksViewAllPage = new HubCallbacksViewAllPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getTeamButton().click();

        hubCallbacksPage.getRequirementCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getViewAllButton().isDisplayed());

        hubCallbacksPage.getViewAllButton().click();
        Assert.assertTrue(hubCallbacksViewAllPage.getViewAllLabel().isDisplayed());
        Assert.assertTrue(hubCallbacksViewAllPage.getCallbacksButton().isDisplayed());
        Assert.assertTrue(hubCallbacksViewAllPage.getRequirementCallbacksLabel().isDisplayed());
        Assert.assertTrue(hubCallbacksViewAllPage.getNoInfoAvailableLabel().isDisplayed());

        hubCallbacksViewAllPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().isDisplayed());

        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
