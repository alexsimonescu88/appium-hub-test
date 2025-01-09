package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage extends BasePage {

    @FindBy(id = "My hub")
    private WebElement myHubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Duplicate check\"]")
    private WebElement duplicateCheckLabel;

    @FindBy(id = "Item")
    private WebElement searchButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchLabel;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value=\"Contact name\"]")
    private WebElement nameField;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value=\"Email/Phone number\"]")
    private WebElement emailPhoneField;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value=\"Company Name/Registration Number\"]")
    private WebElement companyRegistrationField;

    @FindBy(id = "disclosure_indicator")
    private WebElement arrowRightButton;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value=\"Location\"]")
    private WebElement locationField;

    public CreateContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubButton() {
        return waitForClickability(myHubButton, 10);
    }

    public WebElement getDuplicateCheckLabel() {
        return waitForVisibility(duplicateCheckLabel, 10);
    }

    public WebElement getSearchButton() {
        return waitForClickability(searchButton, 10);
    }

    public WebElement getSearchLabel() {
        return waitForVisibility(searchLabel, 10);
    }

    public WebElement getNameField() {
        return waitForClickability(nameField, 10);
    }

    public WebElement getEmailPhoneField() {
        return waitForClickability(emailPhoneField, 10);
    }

    public WebElement getCompanyRegistrationField() {
        return waitForClickability(companyRegistrationField, 10);
    }

    public WebElement getArrowRightButton() {
        return waitForClickability(arrowRightButton, 10);
    }

    public WebElement getLocationField() {
        return waitForClickability(locationField, 10);
    }
}
