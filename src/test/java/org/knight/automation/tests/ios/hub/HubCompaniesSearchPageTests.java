package org.knight.automation.tests.ios.hub;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.HubCompaniesPage;
import org.knight.automation.pages.ios.HubCompaniesSearchPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.knight.automation.tests.utils.Scrollable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubCompaniesSearchPageTests extends BaseTest implements Scrollable {

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
        scroll("up", hubCompaniesSearchPage.getVerticalScrollView(), appiumDriver);
        scroll("down", hubCompaniesSearchPage.getVerticalScrollView(), appiumDriver);

        hubCompaniesSearchPage.getClearSearchButton().click();
        hubCompaniesSearchPage.getCompaniesButton().click();
        Assert.assertTrue(hubCompaniesPage.getCompaniesLabel().isDisplayed());

        hubCompaniesPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
