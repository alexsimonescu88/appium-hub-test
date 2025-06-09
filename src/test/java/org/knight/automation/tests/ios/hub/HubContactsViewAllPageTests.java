package org.knight.automation.tests.ios.hub;

import org.knight.automation.pages.ios.HubContactsPage;
import org.knight.automation.pages.ios.HubContactsViewAllPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;

public class HubContactsViewAllPageTests extends BaseTest {

//    @Ignore
//    @Test
    public void testHubContactsViewAllPage_shouldSuccessfullyExpandActiveContactsAndOpenHubContactsViewAllPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubContactsPage hubContactsPage = new HubContactsPage(driver);
        HubContactsViewAllPage hubContactsViewAllPage = new HubContactsViewAllPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getContactsButton().click();
        Assert.assertTrue(hubContactsPage.getContactsLabel().getText().matches("Contacts"));
        Assert.assertTrue(hubContactsPage.getContactsSearchButton().isDisplayed());
        Assert.assertTrue(hubContactsPage.getHubButton().isDisplayed());

        hubContactsPage.getContactsChevronDown().click();
        Assert.assertTrue(hubContactsPage.getViewAllButton().isDisplayed());

        hubContactsPage.getViewAllButton().click();
        Assert.assertTrue(hubContactsViewAllPage.getContactsButton().isDisplayed());
        Assert.assertTrue(hubContactsViewAllPage.getContactsLabel().getText().matches("Contacts"));

        hubContactsViewAllPage.getContactsButton().click();
        Assert.assertTrue(hubContactsPage.getViewAllButton().isDisplayed());
        Assert.assertTrue(hubContactsPage.getContactsChevronUp().isDisplayed());

        hubContactsPage.getContactsChevronUp().click();
        Assert.assertTrue(hubContactsPage.getContactsChevronDown().isDisplayed());

        hubContactsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
