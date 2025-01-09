package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSearchPage extends BasePage {

    @FindBy(id = "My hub")
    private WebElement myHubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My contacts\"]")
    private WebElement myContactsLabel;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All contacts\"]")
    private WebElement allContactsLabel;

    @FindBy(id = "Search")
    private WebElement searchField;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "All")
    private WebElement allContactsButton;

    @FindBy(id = "No contacts available")
    private WebElement noContactsAvailableText;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear filters\"]")
    private WebElement clearFiltersButton;

    public ContactSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubButton() {
        return myHubButton;
    }

    public WebElement getMyContactsLabel() {
        return myContactsLabel;
    }

    public WebElement getAllContactsLabel() {
        return allContactsLabel;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getMyButton() {
        return myButton;
    }

    public WebElement getAllContactsButton() {
        return allContactsButton;
    }

    public WebElement getNoContactsAvailableText() {
        return noContactsAvailableText;
    }

    public WebElement getClearFiltersButton() {
        return clearFiltersButton;
    }
}
