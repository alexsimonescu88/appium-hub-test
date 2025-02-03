package org.knight.automation.tests.ios;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.HubCompaniesPage;
import org.knight.automation.pages.ios.HubCompaniesSearchPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HubCompaniesSearchPageTests extends BaseTest {

    @Test
    public void testAccessAndSearchInputToHubCompaniesSearchPage_shouldSuccessfullyOpenHubCompaniesSearchPageAndDisplayResultsBasedOnInputs() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCompaniesPage hubCompaniesPage = new HubCompaniesPage(driver);
        HubCompaniesSearchPage hubCompaniesSearchPage = new HubCompaniesSearchPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCompaniesButton().click();
        Assert.assertTrue(hubCompaniesPage.getCompaniesLabel().getText().matches("Companies"));
        Assert.assertTrue(hubCompaniesPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubCompaniesPage.getCompaniesSearchButton().isDisplayed());

        hubCompaniesPage.getCompaniesSearchButton().click();
        Assert.assertTrue(hubCompaniesSearchPage.getSearchLabel().getText().matches("Search"));
        Assert.assertTrue(hubCompaniesSearchPage.getCompaniesButton().isDisplayed());

        String searchInput = "Something";
        hubCompaniesSearchPage.getSearchField().sendKeys(searchInput);

        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();
        scrollParams.put("direction", "up");
        scrollParams.put("element", hubCompaniesSearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);


        scrollParams.put("direction", "down");
        scrollParams.put("element", hubCompaniesSearchPage.getVerticalScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        hubCompaniesSearchPage.getClearSearchButton().click();
        hubCompaniesSearchPage.getCompaniesButton().click();
        Assert.assertTrue(hubCompaniesPage.getCompaniesLabel().isDisplayed());

        hubCompaniesPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
