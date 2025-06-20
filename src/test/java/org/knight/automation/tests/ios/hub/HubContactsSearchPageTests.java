package org.knight.automation.tests.ios.hub;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.HubContactsPage;
import org.knight.automation.pages.ios.HubContactsSearchPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.knight.automation.tests.utils.Scrollable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubContactsSearchPageTests extends BaseTest implements Scrollable {

    @Test
    public void testAccessAndSearchInputToHubContactsSearchPage_shouldSuccessfullyOpenHubContactsSearchPageAndDisplayResultsBasedOnInputs() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubContactsPage hubContactsPage = new HubContactsPage(driver);
        HubContactsSearchPage hubContactsSearchPage = new HubContactsSearchPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getContactsButton().click();
        Assert.assertTrue(hubContactsPage.getContactsLabel().getText().matches("Contacts"));
        Assert.assertTrue(hubContactsPage.getContactsSearchButton().isDisplayed());
        Assert.assertTrue(hubContactsPage.getHubButton().isDisplayed());

        hubContactsPage.getContactsSearchButton().click();
        Assert.assertTrue(hubContactsSearchPage.getSearchLabel().getText().matches("Search"));

        String searchInput = "Alex";
        hubContactsSearchPage.getSearchField().sendKeys(searchInput);
        hubContactsSearchPage.getTeamButton().click();
        hubContactsSearchPage.getAllButton().click();

        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        scroll("up", hubContactsSearchPage.getVerticalScrollView(), appiumDriver);
        scroll("down", hubContactsSearchPage.getVerticalScrollView(), appiumDriver);
        scroll("down", hubContactsSearchPage.getVerticalScrollView(), appiumDriver);

        hubContactsSearchPage.getClearSearchButton().click();

        hubContactsSearchPage.getMyButton().click();
        hubContactsSearchPage.getContactsButton().click();
        Assert.assertTrue(hubContactsPage.getContactsSearchButton().isDisplayed());
        Assert.assertTrue(hubContactsPage.getContactsLabel().isDisplayed());
        Assert.assertTrue(hubContactsPage.getHubButton().isDisplayed());

        hubContactsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
