package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.LoginPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test(priority = 1)
    public void testLoginWithInvalidCredentials_ShouldShowErrorMessage() {

        // Given the login page is displayed
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getPinLabel().isDisplayed());

        // When entering invalid credentials
        String incorrectPinInput = "11111";
        String pinFieldPlaceholder = loginPage.getPinField().getText();
        Assert.assertTrue(loginPage.getPinField().isDisplayed());

        loginPage.getPinField().sendKeys(incorrectPinInput);
        Assert.assertEquals(incorrectPinInput, "11111");

        // Then
        loginPage.getLoginButton().click();
        String incorrectPinMessageText = loginPage.getIncorrectPinMessage().getText();
        Assert.assertTrue(loginPage.getIncorrectPinMessage().isDisplayed());
        Assert.assertEquals(incorrectPinMessageText, "PIN incorrect. Try again.");

        loginPage.getIncorrectPinOkButton().click();
        Assert.assertEquals(incorrectPinInput, "11111");

        loginPage.getPinField().clear();
        Assert.assertEquals(pinFieldPlaceholder, "Enter PIN");
    }

    @Test(priority = 2)
    public void testLoginWithValidCredentials_ShouldLoginSuccessfully() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.getPinField().getText(), "Enter PIN");

        loginPage.getPinField().sendKeys("200188");

        loginPage.getLoginButton().click();
        MyHubPage myHubPage = new MyHubPage(driver);
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
