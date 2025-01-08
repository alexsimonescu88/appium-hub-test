package org.knight.automation.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateConneXionPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement myHubPageButton;

    @FindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
    private WebElement conneXionSearchField;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"All\"]")
    private WebElement conneXionAllButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My\"]")
    private WebElement conneXionMyButton;

    @FindBy(name = "No contacts available")
    private WebElement noContactsAvailableText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My contacts\"]")
    private WebElement myContactsTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All contacts\"]")
    private WebElement allContactsTitle;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear filters\"]")
    private WebElement clearFiltersButton;

    public CreateConneXionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToMyHubPage() {
        myHubPageButton.click();
    }

    public String getNoContactsAvailableText() {
        return noContactsAvailableText.getText();
    }

    public String getMyContactsTitle() {
        return myContactsTitle.getText();
    }

    public String getAllContactsTitle() {
        return allContactsTitle.getText();
    }

    public void selectMyContacts() {
        conneXionMyButton.click();
    }

    public void selectAllContacts() {
        conneXionAllButton.click();
    }
}
