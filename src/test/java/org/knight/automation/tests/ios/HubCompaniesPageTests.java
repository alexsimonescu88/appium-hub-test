package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubCompaniesPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubCompaniesPageTests extends BaseTest {

    @Test(priority = 1)
    public void testAccessToHubCompaniesPage_shouldSuccessfullyOpenHubCompaniesPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCompaniesPage hubCompaniesPage = new HubCompaniesPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCompaniesButton().click();
        Assert.assertTrue(hubCompaniesPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubCompaniesPage.getCompaniesLabel().isDisplayed());
        Assert.assertTrue(hubCompaniesPage.getCompaniesSearchButton().isDisplayed());

        hubCompaniesPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().getText().matches("My hub"));
    }
}
