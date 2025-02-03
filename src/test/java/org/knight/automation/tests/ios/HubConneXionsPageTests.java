package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubConneXionsPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubConneXionsPageTests extends BaseTest {

    @Test
    public void testAccessToHubConnecXionsPage_shouldSuccessfullyOpenHubConnecXionsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubConneXionsPage hubConneXionsPage = new HubConneXionsPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getConnexionsButton().click();
        Assert.assertTrue(hubConneXionsPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubConneXionsPage.getConneXionsLabel().isDisplayed());
        Assert.assertTrue(hubConneXionsPage.getConneXionsSearchButton().isDisplayed());

        hubConneXionsPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().getText().matches("My hub"));
    }
}
