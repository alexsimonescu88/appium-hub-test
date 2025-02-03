package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubCallbacksPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubCallbacksPageTests extends BaseTest {

    @Test(priority = 1)
    public void testAccessToHubCallbacksPage_shouldSuccessfullyAccessHubCallbacksPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubCallbacksPage.getMyButton().isDisplayed());
        Assert.assertTrue(hubCallbacksPage.getTeamButton().isDisplayed());
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));
        Assert.assertTrue(hubCallbacksPage.getActivityCallbacksLabel().isDisplayed());
        Assert.assertTrue(hubCallbacksPage.getRequirementCallbacksLabel().isDisplayed());
        Assert.assertTrue(hubCallbacksPage.getNotInstructedCallbacksLabel().isDisplayed());
        Assert.assertTrue(hubCallbacksPage.getKeepInTouchCallbacksLabel().isDisplayed());

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 2)
    public void testAccessAndExpansionOfMyActivityInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageMyActivity() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getActivityCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getUpcomingButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getTodayButton().click();
        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 3)
    public void testAccessAndExpansionOfMyRequirementInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageMyRequirement() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getRequirementCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getUpcomingButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getTodayButton().click();
        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 4)
    public void testAccessAndExpansionOfMyNotInstructedInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageMyNotInstructed() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getNotInstructedCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getUpcomingButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getTodayButton().click();
        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 5)
    public void testAccessAndExpansionOfMyKeepInTouchInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageMyKeepInTouch() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getKeepInTouchCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 6)
    public void testAccessAndExpansionOfTeamActivityInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageTeamActivity() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getTeamButton().click();

        hubCallbacksPage.getActivityCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getUpcomingButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getTodayButton().click();
        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 7)
    public void testAccessAndExpansionOfTeamRequirementInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageTeamRequirement() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getTeamButton().click();

        hubCallbacksPage.getRequirementCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getUpcomingButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getViewAllButton().isDisplayed());

        hubCallbacksPage.getTodayButton().click();
        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 8)
    public void testAccessAndExpansionOfTeamNotInstructedInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageTeamNotInstructed() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getTeamButton().click();

        hubCallbacksPage.getNotInstructedCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getUpcomingButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getOverdueButton().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getTodayButton().click();
        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 9)
    public void testAccessAndExpansionOfTeamKeepInTouchInHubCallbacksPage_shouldSuccessfullyAccessAndExpandHubCallbacksPageTeamKeepInTouch() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCallbacksPage hubCallbacksPage = new HubCallbacksPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCallbacksButton().click();
        Assert.assertTrue(hubCallbacksPage.getCallbacksLabel().getText().matches("Callbacks"));

        hubCallbacksPage.getTeamButton().click();

        hubCallbacksPage.getKeepInTouchCallbacksChevronDown().click();
        Assert.assertTrue(hubCallbacksPage.getNoCallbacksLabel().isDisplayed());

        hubCallbacksPage.getChevronUp().click();

        hubCallbacksPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
