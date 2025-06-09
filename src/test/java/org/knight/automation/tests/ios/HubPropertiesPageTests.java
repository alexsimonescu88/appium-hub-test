package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.HubPropertiesPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HubPropertiesPageTests extends BaseTest {

    @Test
    public void testAccessToHubPropertiesPage_shouldSuccessfullyAccessHubPropertiesPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubPropertiesPage hubPropertiesPage = new HubPropertiesPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getPropertiesButton().click();
        Assert.assertTrue(hubPropertiesPage.getHubButton().isDisplayed());
        Assert.assertTrue(hubPropertiesPage.getPropertiesLabel().isDisplayed());
//        Assert.assertTrue(hubPropertiesPage.getHelperText().isDisplayed());

        hubPropertiesPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().getText().matches("My hub"));
    }
}
