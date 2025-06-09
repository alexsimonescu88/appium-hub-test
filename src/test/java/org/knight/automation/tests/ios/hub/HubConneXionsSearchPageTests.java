package org.knight.automation.tests.ios.hub;

import org.knight.automation.pages.ios.HubConneXionsPage;
import org.knight.automation.pages.ios.HubConneXionsSearchPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubConneXionsSearchPageTests extends BaseTest {

    @Test
    public void testAccessAndSearchInputToHubConneXionsSearchPage_shouldSuccessfullyOpenHubConneXionsSearchPageAndDisplayResultsBasedOnInputs() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubConneXionsPage hubConneXionsPage = new HubConneXionsPage(driver);
        HubConneXionsSearchPage hubConneXionsSearchPage = new HubConneXionsSearchPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getConnexionsButton().click();
        Assert.assertTrue(hubConneXionsPage.getConneXionsLabel().getText().matches("ConneXions"));
        Assert.assertTrue(hubConneXionsPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubConneXionsPage.getConneXionsSearchButton().isDisplayed());

//        hubConneXionsPage.getConneXionsSearchButton().click();
        Assert.assertTrue(hubConneXionsSearchPage.getConneXionsLabel().getText().matches("ConneXions"));
//        Assert.assertTrue(hubConneXionsSearchPage.getConneXionsButton().isDisplayed());

//        String searchInput = "Alex";
//        hubConneXionsSearchPage.getSearchField().sendKeys(searchInput);
//        Assert.assertTrue(hubConneXionsSearchPage.getNoConneXionsLabel().isDisplayed());

//        hubConneXionsSearchPage.getClearSearchButton().click();
//        hubConneXionsSearchPage.getSearchField().sendKeys(searchInput);
//        hubConneXionsSearchPage.getCancelButton().click();
//        Assert.assertTrue(hubConneXionsSearchPage.getConneXionsLabel().isDisplayed());

//        hubConneXionsSearchPage.getConneXionsButton().click();
//        Assert.assertTrue(hubConneXionsSearchPage.getConneXionsLabel().isDisplayed());

        hubConneXionsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
