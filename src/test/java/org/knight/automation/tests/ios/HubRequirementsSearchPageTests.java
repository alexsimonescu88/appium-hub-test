package org.knight.automation.tests.ios;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.*;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HubRequirementsSearchPageTests extends BaseTest {

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
        Map<String, Object> scrollParams = new HashMap<>();
        scrollParams.put("direction", "up");
        scrollParams.put("element", hubRequirementsSearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);


        scrollParams.put("direction", "down");
        scrollParams.put("element", hubRequirementsSearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        hubRequirementsSearchPage.getClearSearch().click();
        hubRequirementsSearchPage.getRequirementsButton().click();
        Assert.assertTrue(hubRequirementsPage.getRequirementsLabel().isDisplayed());

        hubRequirementsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
