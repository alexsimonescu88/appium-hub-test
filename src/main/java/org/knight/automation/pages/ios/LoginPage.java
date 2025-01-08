package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    @FindBy(id = "Enter PIN")
    private WebElement pinLabel;

    @FindBy(id = "Authentication_TextField_Pin")
    private WebElement pinInputField;

    @FindBy(id = "Authentication_Button_Login")
    private WebElement loginButton;

    @FindBy(id = "PIN incorrect. Try again.")
    private WebElement incorrectPinMessage;

    @FindBy(id = "OK")
    private WebElement incorrectPinOkButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getPinLabel() {
        return waitForVisibility(pinLabel, 10);
    }

    public WebElement getPinInputField() {
        return waitForVisibility(pinInputField, 10);
    }

    public WebElement getLoginButton() {
        return waitForClickability(loginButton, 10);
    }

    public WebElement getIncorrectPinMessage() {
        return waitForVisibility(incorrectPinMessage, 0);
    }

    public WebElement getIncorrectPinOkButton() {
        return waitForClickability(incorrectPinOkButton, 10);
    }

    public void enterPin(String password) {
        waitForClickability(pinInputField, 10).sendKeys(password);
    }

    public void clickLoginButton() {
        waitForClickability(loginButton, 10).click();
    }

    public String getEnterPinLabelText() {
        return waitForVisibility(pinLabel, 10).getText();
    }

    public String getIncorrectPinMessageText() {
        return waitForVisibility(incorrectPinMessage, 10).getText();
    }
}
