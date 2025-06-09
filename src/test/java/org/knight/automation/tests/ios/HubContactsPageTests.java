package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubContactsPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HubContactsPageTests extends BaseTest {

    @Test(priority = 1)
    public void testAccessToHubContactsPage_shouldSuccessfullyOpenHubContactsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubContactsPage hubContactsPage = new HubContactsPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getContactsButton().click();
        Assert.assertTrue(hubContactsPage.getContactsLabel().getText().matches("Contacts"));
        Assert.assertTrue(hubContactsPage.getContactsSearchButton().isDisplayed());
        Assert.assertTrue(hubContactsPage.getHubButton().isDisplayed());
    }

    @Test(priority = 2)
    @Ignore
    public void testActiveContactsExpansion_shouldSuccessfullyExpandActiveContactsFromHubContactsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubContactsPage hubContactsPage = new HubContactsPage(driver);

        Assert.assertTrue(hubContactsPage.getContactsLabel().getText().matches("Contacts"));
//        Assert.assertTrue(hubContactsPage.getActiveContacts().isDisplayed());
        Assert.assertTrue(hubContactsPage.getContactsSearchButton().isDisplayed());
        Assert.assertTrue(hubContactsPage.getHubButton().isDisplayed());

        hubContactsPage.getContactsChevronDown().click();
//        Assert.assertTrue(hubContactsPage.getViewAllButton().isDisplayed());
//
        hubContactsPage.getContactsChevronUp().click();
//        Assert.assertTrue(hubContactsPage.getContactsChevronDown().isDisplayed());

        hubContactsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
