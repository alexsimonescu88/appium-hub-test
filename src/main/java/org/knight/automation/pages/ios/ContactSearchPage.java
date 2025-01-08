package org.knight.automation.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSearchPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement myHubPageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No contacts available\"]")
    private WebElement noContactsAvailableText;

    @FindBy(name = "My")
    private WebElement myContactsButton;

    @FindBy(name = "All")
    private WebElement allContactsButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My contacts\"]")
    private WebElement myContactsTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All contacts\"]")
    private WebElement allContactsTitle;

    public ContactSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToMyHubPage() {
        myHubPageButton.click();
    }

    public String getNoContactsAvailableText() {
        return noContactsAvailableText.getText();
    }

    public void selectMyContacts() {
        myContactsButton.click();
    }

    public void selectAllContacts() {
        allContactsButton.click();
    }

    public String getMyContactsTitle() {
        return myContactsTitle.getText();
    }

    public String getAllContactsTitle() {
        return allContactsTitle.getText();
    }
}
