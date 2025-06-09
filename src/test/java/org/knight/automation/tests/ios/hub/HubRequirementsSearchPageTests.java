package org.knight.automation.tests.ios.hub;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.HubRequirementsPage;
import org.knight.automation.pages.ios.HubRequirementsSearchPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.knight.automation.tests.utils.Scrollable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubRequirementsSearchPageTests extends BaseTest implements Scrollable {

    @Test
    public void testAccessAndSearchResultsForHubRequirementsSearchPage_shouldSuccessfullyAccessAndDisplaySearchResults() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubRequirementsPage hubRequirementsPage = new HubRequirementsPage(driver);
        HubRequirementsSearchPage hubRequirementsSearchPage = new HubRequirementsSearchPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getRequirementsButton().click();
        Assert.assertTrue(hubRequirementsPage.getRequirementsLabel().getText().matches("Requirements"));
        Assert.assertTrue(hubRequirementsPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubRequirementsPage.getRequirementsSearchButton().isDisplayed());

        hubRequirementsPage.getRequirementsSearchButton().click();
        Assert.assertTrue(hubRequirementsSearchPage.getSearchLabel().getText().matches("Search"));
        Assert.assertTrue(hubRequirementsSearchPage.getRequirementsButton().isDisplayed());

        String searchInput = "Shirely";
        hubRequirementsSearchPage.getSearchField().sendKeys(searchInput);
        hubRequirementsSearchPage.getTeamButton().click();
        hubRequirementsSearchPage.getAllButton().click();

        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        scroll("up", hubRequirementsSearchPage.getVerticalScrollView(), appiumDriver);
        scroll("down", hubRequirementsSearchPage.getVerticalScrollView(), appiumDriver);

        hubRequirementsSearchPage.getClearSearch().click();
        hubRequirementsSearchPage.getRequirementsButton().click();
        Assert.assertTrue(hubRequirementsPage.getRequirementsLabel().isDisplayed());

        hubRequirementsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
