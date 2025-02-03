package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubContactsViewAllPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Contacts\"]")
    private WebElement contactsButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contacts\"]")
    private WebElement contactsLabel;

    public HubContactsViewAllPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getContactsButton() {
        return waitForClickability(contactsButton, 10);
    }

    public WebElement getContactsLabel() {
        return waitForVisibility(contactsLabel, 10);
    }
}
