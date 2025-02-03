package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubContactsPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contacts\"]")
    private WebElement contactsLabel;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"magnifyingglass\"]")
    private WebElement contactsSearchButton;

    @FindBy(id = "Active contacts (4)")
    private WebElement activeContacts;

    @FindBy(id = "chevron.down")
    private WebElement contactsChevronDown;

    @FindBy(id = "chevron.up")
    private WebElement contactsChevronUp;

    @FindBy(id = "View All")
    private WebElement viewAllButton;

    public HubContactsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getContactsLabel() {
        return waitForVisibility(contactsLabel, 20);
    }

    public WebElement getContactsSearchButton() {
        return waitForClickability(contactsSearchButton, 20);
    }

    public WebElement getActiveContacts() {
        return waitForVisibility(activeContacts, 20);
    }

    public WebElement getContactsChevronDown() {
        return waitForClickability(contactsChevronDown, 20);
    }

    public WebElement getContactsChevronUp() {
        return waitForClickability(contactsChevronUp, 20);
    }

    public WebElement getViewAllButton() {
        return waitForClickability(viewAllButton, 20);
    }
}
