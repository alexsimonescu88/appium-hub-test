package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.LoginPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test(priority = 2)
    public void testLoginWithValidCredentials_ShouldLoginSuccessfully() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.getPinInputField().getText(), "Enter PIN");

        loginPage.getPinInputField().sendKeys("200188");

        loginPage.getLoginButton().click();
        MyHubPage myHubPage = new MyHubPage(driver);
        Assert.assertTrue(myHubPage.getMyHubNavigatorBarTitle().isDisplayed());
    }

    @Test(priority = 1)
    public void testLoginWithInvalidCredentials_ShouldShowErrorMessage() {

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getPinLabel().isDisplayed());

        var incorrectPinInput = "11111";
        var pinInputFieldPlaceholder = loginPage.getPinInputField().getText();
        Assert.assertTrue(loginPage.getPinInputField().isDisplayed());

        loginPage.getPinInputField().sendKeys(incorrectPinInput);
        Assert.assertEquals(incorrectPinInput, "11111");

        loginPage.getLoginButton().click();
        var incorrectPinMessageText = loginPage.getIncorrectPinMessageText();
        Assert.assertTrue(loginPage.getIncorrectPinMessage().isDisplayed());
        Assert.assertEquals(incorrectPinMessageText, "PIN incorrect. Try again.");

        loginPage.getIncorrectPinOkButton().click();
        Assert.assertEquals(incorrectPinInput, "11111");

        loginPage.getPinInputField().clear();
        Assert.assertEquals(pinInputFieldPlaceholder, "Enter PIN");
    }
}
